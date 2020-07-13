package com.domain.modules.sys.service.impl;

import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.domain.common.utils.PageUtils;
import com.domain.common.utils.Query;
import com.domain.modules.sys.dao.SysLogDao;
import com.domain.modules.sys.entity.SysLogEntity;
import com.domain.modules.sys.service.SysLogService;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;


@Service("sysLogService")
public class SysLogServiceImpl extends ServiceImpl<SysLogDao, SysLogEntity> implements SysLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String key = (String) params.get("key");

        IPage<SysLogEntity> page = this.page(
                new Query<SysLogEntity>().getPage(params),
                new QueryWrapper<SysLogEntity>().like(StringUtils.isNotBlank(key), "username", key)
        );

        return new PageUtils(page);
    }
}
