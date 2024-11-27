package com.codefrombasics.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListdemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Guna");
        list.add("Vishnu");
        list.add("Javid");
        System.out.println(list);
        //adding element at specific index
        list.add(1,"Guru");
        System.out.println(list);
        //add element at the beginning
        list.addFirst("Kalai");
        list.addLast("Murugan");
        System.out.println(list);

        String firstElement=list.getFirst();
        String lastElement=list.getLast();
        String secondElement=list.get(1);
        System.out.println("firstelement "+firstElement);
        System.out.println("lastelement "+lastElement);
        System.out.println("secondElement "+secondElement);
        list.remove("Guna");
        System.out.println(list);
        list.remove(3);
        System.out.println("After removing from 3rd index"+list);
        list.removeFirst();
        list.removeLast();
        System.out.println("after removing 1st and last element"+list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String name:list){
            System.out.println(name);
        }

        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }
       // we can go forward and backward using ListIterator
        ListIterator<String> listIterator=list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }



    }
}
//Create a class Employee and have 10 object(name, id, salary) store it in
//arryalist, pick on those employee who is earning more than 20000