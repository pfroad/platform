package com.qmall.platform;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by caoyi on 5/13/15.
 */
public class SpringContext {
    private static AbstractApplicationContext context;

    public static void init() {
        try {
            getContext();
        } catch (Exception e) {

        }
    }

    public static AbstractApplicationContext getContext() {
        if (context == null) {
            context = new ClassPathXmlApplicationContext(new String[] {"classpath*:/spring/**/*xml", "classpath*:/providers/**/*.xml"});
            context.registerShutdownHook();
        }
        return context;
    }
}
