package com.domain.modules.sys.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domain.modules.sys.entity.SysLogEntity;

import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 *
 * @author jim
 * @date 2020/07/13
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {

}
