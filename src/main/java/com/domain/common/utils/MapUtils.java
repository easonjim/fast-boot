package com.domain.common.utils;

import java.util.HashMap;


/**
 * Map工具类
 *
 * @author jim
 * @date 2020/07/13
 */
public class MapUtils extends HashMap<String, Object> {

    @Override
    public MapUtils put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
