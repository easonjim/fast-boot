package com.domain.modules.oss.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domain.modules.oss.entity.SysOssEntity;

import org.apache.ibatis.annotations.Mapper;

/**
 * 文件上传
 *
 * @author jim
 * @date 2020/07/13
 */
@Mapper
public interface SysOssDao extends BaseMapper<SysOssEntity> {

}
