package com.domain.modules.oss.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;


/**
 * 文件上传
 *
 * @author jim
 * @date 2020/07/13
 */
@Data
@TableName("sys_oss")
public class SysOssEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;
    //URL地址
    private String url;
    //创建时间
    private Date createDate;

}
