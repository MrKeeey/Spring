package com.hstn.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyPointcutExpression {

//    @Pointcut("execution( * com.hstn.aop.dao.*.*(..) )")
//    public void pointcutForMethods() {
//    }

    @Pointcut("execution( * com.hstn.aop.dao.*.get*(..) )")
    public void pointcutForGetters() {
    }

    @Pointcut("execution( * com.hstn.aop.dao.*.set*(..) )")
    public void pointcutForSetters() {
    }

    @Pointcut("pointcutForSetters() || pointcutForGetters()")
    public void pointcutForSettersAndGetters() {
    }

    @Pointcut("pointcutForMethods() && !(pointcutForSetters() || pointcutForGetters())")
    public void pointcutNotForSettersAndGetters() {
    }

}
