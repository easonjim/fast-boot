package com.domain.modules.sys.service;

import java.util.Set;

import com.domain.modules.sys.entity.SysUserEntity;
import com.domain.modules.sys.entity.SysUserTokenEntity;

/**
 * shiro相关接口
 *
 * @author jim
 * @date 2020/07/13
 */
public interface ShiroService {
    /**
     * 获取用户权限列表
     */
    Set<String> getUserPermissions(long userId);

    SysUserTokenEntity queryByToken(String token);

    /**
     * 根据用户ID，查询用户
     *
     * @param userId
     */
    SysUserEntity queryUser(Long userId);
}
