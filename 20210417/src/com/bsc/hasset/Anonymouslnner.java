package com.bsc.hasset;

public class Anonymouslnner {
    public static void main(String[] args) {
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎哭");
            }
        };
        tiger.cry();
        System.out.println(tiger.getClass());
        IA tiger1 = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎哭");
            }
        };
        System.out.println(tiger1.getClass());
    }
}
interface IA {
    public void cry();
}
