// 네트워킹 프로그래밍 - Socket 사용법
package bitcamp.java100.ch15.ex3;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception {

        // 서버에 연결 요청

        Socket socket = new Socket("localhost", 9999);
        System.out.println("서버와 연결 되었다!");

        // 서버 쪽으로 출력하기 위해 출력 도구를 준비한다.
        PrintStream out = new PrintStream(socket.getOutputStream());
        out.println("hello");
        
        Scanner in = new Scanner(socket.getInputStream());
        String line = in.nextLine();
        
        System.out.println(line);
        
        out.close();
        in.close();
        
        socket.close();
    }

}
