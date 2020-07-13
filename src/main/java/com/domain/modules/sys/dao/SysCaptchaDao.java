package com.domain.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domain.modules.sys.entity.SysCaptchaEntity;

import org.apache.ibatis.annotations.Mapper;

/**
 * 验证码
 *
 * @author jim
 * @date 2020/07/13
 */
@Mapper
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {

}
