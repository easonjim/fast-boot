package com.domain.common.validator;

import com.domain.common.exception.RRException;

import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 *
 * @author jim
 * @date 2020/07/13
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new RRException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new RRException(message);
        }
    }
}
