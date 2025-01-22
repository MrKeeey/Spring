package com.hstn.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MYLoggingAspect {

    @Before("execution( public void com.hstn.aop.dao.UserDataDAO.addUserData() )")
    public void beforeAddUserData(JoinPoint joinPoint) {
        System.out.println("11111111111111111111111\nBefore addUserData");
    }
}
