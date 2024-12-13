package java8features;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

public class Streamingdemo {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5);
        for(Integer i: list){
            System.out.println(i);
        }

        List<Integer> squares=  list.stream().map(value->value*value).collect(Collectors.toList());
        System.out.println(squares);
        List<Integer> even=  list.stream().filter(value->value%2==0).collect(Collectors.toList());
        System.out.println(even);
        list.stream().map(value->value*value).forEach(System.out::println);

        System.out.println(Instant.now());
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();

        System.out.println("Date "+date+" time"+time);

        ScriptEngine engine=new ScriptEngineManager().getEngineByName("nashorn");
        try {
            engine.eval("print('Hello from javascript')");
        } catch (ScriptException e) {
            throw new RuntimeException(e);
        }
    }

}
