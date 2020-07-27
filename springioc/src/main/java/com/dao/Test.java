package com.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext classPathXmlApplicationContext
//                = new ClassPathXmlApplicationContext("classpath:spring.xml");
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(SpringConfig.class);
        IndexService indexService = (IndexService) annotationConfigApplicationContext.getBean("indexService");
        indexService.test();
        annotationConfigApplicationContext.getBean(IndexDao.class).test();
    }

}
