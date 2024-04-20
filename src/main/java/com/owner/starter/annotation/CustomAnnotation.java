package com.owner.starter.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Async
 * @Trasactional
 * @Controller
 *
 * 自定义注解有哪些功能
 * 借助AOP，通过获取的注解，执行切面逻辑
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
    String value() default "This is a custom annotation";
}
