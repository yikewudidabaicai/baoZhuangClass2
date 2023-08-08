package yunge.UDPandTCP.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),10086);
        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("abc".getBytes());

        InputStream inputStream = socket.getInputStream();
        int read = inputStream.read();
        System.out.println(read);


    }
}
