package com.awe.mall.service;

import java.util.List;

import com.awe.mall.domain.dto.OrderInfo;
import com.awe.order.sdk.request.dto.ShoppingCartRequestDto;



/**
 * 订单信息
 *OrderInfoService	
 *
 * @author js
 * @version：2015年1月9日 下午5:33:29
 */
public interface OrderInfoService {


	/**
	 * 根据skuno查询商品信息
	 * Date:2015年1月10日下午1:37:01
	 * user:js
	 * @param dataList
	 * @return
	 */
	List<OrderInfo> getOrderInfoBySkuNo(List<ShoppingCartRequestDto> dataList);
	
	
}
