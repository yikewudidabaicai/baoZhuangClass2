package yunge.UDPandTCP.TCP.TcpUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),10086);


        /***********读取本地文件***********/
        InputStream inputStream = new FileInputStream("D://book/大数据.emmx");
        OutputStream outputStream = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1){
            outputStream.write(bytes,0,len);
            outputStream.flush();
        }

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
