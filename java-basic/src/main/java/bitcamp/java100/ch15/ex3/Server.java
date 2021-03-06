//네트워킹 프로그래밍 - ServerSocket 사용법
package bitcamp.java100.ch15.ex3;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    
    public static void main(String[] args) throws Exception {
        
        ServerSocket ss = new ServerSocket(9999); 
        System.out.println("서버를 실행하였다!");
        
        
        Socket socket = ss.accept();
        
        //소켓을 통해 데이터를 주고 받을 수 있도록 입출력 도구를 연결
       // InputStream in = socket.getInputStream();
        
        //한 줄 단위로 데이터를 읽어주는 객체를 붙인다
        //Scanner in2 = new Scanner(in);
        Scanner in = new Scanner(socket.getInputStream());

        // 연결된 입력 도구를 통해 한 줄 읽는다
        // => 클라이언트가 한 줄을 보낼 때까지 리턴하지 않는다.
        String line = in.nextLine();
        
        
        // 클라이언트에 데이터를 출력하는 객체를 붙인다.
        PrintStream out = new PrintStream(socket.getOutputStream());
        
        //읽은 데이터를 그대로 클라이언트로 보낸다.
        // => 클라이언트가 보낸 데이터를 모두 읽어야만 리턴한다 항상 블로킹하기때문에.
        out.println(line);
        
        //입 출력의 기본! 다쓴 자원은 닫는다
        in.close();
        out.close();
        
        
        socket.close();
            
        
        //사용 자원 해제
        ss.close();
        System.out.println("서버를 종료하였다!");
        
        
    }
}
