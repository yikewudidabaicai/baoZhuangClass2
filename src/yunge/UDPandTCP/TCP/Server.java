package yunge.UDPandTCP.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器端
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        Socket accept = serverSocket.accept();

        InputStream inputStream = accept.getInputStream();
        System.out.println(inputStream.read());

        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("def".getBytes());


    }

}
