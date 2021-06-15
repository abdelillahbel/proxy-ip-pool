package com.chqiuu.proxy.modules.pool.service;

import com.chqiuu.proxy.modules.pool.entity.ProxyIpEntity;
import com.chqiuu.proxy.modules.pool.query.ProxyIpListQuery;
import com.chqiuu.proxy.modules.pool.query.ProxyIpPageQuery;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.chqiuu.proxy.modules.pool.dto.ProxyIpDetailDTO;
import com.chqiuu.proxy.modules.pool.dto.ProxyIpListDTO;

/**
 * 代理IP业务逻辑层接口
 *
 * @author chqiuu
 * @date 2021年6月11日
 */
public interface ProxyIpService  extends IService<ProxyIpEntity> {

    /**
     * 根据唯一ID获取详细信息
     *
     * @param proxyId 唯一ID
     * @return 详细信息
     */
    ProxyIpDetailDTO getDetailById(String proxyId);
    /**
    * 代理IP列表查询
    * @param query       查询对象
    * @return 代理IP列表
    */
    List<ProxyIpListDTO> getList(ProxyIpListQuery query);
    /**
     * 代理IP分页查询
     * @param query       分页查询对象
     * @return 代理IP列表（带分页）
     */
    IPage<ProxyIpListDTO> getPage(ProxyIpPageQuery query);
}