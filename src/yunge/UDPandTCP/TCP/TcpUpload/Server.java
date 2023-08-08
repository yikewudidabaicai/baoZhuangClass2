package yunge.UDPandTCP.TCP.TcpUpload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //C:\Users\aq\Desktop\云和数据资料\大数据.emmx
        ServerSocket serverSocket = new ServerSocket(10086);
        Socket accept = serverSocket.accept();

        OutputStream outputStream = new FileOutputStream("C:\\Users\\aq\\Desktop\\云和数据资料\\大数据.emmx");
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes))!= -1){
            outputStream.write(bytes,0,len);
            System.out.println(new String(bytes,0,len));
            outputStream.flush();
        }
        outputStream.close();
        inputStream.close();
        serverSocket.close();



    }
}
