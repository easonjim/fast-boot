package com.domain.modules.oss.service.impl;

import java.util.Map;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.domain.common.utils.PageUtils;
import com.domain.common.utils.Query;
import com.domain.modules.oss.dao.SysOssDao;
import com.domain.modules.oss.entity.SysOssEntity;
import com.domain.modules.oss.service.SysOssService;

import org.springframework.stereotype.Service;


@Service("sysOssService")
public class SysOssServiceImpl extends ServiceImpl<SysOssDao, SysOssEntity> implements SysOssService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SysOssEntity> page = this.page(
                new Query<SysOssEntity>().getPage(params)
        );

        return new PageUtils(page);
    }

}
