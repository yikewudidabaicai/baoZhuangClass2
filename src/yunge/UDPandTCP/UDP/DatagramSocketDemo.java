package yunge.UDPandTCP.UDP;

import yunge.UDPandTCP.InetAddressDemo;

import java.io.IOException;
import java.net.*;

/**
 *UDP发送数据
 */
public class DatagramSocketDemo {
    public static void main(String[] args) throws IOException {
        //创建一个socket类对象用来发送信息
        DatagramSocket datagramSocket = new DatagramSocket();//用来接收或者发送信息

        //将数据打包为数据包报
        String mess = "你好服务器";
        byte[] bytes = mess.getBytes();

        DatagramPacket datagramPacket = new DatagramPacket(
                bytes,
                bytes.length,
                InetAddress.getByName("172.16.31.141"),
                10086
                );
        //发送数据包包
        while (true){
            datagramSocket.send(datagramPacket);
        }
        //关闭发送端


    }


}
