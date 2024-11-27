package com.codefrombasics.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hmap=new HashMap<>();
        hmap.put("Hari",25);
        hmap.put("Bob",30);
        hmap.put("Ganesh",34);
        hmap.put("Ragu",25);
        hmap.put("Bhaskar",30);
        hmap.put("Sathish",34);
//order will not be maintained
//        Key Hari values 25
//        Key Sathish values 34
//        Key Bob values 30
//        Key Bhaskar values 30
//        Key Ragu values 25

        int ganeshAge=hmap.get("Ganesh");
        System.out.println("Age of Ganesh is "+ganeshAge);

        //checking for keys and values
        boolean hasHari=hmap.containsKey("Hari");
        boolean hasAge34=hmap.containsValue(34);
        System.out.println(hasHari+" "+hasAge34);

        hmap.remove("Ganesh");
        System.out.println(hmap);

        //iterating over the map

//        <K,V> pairs-> EntrySet, each <K,V> ->Entry
        for(Map.Entry<String,Integer> entry:hmap.entrySet()){
            System.out.println("Key "+entry.getKey()+" value "+entry.getValue());
        }

        for(String key:hmap.keySet()){
            System.out.println("Key "+key+" values "+hmap.get(key));
        }
        System.out.println();
        System.out.println();
        //Linked Hashmap will maintain the order
        LinkedHashMap<String, Integer> linkhmap=new LinkedHashMap<>();
        linkhmap.put("Hari",25);
        linkhmap.put("Bob",30);
        linkhmap.put("Ganesh",34);
        linkhmap.put("Ragu",25);
        linkhmap.put("Bhaskar",30);
        linkhmap.put("Sathish",34);
        System.out.println(linkhmap);

        TreeMap<String, Integer> treeMapmap=new TreeMap<>();
        treeMapmap.put("Hari",25);
        treeMapmap.put("Bob",30);
        treeMapmap.put("Ganesh",34);
        treeMapmap.put("Ragu",25);
        treeMapmap.put("Bhaskar",30);
        treeMapmap.put("Sathish",34);
        System.out.println(treeMapmap);
    }
}
