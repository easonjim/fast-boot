package com.domain.modules.job.dao;

import java.util.Map;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domain.modules.job.entity.ScheduleJobEntity;

import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务
 *
 * @author jim
 * @date 2020/07/13
 */
@Mapper
public interface ScheduleJobDao extends BaseMapper<ScheduleJobEntity> {

    /**
     * 批量更新状态
     */
    int updateBatch(Map<String, Object> map);
}
