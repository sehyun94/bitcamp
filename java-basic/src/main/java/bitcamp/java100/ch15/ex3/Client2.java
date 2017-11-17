// 네트워킹 프로그래밍 - Socket 사용법
package bitcamp.java100.ch15.ex3;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {

    public static void main(String[] args) throws Exception {

        
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("보낼 메세지");
        String message = keyScan.nextLine();
        
        System.out.print("서버주소");
        String serverAddress = keyScan.nextLine();
        
        keyScan.close();
        
        Socket socket = new Socket(serverAddress, 9999);
        System.out.println("서버와 연결 되었다!");
        

        // 서버 쪽으로 출력하기 위해 출력 도구를 준비한다.
        PrintStream out = new PrintStream(socket.getOutputStream());
        out.println(message);
        
        Scanner in = new Scanner(socket.getInputStream());
        String line = in.nextLine();
        
        System.out.println(line);
        
        out.close();
        in.close();
        
        socket.close();
    }

}
