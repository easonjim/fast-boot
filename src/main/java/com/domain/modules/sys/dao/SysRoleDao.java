package com.domain.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domain.modules.sys.entity.SysRoleEntity;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色管理
 *
 * @author jim
 * @date 2020/07/13
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {

    /**
     * 查询用户创建的角色ID列表
     */
    List<Long> queryRoleIdList(Long createUserId);
}
