package com.hstn.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Order(10)
public class MYLoggingAspect {

    @Before("MyPointcutExpression.pointcutForMethods()")
    public void beforeAddUserData(JoinPoint joinPoint) {
        System.out.println("    1 Before");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("        Method: " + methodSignature);

        Object[] args = joinPoint.getArgs();
        //System.out.println("        agrs: " + Arrays.toString(args));
        for (Object arg : args) {
            System.out.println("        agr: " + arg.toString());
        }
    }

}
