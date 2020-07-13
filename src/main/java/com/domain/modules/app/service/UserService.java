package com.domain.modules.app.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.domain.modules.app.entity.UserEntity;
import com.domain.modules.app.form.LoginForm;

/**
 * 用户
 *
 * @author jim
 * @date 2020/07/13
 */
public interface UserService extends IService<UserEntity> {

    UserEntity queryByMobile(String mobile);

    /**
     * 用户登录
     *
     * @param form 登录表单
     * @return 返回用户ID
     */
    long login(LoginForm form);
}
