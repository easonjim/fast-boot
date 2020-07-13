package com.domain.modules.app.annotation;

import java.lang.annotation.*;

/**
 * app登录效验
 *
 * @author jim
 * @date 2020/07/13
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Login {
}
