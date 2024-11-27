package com.codefrombasics.collections;


public class Enumdemo {

    public static void main(String[] args) {
        Months thisMonth = Months.JUNE;

        String currentMOnth = switch (thisMonth) {
            case NOVEMBER, DECEMBER, OCTOBER -> "Winter";
            case APRIL, MAY, JUNE -> "Summer";

            default -> {
                throw new RuntimeException("No such month");
            }
        };
        System.out.println(currentMOnth);
    }
}
