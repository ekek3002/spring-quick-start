package com.springbook.injection;

import com.springbook.ioc.CollectionBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;
import java.util.Properties;

public class CollectionBeanClient {
    public static void main(String[] args) {
        AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

        CollectionBean collectionBean = (CollectionBean) factory.getBean("collectionBean");
        Properties addressList = collectionBean.getAddressList();
        for (Object address : addressList.keySet()) {
            System.out.println("address = " + address);
        }
        factory.close();
    }
}
