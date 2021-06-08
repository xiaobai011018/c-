
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.text.StringContent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String str = "";
        while((str=bufferedReader.readLine())!=null){
            System.out.println(str);
        }
//        byte[] bytes = new byte[1024];
//        int len = 0;
//        while ((len=inputStream.read(bytes))!=-1){
//            System.out.println(new String(bytes,0,len));
//        }
        bufferedReader.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
