package com.hello.webserver.controller;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;

public class InitHelloController implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws
            BeansException {
        System.out.println("BeforeInitialization : " + beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws
            BeansException{
        System.out.println("AfterInintialization : " + beanName);
        return bean;
    }
}
