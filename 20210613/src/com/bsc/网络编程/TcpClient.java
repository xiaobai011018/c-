package com.bsc.网络编程;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要发送的内容");
        String s = scanner.nextLine();
        bufferedWriter.write(s);
        bufferedWriter.newLine();
        bufferedWriter.flush();
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s1 = bufferedReader.readLine();
        System.out.println(s1);
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
    }
}
