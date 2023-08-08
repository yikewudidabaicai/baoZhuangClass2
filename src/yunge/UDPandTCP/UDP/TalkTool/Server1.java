package yunge.UDPandTCP.UDP.TalkTool;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(10086);



        while (true){
            byte[] bytes = new byte[4096];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            datagramSocket.receive(datagramPacket);

            String data = new String(bytes, 0, datagramPacket.getLength());

            System.out.println(datagramPacket.getAddress() +":"+data);

        }


    }
}
