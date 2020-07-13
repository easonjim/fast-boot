package com.domain.datasource.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 *
 * @author jim
 * @date 2020/07/13
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface DataSource {
    String value() default "";
}
