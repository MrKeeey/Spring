package com.hstn.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(30)
public class Adminka {

    @Before("MyPointcutExpression.pointcutForMethods()")
    public void beforeAdmin() {
        System.out.println("    3 Before");
    }
}
