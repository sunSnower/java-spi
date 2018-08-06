package com.demo;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args){
        /**
         * 按照META-INF.service依次加载实现接口
         */
        ServiceLoader<IRepository> serviceLoader = ServiceLoader.load(IRepository.class);
        Iterator<IRepository> iterator = serviceLoader.iterator();
        while(iterator != null && iterator.hasNext()){
            IRepository demoService = iterator.next();
            System.out.println("class: " + demoService.getClass().getName());
            demoService.save("12345, 上山打老虎");
        }
    }
}
