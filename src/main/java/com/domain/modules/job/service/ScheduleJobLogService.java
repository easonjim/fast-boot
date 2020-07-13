package com.domain.modules.job.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.domain.common.utils.PageUtils;
import com.domain.modules.job.entity.ScheduleJobLogEntity;

/**
 * 定时任务日志
 *
 * @author jim
 * @date 2020/07/13
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
