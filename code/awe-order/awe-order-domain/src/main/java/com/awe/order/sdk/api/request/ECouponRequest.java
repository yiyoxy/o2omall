package com.awe.order.sdk.api.request;

import com.hbird.common.sdk.api.request.HbirdSecureRequest;
import com.awe.order.sdk.api.request.dto.ECouponRequestDto;

/**
 * ECouponRequest：电子券请求参数
 * 
 * @author ljz
 * @version 2014-12-23 10:58:06
 * 
 */
public class ECouponRequest extends HbirdSecureRequest<ECouponRequestDto> {

    /** 序列化标识 */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public ECouponRequest() {
        super();
    }

    /**
     * @param key
     * @param content
     */
    public ECouponRequest(String key, ECouponRequestDto content) {
        super(key, content);
    }
}
