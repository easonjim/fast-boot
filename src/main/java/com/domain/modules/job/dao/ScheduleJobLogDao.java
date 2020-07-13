package com.domain.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domain.modules.job.entity.ScheduleJobLogEntity;

import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 *
 * @author jim
 * @date 2020/07/13
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {

}
