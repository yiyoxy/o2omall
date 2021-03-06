package com.awe.pms.service;

import java.util.List;

import com.awe.pms.domain.BusinessInfo;
import com.awe.pms.domain.query.BusinessInfoQuery;
import com.hbird.common.utils.page.PageUtil;

/**
 * BusinessInfoService接口
 * 
 * @author ljz
 * @version 2014-12-25 14:47:31
 * 
 */
public interface BusinessInfoService {

    /**
     * 批量增加对象信息
     * 
     * @param businessInfoList
     * @return
     */
    public boolean insert(List<BusinessInfo> businessInfoList);

    /**
     * 单个增加对象信息
     * 
     * @param businessInfo
     * @return
     */
    public boolean insert(BusinessInfo businessInfo);

    /**
     * 更新 对象信息
     * 
     * @param businessInfo
     *            对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(BusinessInfo businessInfo);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<BusinessInfo> queryBusinessInfoList(BusinessInfoQuery queryBean);

    /**
     * 根据查询Bean获取对象集合，带翻页
     * 
     * @param queryBean
     * @param pageUtil
     * @return
     */
    public List<BusinessInfo> queryBusinessInfoListWithPage(BusinessInfoQuery queryBean,
            PageUtil pageUtil);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param businessInfo
     *            　
     * @return
     */
    public boolean delete(BusinessInfo businessInfo);

    /**
     * 根据主键获取对象信息
     * 
     * @param id
     *            主键字段
     * @return 对象信息
     */
    public BusinessInfo getBusinessInfoById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param businessInfos
     *            BusinessInfo集合
     * @return
     */
    public boolean delete(BusinessInfo[] businessInfos);
}
