package com.owner.starter.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 直接对该注解进行增强
 * 增强标记有CustomAnnotation注解的前后逻辑
 */
@Slf4j
@Aspect
@Component
public class MyCustomAspect {

    @Pointcut("@annotation(com.owner.starter.annotation.CustomAnnotation)")
    public void myCustomAnnotationPointcut() {
    }

    @Around("myCustomAnnotationPointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        // 在目标方法执行前执行的逻辑
        System.out.println("Before method execution");

        // 执行目标方法
        Object result = joinPoint.proceed();

        // 在目标方法执行后执行的逻辑
        System.out.println("After method execution");

        // 返回方法执行结果
        return result;
    }
}
