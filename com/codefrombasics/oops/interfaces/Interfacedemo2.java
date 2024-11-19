package com.codefrombasics.oops.interfaces;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Interfacedemo2 {
//    var v=10;
    public static void main(String[] args) {
        One one=new One();
        Two two=new Two();
        Three three=new Three();
        one.display();
        one.show();
        two.display();
        three.display();
        var v=new ArrayList<>();
        var c=v.get(1);
        try {
            var u=new URL("google.com");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
