package com.awe.rems.sdk.request;

import com.hbird.common.sdk.api.request.HbirdSecureRequest;
import com.awe.rems.sdk.request.dto.ReturnExchangeRequestDto;

/**
 * ReturnExchangeRequest：退换货请求参数
 * 
 * @author ljz
 * @version 2014-12-25 9:16:23
 * 
 */
public class ReturnExchangeRequest extends HbirdSecureRequest<ReturnExchangeRequestDto> {

    /** 序列化标识 */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public ReturnExchangeRequest() {
        super();
    }

    /**
     * @param key
     * @param content
     */
    public ReturnExchangeRequest(String key, ReturnExchangeRequestDto content) {
        super(key, content);
    }
}
