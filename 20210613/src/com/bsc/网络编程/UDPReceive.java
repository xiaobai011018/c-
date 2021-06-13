package com.bsc.网络编程;



import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        System.out.println("等待接收数据");
        datagramSocket.receive(datagramPacket);
        int length = datagramPacket.getLength();
        byte[] data = datagramPacket.getData();
        String s = new String(data, 0, length);
        String answer = "";
        if ("四大名著".equals(s)){
            answer = "<西游记> <水浒传> <三国演义> <红楼梦>";
        }else {
            answer = "what";
        }
        data = answer.getBytes();
        datagramPacket = new DatagramPacket(data,data.length, InetAddress.getByName("192.168.233.1"),9998);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
        System.out.println("A端退出");
    }
}
