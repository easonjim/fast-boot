package com.domain.modules.sys.form;

import lombok.Data;

/**
 * 登录表单
 *
 * @author jim
 * @date 2020/07/13
 */
@Data
public class SysLoginForm {
    private String username;
    private String password;
    private String captcha;
    private String uuid;


}
