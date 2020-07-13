package com.domain.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domain.modules.sys.entity.SysUserTokenEntity;

import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户Token
 *
 * @author jim
 * @date 2020/07/13
 */
@Mapper
public interface SysUserTokenDao extends BaseMapper<SysUserTokenEntity> {

    SysUserTokenEntity queryByToken(String token);

}
