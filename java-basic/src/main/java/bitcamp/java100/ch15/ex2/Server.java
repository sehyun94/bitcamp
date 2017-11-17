//네트워킹 프로그래밍 - ServerSocket 사용법
package bitcamp.java100.ch15.ex2;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    
    public static void main(String[] args) throws Exception {
        
        //클라이언트 연결을 받는 객체 준비
        // => IP Address : 인터넷에 연결된 컴퓨터를 구분하는 식별 번호
        // => 
        ServerSocket ss = new ServerSocket(9999, 3); // 9999 포트값 3 백로그 값  => 최대 연결 개수
        System.out.println("서버를 실행하였다!");
        
        
        
        Scanner keyScan = new Scanner(System.in);
       
        for(int i = 0; i < 10; i++) {
            System.out.println("클라이언트 승인:");
            keyScan.nextLine();
            
            Socket socket = ss.accept();
            System.out.println("클라이언트와 연결되었음!");
            System.out.printf("IP = %s : Port = %d\n",
                          socket.getInetAddress().getHostAddress(),
                          socket.getPort());
            
            socket.close();
            
        
        }
        //사용 자원 해제
        ss.close();
        System.out.println("서버를 종료하였다!");
        
        
    }
}
