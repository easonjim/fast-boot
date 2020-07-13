package com.domain.modules.sys.service;


import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.domain.common.utils.PageUtils;
import com.domain.modules.sys.entity.SysLogEntity;


/**
 * 系统日志
 *
 * @author jim
 * @date 2020/07/13
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
