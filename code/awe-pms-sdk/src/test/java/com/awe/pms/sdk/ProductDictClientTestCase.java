package com.awe.pms.sdk;

import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;

import com.awe.pms.sdk.request.dto.ProductDictRequestDto;
import com.awe.pms.sdk.response.dto.ProductDictResponseDto;

/**
 * ProductDictClient测试用例
 * 
 * @author ljz
 * @version 2014-12-25 17:50:15
 * 
 */
public class ProductDictClientTestCase {
    String WS_DOMAIN = "http://dev.pmsws.shop.hbird.com/";
    // String WS_DOMAIN = "http://local.pmsws.shop.hbird.com:8090/";
    private ProductDictClient client;

    @Before
    public void init() throws Exception {
        client = new ProductDictClient();
        client.setServiceUrlDomain(WS_DOMAIN);
        client.setKey("pms");
        client.setConnectTimeout(3000);
        client.setReadTimeout(3000);
        client.afterPropertiesSet();
    }

    @Test
    public void testGetProductDict() {
        ProductDictRequestDto requestDto = new ProductDictRequestDto();
        requestDto.setId(1l);
        
        ProductDictResponseDto productDictResponseDto = client.getProductDict(requestDto);
        Assert.notNull(productDictResponseDto);
    } 

}
