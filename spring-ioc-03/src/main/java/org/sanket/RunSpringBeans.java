package org.sanket;

import org.sanket.engine.DieselEngine;
import org.sanket.engine.PetrolEngine;
import org.sanket.engine.StartEngineBy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpringBeans {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

        PetrolEngine petrolEngine= context.getBean(PetrolEngine.class);

        StartEngineBy startEnginerBean= context.getBean(StartEngineBy.class);

        startEnginerBean.statTheEngine(10);

        System.out.println(petrolEngine.hashCode());

//        DieselEngine dieselEngine= context.getBean(DieselEngine.class);
//        StartEngineBy startEngineBys= new StartEngineBy(dieselEngine);
//        startEngineBys.statTheEngine(10);
//        System.out.println(dieselEngine.hashCode());


    }
}
