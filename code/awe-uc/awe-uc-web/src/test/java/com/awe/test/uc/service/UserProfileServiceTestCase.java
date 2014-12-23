package com.awe.test.uc.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.awe.uc.domain.UserProfile;
import com.awe.uc.domain.query.UserProfileQuery;
import com.awe.uc.service.UserProfileService;
import com.awe.uc.utils.exceptions.ExistedException;
import com.hbird.common.utils.page.PageUtil;
import com.awe.test.base.BaseTransactionTestCase;
import com.awe.test.base.TestConstants;

/**
 * UserProfileService单元测试
 * 
 * @author ljz
 * @version 2014-12-23 10:06:48
 * 
 */
public class UserProfileServiceTestCase extends BaseTransactionTestCase {

    /** 不存在的 ID-删改查-失败的测试用例 */
    private static final long TEST_NOT_EXIST_ID = -2L;
    
    /** 默认 存在的ID-删改查-成功的测试用例,数据库需存在改ID对应的数据 */
    private static final long TEST_DEFAULT_EXIST_ID = 1L;

    @Autowired
    private UserProfileService userProfileService;

    /**
     * 测试插入数据-成功
     */
    @Test
    public void testInsert() {
        Assert.notNull(userProfileService);
        UserProfile userProfile = new UserProfile();
        Long userId = null; //TODO 初始化
        userProfile.setUserId(userId);
        String cnname = null; //TODO 初始化
        userProfile.setCnname(cnname);
        userProfile.setCreateUser(TestConstants.UER_NAME);
        boolean result = userProfileService.insert(userProfile);
        Assert.isTrue(result);
    }

    /**
     * 测试插入数据-失败（重复、错误、长度越界等）
     */
    @Test
    public void testInsertFailure() {
        Assert.notNull(userProfileService);
        UserProfile userProfile = new UserProfile();
        Long userId = null; //TODO 初始化// 已经存在的
        userProfile.setUserId(userId);
        String cnname = null; //TODO 初始化// 已经存在的
        userProfile.setCnname(cnname);
        userProfile.setCreateUser(TestConstants.UER_NAME);
        ExistedException ex = null;
        try {
            boolean result = userProfileService.insert(userProfile);
            Assert.isTrue(!result);
        } catch (ExistedException e) {
            ex = e;
        }
        Assert.notNull(ex);
    }

    /**
     * 测试删除数据-成功
     */
    @Test
    public void testDelete() {
        Assert.notNull(userProfileService);
        UserProfile userProfile = new UserProfile();
        userProfile.setId(TEST_DEFAULT_EXIST_ID);
        Long userId = null; //TODO 初始化
        userProfile.setUserId(userId);
        String cnname = null; //TODO 初始化
        userProfile.setCnname(cnname);
        userProfile.setUpdateUser(TestConstants.UER_NAME);
        boolean result = userProfileService.delete(userProfile);
        Assert.isTrue(result);
    }
    
    /**
     * 测试删除数据-失败（ID不存在等）
     */
    @Test
    public void testDeleteFailure() {
        Assert.notNull(userProfileService);
        UserProfile userProfile = new UserProfile();
        userProfile.setId(TEST_NOT_EXIST_ID);// 不存在的ID
        Long userId = null; //TODO 初始化
        userProfile.setUserId(userId);
        String cnname = null; //TODO 初始化
        userProfile.setCnname(cnname);
        userProfile.setUpdateUser(TestConstants.UER_NAME);
        boolean result = userProfileService.delete(userProfile);
        Assert.isTrue(!result);
    }

    /**
     * 测试修改数据-成功
     */
    @Test
    public void testUpdate() {
        Assert.notNull(userProfileService);
        UserProfile userProfile = new UserProfile();
        userProfile.setId(TEST_DEFAULT_EXIST_ID);
        Long userId = null; //TODO 初始化
        userProfile.setUserId(userId);
        String cnname = null; //TODO 初始化
        userProfile.setCnname(cnname);
        userProfile.setUpdateUser(TestConstants.UER_NAME);
        boolean result = userProfileService.update(userProfile);
        Assert.isTrue(result);
    }

    /**
     * 测试修改数据-失败（ID不存在等）
     */
    @Test
    public void testUpdateFailure() {
        Assert.notNull(userProfileService);
        UserProfile userProfile = new UserProfile();
        userProfile.setId(TEST_NOT_EXIST_ID);// 不存在的ID
        Long userId = null; //TODO 初始化
        userProfile.setUserId(userId);
        String cnname = null; //TODO 初始化
        userProfile.setCnname(cnname);
        userProfile.setUpdateUser(TestConstants.UER_NAME);
        boolean result = userProfileService.update(userProfile);
        Assert.isTrue(!result);
    }

    /**
     * 测试依据ID查询数据-成功
     */
    @Test
    public void testQuery() {
        Assert.notNull(userProfileService);
        UserProfile c = userProfileService.getUserProfileById(TEST_DEFAULT_EXIST_ID);
        Assert.notNull(c);
    }

    /**
     * 测试依据ID查询数据-失败（ID不存在等）
     */
    @Test
    public void testQueryFailure() {
        Assert.notNull(userProfileService);
        UserProfile c = userProfileService.getUserProfileById(TEST_NOT_EXIST_ID);// 不存在的ID
        Assert.isNull(c);
    }

    /**
     * 测试分页查询数据-成功
     */
    @Test
    public void testQueryWithPage() {
        Assert.notNull(userProfileService);
        UserProfileQuery queryBean = null;
        PageUtil pageUtil = null;
        List<UserProfile> list = userProfileService.queryUserProfileListWithPage(
                queryBean, pageUtil);
        Assert.notEmpty(list);
        logger.info("list size = " + list.size());
    }

    /**
     * 测试查询数据集合-成功
     */
    @Test
    public void testQueryList() {
        Assert.notNull(userProfileService);
        UserProfileQuery queryBean = new UserProfileQuery();
        Long userId = null; //TODO 初始化
        queryBean.setUserId(userId);
        String cnname = null; //TODO 初始化
        queryBean.setCnname(cnname);
        List<UserProfile> list = userProfileService.queryUserProfileList(queryBean);
        Assert.notEmpty(list);
        logger.info("list size = " + list.size());
    }
}