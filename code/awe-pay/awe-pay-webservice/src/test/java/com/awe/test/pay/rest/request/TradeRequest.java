package com.awe.test.pay.rest.request;

import com.hbird.common.sdk.api.request.HbirdSecureRequest;
import com.awe.test.pay.rest.request.dto.TradeRequestDto;

/**
 * TradeRequest：正向交易请求参数
 * 
 * @author ljz
 * @version 2014-12-23 10:06:28
 * 
 */
public class TradeRequest extends HbirdSecureRequest<TradeRequestDto> {

    /** 序列化标识 */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public TradeRequest() {
        super();
    }

    /**
     * @param key
     * @param content
     */
    public TradeRequest(String key, TradeRequestDto content) {
        super(key, content);
    }
}
