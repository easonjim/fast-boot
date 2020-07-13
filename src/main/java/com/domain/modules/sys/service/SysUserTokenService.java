package com.domain.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.domain.common.utils.R;
import com.domain.modules.sys.entity.SysUserTokenEntity;

/**
 * 用户Token
 *
 * @author jim
 * @date 2020/07/13
 */
public interface SysUserTokenService extends IService<SysUserTokenEntity> {

    /**
     * 生成token
     *
     * @param userId 用户ID
     */
    R createToken(long userId);

    /**
     * 退出，修改token值
     *
     * @param userId 用户ID
     */
    void logout(long userId);

}
