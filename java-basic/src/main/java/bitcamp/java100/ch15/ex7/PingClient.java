//Connectionless 방식으로 통신하기
// - 연결없이 데이터를 보낸다.
package bitcamp.java100.ch15.ex7;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class PingClient {

    public static void main(String[] args) throws Exception {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("서버 주소 ");
        String serverAdr = keyboard.nextLine();
        
        System.out.print("보낼 메세지 ");
        String message = keyboard.nextLine();
        keyboard.close();
        
        
        // 비연결성 소켓 준비
        DatagramSocket socket = new DatagramSocket();
        
        //보낼 데이터
        
        byte[] bytes = message.getBytes("UTF-8");
        
        // 받는쪽 IP 주소
        InetAddress ip = InetAddress.getByName(serverAdr);
        
        // 받는쪽 port
        int port = 9999;
        
        // 데이터를 보내기 위한 상자 준비
        DatagramPacket packet = new DatagramPacket(
                bytes, 0 , bytes.length, ip , port);
        
        // 소켓을 이용하여 네트웍으로 방출 
        socket.send(packet);
        socket.close();
        
        System.out.println("데이터출력완료!");

    }

}
