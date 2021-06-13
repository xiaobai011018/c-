package com.bsc.网络编程;

import jdk.nashorn.internal.ir.CallNode;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPSend {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9998);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题");
        String s = scanner.next();
        byte[] data = s.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.233.1"), 8888);
        datagramSocket.send(datagramPacket);
        byte[] buf = new byte[1024];
        datagramPacket = new DatagramPacket(buf,buf.length);
        datagramSocket.receive(datagramPacket);
        int length = datagramPacket.getLength();
         data = datagramPacket.getData();
        String s1 = new String(data, 0, length);
        System.out.println(s1);
        datagramSocket.close();
        System.out.println("B端退出");
    }
}
