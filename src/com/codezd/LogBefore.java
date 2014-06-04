package com.codezd;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by codezd.com on 14-6-4.
 */
public class LogBefore implements MethodBeforeAdvice {
    private static final Logger log=Logger.getLogger(LogBefore.class);
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        log.info(String.format("调用>%s的>%s方法,传入参数>%s",o.getClass(),method, Arrays.toString(objects)));
    }
}
