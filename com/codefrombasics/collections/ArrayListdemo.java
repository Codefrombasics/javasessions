package com.codefrombasics.collections;

import java.util.ArrayList;
import java.util.Collections;

class Emp{

}
public class ArrayListdemo {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println(arrayList);
        arrayList.add(1,45);
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));

        //update
        arrayList.set(1,567);
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        ArrayList<Emp> empArrayList=new ArrayList<>();
        empArrayList.add(new Emp());



    }
}
