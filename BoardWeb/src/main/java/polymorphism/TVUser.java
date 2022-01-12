package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
    public static void main(String[] args) {
//        SamsungTV tv = new SamsungTV();
//        tv.powerOn();
//        tv.powerOff();
//        tv.volumeUp();
//        tv.volumeDown();

//        LgTv tv = new LgTv();
//        tv.turnOn();
//        tv.turnOff();
//        tv.soundUp();
//        tv.soundDown();

//        TV tv = new SamsungTV();
//        tv.powerOn();
//        tv.powerOff();
//        tv.volumeUp();
//        tv.volumeDown();

//        BeanFactory factory = new BeanFactory();
//        TV tv = (TV) factory.getBean(args[0]);
//        tv.powerOn();
//        tv.powerOff();
//        tv.volumeUp();
//        tv.volumeDown();

        //1. Spring 컨테이너를 구동핸다.
//        AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
//        String[] beanDefinitionNames = factory.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println("beanDefinitionName = " + beanDefinitionName);
//        }
//        //2-1.Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다.
//        TV tv = (TV) factory.getBean("tv");
//        tv.powerOn();
//        tv.powerOff();
//        tv.volumeUp();
//        tv.volumeDown();

        //2-2 스프링 컨테이너로부터 필요한 객체를 요청한다.
//        TV tv1 = (TV) factory.getBean("tv");
//        TV tv2 = (TV) factory.getBean("tv");
//        TV tv3 = (TV) factory.getBean("tv");

        //3. Spring 컨테이너를 종료한다.
//        factory.close();
        AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

        TV tv = (TV)factory.getBean("tv");

        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();

        factory.close();

    }
}
