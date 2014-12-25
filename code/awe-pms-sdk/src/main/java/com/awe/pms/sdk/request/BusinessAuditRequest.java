package com.awe.pms.sdk.request;

import com.hbird.common.sdk.api.request.HbirdSecureRequest;
import com.awe.pms.sdk.request.dto.BusinessAuditRequestDto;

/**
 * BusinessAuditRequest：审核商家流水表请求参数
 * 
 * @author ljz
 * @version 2014-12-25 9:31:58
 * 
 */
public class BusinessAuditRequest extends HbirdSecureRequest<BusinessAuditRequestDto> {

    /** 序列化标识 */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public BusinessAuditRequest() {
        super();
    }

    /**
     * @param key
     * @param content
     */
    public BusinessAuditRequest(String key, BusinessAuditRequestDto content) {
        super(key, content);
    }
}
