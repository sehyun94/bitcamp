//Connectionless 방식으로 통신하기
// - 연결없이 데이터를 보낸다.
package bitcamp.java100.ch15.ex7;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class MulticastClient {

    public static void main(String[] args) throws Exception {
        
        Scanner keyboard = new Scanner(System.in);

        // 비연결성 소켓 준비
        MulticastSocket socket = new MulticastSocket();

        //멀티캐스트 그룹 IP 주소
        // -224.0.0.0 ~ 239.0.0.1
        InetAddress ip = InetAddress.getByName("224.0.0.1");
        
        // 받는쪽 port
        int port = 9999;
       
        while(true) {
            
        System.out.print("보낼 메세지 : ");
        String message = keyboard.nextLine();
        if (message.equals("quit"))
            break;

        //보낼 데이터
        byte[] bytes = message.getBytes("UTF-8");

        // 데이터를 보내기 위한 상자 준비
        DatagramPacket packet = new DatagramPacket(
                bytes, 0 , bytes.length, ip , port);
        
        // 소켓을 이용하여 네트웍으로 방출 
        socket.send(packet);
        System.out.println("데이터출력완료!");
        }
        
        socket.close();
        keyboard.close();
        

    }

}
