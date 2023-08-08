package yunge.UDPandTCP;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {

        // 获取[本地主机]InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();

        System.out.println(localHost.getHostName());//DESKTOP-J1I3RQF
        System.out.println(localHost.getHostAddress());//192.168.1.3

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // [根据主机名]获取InetAddress
        InetAddress inetAddress = InetAddress.getByName("LAPTOP-57CP4HS8");
        System.out.println(inetAddress);//DESKTOP-J1I3RQF/192.168.1.3

    }
}