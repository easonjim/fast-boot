package com.domain.modules.oss.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.domain.common.utils.PageUtils;
import com.domain.modules.oss.entity.SysOssEntity;

/**
 * 文件上传
 *
 * @author jim
 * @date 2020/07/13
 */
public interface SysOssService extends IService<SysOssEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
