package com.bsc.fileinputstream;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.junit.jupiter.api.Test;

import java.io.*;

public class FileInput {
    public static void main(String[] args) throws IOException {
        String path = "e:\\bsc.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String s = bufferedReader.readLine();
        System.out.println(s);

        bufferedReader.close();
    }
    @Test
    public void func01() throws IOException {
        String path = "e:\\bsc.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((new FileInputStream(path)), "gbk"));
        String s = bufferedReader.readLine();
        System.out.println(s);
    }
    @Test
    public void fileInputTest01(){
        String str = "e://text.txt";
        byte[] bytes = new byte[8];
        FileInputStream fileInputStream = null;
        int len = 0;
        try {
             fileInputStream = new FileInputStream(str);
             while ((len=fileInputStream.read(bytes))!=-1){
                 System.out.print(new String(bytes,0,len));
             }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
