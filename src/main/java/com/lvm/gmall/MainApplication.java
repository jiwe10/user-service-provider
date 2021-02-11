package com.lvm.gmall;

import java.io.IOException;
import java.util.ArrayList;

public class MainApplication {



    public static void main(String[] args) throws IOException {

        /*ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();
        System.in.read();
        System.out.println();*/
        String[] names = {"name1","name2","name3","name4"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for (String name : names) {
            System.out.println("name = " + name);
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(234);
        list.add(456);
        for (Integer integer : list) {
            System.out.println("integer = " + integer);
        }
    }

    public static void baa(boolean b){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(234);
        list.add(456);


    }
}
