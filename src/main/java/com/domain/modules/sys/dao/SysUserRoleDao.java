package com.domain.modules.sys.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domain.modules.sys.entity.SysUserRoleEntity;

import org.apache.ibatis.annotations.Mapper;

/**
 * 用户与角色对应关系
 *
 * @author jim
 * @date 2020/07/13
 */
@Mapper
public interface SysUserRoleDao extends BaseMapper<SysUserRoleEntity> {

    /**
     * 根据用户ID，获取角色ID列表
     */
    List<Long> queryRoleIdList(Long userId);


    /**
     * 根据角色ID数组，批量删除
     */
    int deleteBatch(Long[] roleIds);
}
