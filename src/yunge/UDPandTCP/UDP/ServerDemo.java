package yunge.UDPandTCP.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建Socket对象用来接收数据，指定端口号
        DatagramSocket datagramSocket = new DatagramSocket(10086);

        //定义数组用来接收数据
        byte[] bytes = new byte[1024];
        //创建数据包报对象哦用接受客户端发送来信息
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);

        //receive方法接收消息并且将数据放到数据包报中
        datagramSocket.receive(datagramPacket);

        //
        String s = new String(bytes, 0, datagramPacket.getLength());
        String s1 = new String(datagramPacket.getData());
        System.out.println(s1+"*****************");
        System.out.println(s);


    }
}
