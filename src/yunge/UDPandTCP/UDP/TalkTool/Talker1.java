package yunge.UDPandTCP.UDP.TalkTool;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Talker1 {
    public static void main(String[] args) throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket();
        Scanner scanner = new Scanner(System.in);
        char[] chars = new char[1024];

        while (true){
            System.out.println("请输入要发送的信息：");
            String data = scanner.nextLine();

            if(data.equals("bye")){
                break;
            }
            //创建数据报包
            DatagramPacket datagramPacket = new DatagramPacket(
                    data.getBytes(),
                    data.getBytes().length,
                    InetAddress.getLocalHost(),
                    10086
            );
            //发送
            datagramSocket.send(datagramPacket);
        }
        datagramSocket.close();





    }
}
