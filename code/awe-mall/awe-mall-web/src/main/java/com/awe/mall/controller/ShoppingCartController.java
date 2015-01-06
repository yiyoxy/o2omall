package com.awe.mall.controller;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.awe.mall.controller.base.BaseController;
import com.awe.mall.service.ShoppingCartService;
import com.awe.order.sdk.request.dto.ShoppingCartRequestDto;
import com.awe.order.sdk.response.dto.ShoppingCartResponseDto;
import com.hbird.common.utils.wrap.WrapMapper;
import com.hbird.common.utils.wrap.Wrapper;
import com.hbird.common.web.context.UserContext;
/**
 * 购物车控制器
 * @author zyq
 * @version 1.0.0.0
 * @since 2015-1-6
 */
@Controller
@RequestMapping("cart")
public class ShoppingCartController extends BaseController{

	private static final Log LOG = LogFactory.getLog(ShoppingCartController.class);
	private static final String VIEW_ADD_CART_SUCCESS = "cart/addCartSuccess";
	private static final String VIEW_LIST_CART = "cart/myCart";
	
	
	@Autowired
	private ShoppingCartService shoppingCartService;
	/**
	 * 添加购物车
	 * @param model
	 * @param skuNo
	 * @param skuCount
	 * @return
	 */
	@RequestMapping(value = "addCart", method = RequestMethod.GET)
	public String addCart(Model model,String skuNo,String skuCount){
		if(StringUtils.isEmpty(skuNo) || StringUtils.isEmpty(skuCount)){
			return "";//转到异常页面
		}
		try {
			ShoppingCartRequestDto requestDto = new ShoppingCartRequestDto();
			requestDto.setSkuNo(skuNo);
			requestDto.setSkuCount(Integer.valueOf(skuCount));
			requestDto.setUserNo(UserContext.get().getUserId().toString());
			requestDto.setCreateUser(UserContext.get().getCnName());
			requestDto.setUpdateUser(UserContext.get().getCnName());
			//调用商品接口查出其它字段
			Wrapper<?> wrapper = shoppingCartService.addShoppingCart(requestDto);
			if(wrapper.isSuccess()){
				return VIEW_ADD_CART_SUCCESS;
			}else{
				return "";//转到异常页面
			}
		} catch (Exception e) {
			LOG.error("#ShoppingCartController.addCart# Error:" + e);
			return "";//转到异常页面
		}
	}
	/**
	 * 我的购物车列表
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "listCart", method = RequestMethod.GET)
	public String listCart(Model model){
		try {
			ShoppingCartRequestDto requestDto = new ShoppingCartRequestDto();
			requestDto.setUserNo(UserContext.get().getUserId().toString());
			//调用商品接口查出其它字段
			List<ShoppingCartResponseDto> responseDtoList = shoppingCartService.queryShoppingCartList(requestDto);
			model.addAttribute("dataList", responseDtoList);
			return VIEW_LIST_CART;
		} catch (Exception e) {
			LOG.error("#ShoppingCartController.listCart# Error:" + e);
			return "";//转到异常页面
		}
	}
	/**
	 * 删除购物车中商品
	 * @param model
	 * @param skuNo
	 * @return
	 */
	@RequestMapping(value = "deleteCart", method = RequestMethod.GET)
	public Wrapper<?> deleteCart(Model model,String shoppingCartId){
		if(StringUtils.isEmpty(shoppingCartId)){
			return WrapMapper.error();
		}
		try {
			ShoppingCartRequestDto requestDto = new ShoppingCartRequestDto();
			requestDto.setId(Long.valueOf(shoppingCartId));
			Wrapper<?> wrapper = shoppingCartService.deleteShoppingCartById(requestDto);
			if (null != wrapper) {
                return wrapper;
            } else {
            	LOG.error("deleteCart fail.");
                return WrapMapper.error();
            }
		} catch (Exception e) {
			LOG.error("#ShoppingCartController.deleteCart# Error:" + e);
			return WrapMapper.error();
		}
	}
	/**
	 * 购物车列表中增加或减少商品数据量
	 * @param model
	 * @param shoppingCartId
	 * @param skuCount
	 * @return
	 */
	@RequestMapping(value = "updateCart", method = RequestMethod.GET)
	public Wrapper<?> updateCart(Model model,String shoppingCartId,String skuCount){
		if(StringUtils.isEmpty(shoppingCartId) || StringUtils.isEmpty(skuCount)){
			return WrapMapper.error();
		}
		try {
			ShoppingCartRequestDto requestDto = new ShoppingCartRequestDto();
			requestDto.setId(Long.valueOf(shoppingCartId));
			requestDto.setSkuCount(Integer.valueOf(skuCount));
			Wrapper<?> wrapper = shoppingCartService.updateShoppingCart(requestDto);
			if (null != wrapper) {
                return wrapper;
            } else {
            	LOG.error("updateCart fail.");
                return WrapMapper.error();
            }
		} catch (Exception e) {
			LOG.error("#ShoppingCartController.updateCart# Error:" + e);
			return WrapMapper.error();
		}
	}
}
