package com.domain.common.utils;

/**
 * Redis所有Keys
 *
 * @author jim
 * @date 2020/07/13
 */
public class RedisKeys {

    public static String getSysConfigKey(String key) {
        return "sys:config:" + key;
    }
}
