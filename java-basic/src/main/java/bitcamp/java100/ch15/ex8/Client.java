package bitcamp.java100.ch15.ex8;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("서버주소? ");
        
        String serverAddr = keyboard.nextLine();
        
        Socket socket = new Socket(serverAddr, 9999);
        
        //클라이언트와 데이터를 주고 받기 위한 스트림 객체 준비
        // => 출력을 먼저하는 경우 가능한 출력 스트림 객체를 먼저 만들라
        PrintStream out = new PrintStream(
                new BufferedOutputStream (socket.getOutputStream()));
        
        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        
        while (true) {
            System.out.print("계산식?");
            String message = keyboard.nextLine();
            out.println(message);
            out.flush();
            
            // 서버가 보내준걸 읽는다
            System.out.println(in.readLine());
            
            if(message.equals("quit")) 
                break;
            
        }
        out.close();
        in.close();
        socket.close();
        keyboard.close();
        
    }

}
