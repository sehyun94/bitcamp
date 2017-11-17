// 네트워킹 프로그래밍 - Socket 사용법
package bitcamp.java100.ch15.ex2;

import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception {

        // 서버에 연결 요청

        Socket socket = new Socket("192.168.0.58", 9999);
        System.out.println("서버와 연결 되었다!");

        System.out.printf("클라이언트 IP = %s\n", 
                socket.getLocalAddress().getHostAddress());
        System.out.printf("클라이언트 Port = %d\n",
                socket.getLocalPort());
        System.out.printf("IP = %s : Port = %d\n",
                      socket.getInetAddress().getHostAddress(),
                      socket.getPort());
        
        socket.close();
    }

}
