package com.bsc.customgeneric;

import java.util.ArrayList;

public class IA {
    public static void main(String[] args) {

    }
}
class Ic implements IB<String,Integer> {

    @Override
    public void func(String s) {

    }

    @Override
    public void func2(Integer integer) {

    }
}
interface IB<T,Y>{
    void func(T t);
    void func2(Y y);
}
