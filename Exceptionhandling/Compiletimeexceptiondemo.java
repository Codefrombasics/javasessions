package Exceptionhandling;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

//public class Compiletimeexceptiondemo {
//    public static void main(String[] args) {
//        URL url= null;
//        try {
//            url = new URL("http://www.google.com:8080?name=dinesh");
//            BufferedReader bufferedReader=new BufferedReader(new FileReader(""))
//        } catch (MalformedURLException|FileNotFoundException e) {//super class exceptions will handle the child class Exception
//            throw new RuntimeException(e);
//        }
//        String str= url.getQuery();
//        System.out.println(str);
//    }
//}
public class Compiletimeexceptiondemo {
    public static void main(String[] args) throws IOException{
        URL url= null;

            url = new URL("http://www.google.com:8080?name=dinesh");
            BufferedReader bufferedReader=new BufferedReader(new FileReader(""));
        String str= url.getQuery();
        System.out.println(str);
    }
}
