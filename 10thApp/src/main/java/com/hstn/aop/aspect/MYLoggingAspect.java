package com.hstn.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MYLoggingAspect {

    @Pointcut("execution( * com.hstn.aop.dao.*.*(..) )")
    private void pointcutForMethods() {
    }

    @Pointcut("execution( * com.hstn.aop.dao.*.get*(..) )")
    private void pointcutForGetters() {
    }

    @Pointcut("execution( * com.hstn.aop.dao.*.set*(..) )")
    private void pointcutForSetters() {
    }

    @Pointcut("pointcutForSetters() || pointcutForGetters()")
    private void pointcutForSettersAndGetters() {
    }

    @Pointcut("pointcutForMethods() && !(pointcutForSetters() || pointcutForGetters())")
    private void pointcutNotForSettersAndGetters() {
    }

    @Before("pointcutNotForSettersAndGetters()")
    public void beforeAddUserData() {
        System.out.println("    1 Before");
    }

//    @Before("pointcutForMethods()")
//    public void beforeAdmin() {
//        System.out.println("    3 Before");
//    }
}
