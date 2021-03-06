package com.awe.rems.sdk;

import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;

import com.awe.rems.sdk.request.dto.ReturnExchangeRequestDto;
import com.awe.rems.sdk.response.dto.ReturnExchangeResponseDto;

/**
 * ReturnExchangeClient测试用例
 * 
 * @author ljz
 * @version 2014-12-25 17:54:00
 * 
 */
public class ReturnExchangeClientTestCase {
    String WS_DOMAIN = "http://dev.remsws.shop.hbird.com/";
    // String WS_DOMAIN = "http://local.remsws.shop.hbird.com:8090/";
    private ReturnExchangeClient client;

    @Before
    public void init() throws Exception {
        client = new ReturnExchangeClient();
        client.setServiceUrlDomain(WS_DOMAIN);
        client.setKey("rems");
        client.setConnectTimeout(3000);
        client.setReadTimeout(3000);
        client.afterPropertiesSet();
    }

    @Test
    public void testGetReturnExchange() {
        ReturnExchangeRequestDto requestDto = new ReturnExchangeRequestDto();
        requestDto.setId(1l);
        
        ReturnExchangeResponseDto returnExchangeResponseDto = client.getReturnExchange(requestDto);
        Assert.notNull(returnExchangeResponseDto);
    } 

}
