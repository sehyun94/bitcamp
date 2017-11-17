//네트워킹 프로그래밍 - ServerSocket 사용법
package bitcamp.java100.ch15.ex1;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    
    public static void main(String[] args) throws Exception {
        
        //클라이언트 연결을 받는 객체 준비
        // => IP Address : 인터넷에 연결된 컴퓨터를 구분하는 식별 번호
        // => 
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("서버를 실행하였다!");
        
        Socket socket = ss.accept();
        System.out.println("클라이언트와 연결되었음!");
        System.out.printf("서버 IP = %s\n",
                           socket.getLocalAddress().getHostAddress());
        System.out.printf("서버 Port = %d\n",
                          socket.getLocalPort());
        System.out.printf("클라이언트 IP = %s\n %s\n ",
                  socket.getInetAddress().getHostAddress());
        System.out.printf("클라이언트 Port = %d\n",
                socket.getPort());
        
        //사용 자원 해제
        ss.close();
        System.out.println("서버를 종료하였다!");
        
        
    }
}
