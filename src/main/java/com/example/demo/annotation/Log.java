package com.example.demo.annotation;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.FIELD;


/**
 * 自定义Log注解 通过注解方式动态注入到Spring容器中 避免每次手动书写
 *
 * @Log
 * private Looger log;
 *
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface Log {


}
