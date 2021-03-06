package bitcamp.java100.ch15.ex7;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class PingServer {

    public static void main(String[] args) throws Exception {

        DatagramSocket socket = new DatagramSocket(9999);
        
        // 받은 데이터를 저장할 버퍼 준비
        byte[] buf = new byte[1024];
        
        // 버퍼를 패킷에 장착하여 데이터를 받을 빈 패킷을 준비한다
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        while (true) {
            System.out.println("데이터를 기다리는 중.....");
        // 빈 패킷을 전달하여 9999 포트로 들어온 데이터를 받는다.
        socket.receive(packet);
        
        
        //받은 데이터를 패킷으로부터 꺼내 출력한다. 
        String message = new String(
                packet.getData(), 0,  packet.getLength(), "UTF-8");
        
        System.out.printf("보낸이 주소 : %s\n", 
                packet.getAddress().getHostAddress());
        
        System.out.printf("보낸이 포트 : %d\n", 
                packet.getPort());
        
        System.out.printf("메세지 : %s\n", message);
        System.out.println("-------------------------------");
        }
        
        
//        socket.close();
        
        
        
        
        
        
        
    }

}
