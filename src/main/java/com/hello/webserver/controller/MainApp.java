package com.hello.webserver.controller;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class MainApp {
    public static void main(String[] args){
//        XmlBeanFactory factory = new XmlBeanFactory(
//                new ClassPathResource("Beans.xml")
//        );
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/Beans.xml");
        HelloController objA = (HelloController) context.getBean("helloWorld");
        objA.getMessage1();
        objA.getMessage2();

        HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();

        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();

//        ((FileSystemXmlApplicationContext) context).registerShutdownHook();
//        objA.setMessage("I'm object A");
//        objA.getMessage();
//        HelloController objB = (HelloController) context.getBean("helloWorld");
//        objB.getMessage();
        JavaCollection jc = (JavaCollection)context.getBean("javaCollection");
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();


    }
}
