package com.codezd;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by codezd.com on 14-6-4.
 */
public class LogAfter implements AfterReturningAdvice {
    private static final Logger log=Logger.getLogger(LogBefore.class);
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o2) throws Throwable {
       log.info(String.format("调用>%s的>%s方法，传入参数>%s返回值>%s",o2.getClass(),method,objects,o));
    }
}
