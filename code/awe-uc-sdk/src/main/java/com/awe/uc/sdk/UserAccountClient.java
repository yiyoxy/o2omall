package com.awe.uc.sdk;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;

import com.hbird.common.client.AbstractSecureClient;
import com.hbird.common.utils.serialize.JsonHelper;
import com.awe.uc.sdk.request.UserAccountRequest;
import com.awe.uc.sdk.request.dto.UserAccountRequestDto;
import com.awe.uc.sdk.response.UserAccountResponse;
import com.awe.uc.sdk.response.dto.UserAccountResponseDto;

/**
 * 用户账号服务的客户端
 * 
 * @author ljz
 * @version 2014-12-25 17:48:01
 * 
 */
public class UserAccountClient extends AbstractSecureClient {
    
    private final static Log LOG = LogFactory.getLog(UserAccountClient.class);

    /**
     * 用户账号查询服务
     * 
     * @param request
     *            查询请求对象
     * @return UserAccountResponseDto 接口返回的数据对象
     */
    public UserAccountResponseDto getUserAccount(UserAccountRequestDto requestDto) {
        Assert.notNull(requestDto);

        UserAccountRequest request = new UserAccountRequest(super.getKey(), requestDto);
        
        if (LOG.isDebugEnabled()) {
            LOG.debug("getUserAccount request: " + JsonHelper.toJson(request));
        }

        String url = super.getServiceUrlDomain() + "services/userAccount/getUserAccount";
        UserAccountResponse response = super.getRestTemplate().postForObject(url, request, UserAccountResponse.class);

        if (LOG.isDebugEnabled()) {
            LOG.debug("getUserAccount url: " + url);
            LOG.debug("getUserAccount response: " + JsonHelper.toJson(response));
        }
        return super.getResult(response);
    }
}
