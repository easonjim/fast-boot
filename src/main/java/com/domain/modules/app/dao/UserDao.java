package com.domain.modules.app.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domain.modules.app.entity.UserEntity;

import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 *
 * @author jim
 * @date 2020/07/13
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
