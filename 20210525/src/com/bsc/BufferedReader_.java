package com.bsc;

public class BufferedReader_ {
    private Reader_ in;
    public BufferedReader_(Reader_ reader_){
        in = reader_;
    }
    public void readFile(){
        in.readFile();
    }
    public void readString(){
        in.readString();
    }
}
