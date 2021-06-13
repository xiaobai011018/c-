package com.bsc.网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpSever {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        String answer = "";
        if ("name".equals(s)){
            answer = "柏诗成";
        }else if ("hobby".equals(s)){
            answer = "写Java程序";
        }else {
            answer = "你说啥";
        }
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write(answer);
        bufferedWriter.flush();
        bufferedWriter.newLine();
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
