//: ## ver 31
//: - 인터페이스를 적용하여 상속의 한계를 극복해보자!
//: - 학습목표
//:   - 인터페이스의 사용법과 이점을 익힌다.
//: 
package aaabbbb.bb.app;

import java.net.ServerSocket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

import aaabbbb.bb.app.control.BoardController;
import aaabbbb.bb.app.control.Controller;
import aaabbbb.bb.app.control.MemberController;
import aaabbbb.bb.app.control.RoomController;
import aaabbbb.bb.app.control.ScoreController;
 
// 인터페이스 정의
// 1) App 클래스와 컨트롤러들 사이의 호출 규칙을 정의한다.
//    => Controller 인터페이스 정의
// 
// 2)기존의 컨트롤러들이 이 규칙을 따르도록 변경한다.
//    => GenericController가 Controller의 규칙을 따른다.
//    => RoomController는 직접 Controller의 규칙을 따른다.
//
// 3) controllerMap에 저장하는 값은 Controller 규칙을 따르는 객체로
//    변경한다.
//
public class App {
    
    static Scanner keyScan = new Scanner(System.in);
    
    // 이제 HashMap에 보관하는 값은 Controller 규칙을 준수한 객체이다.
    static HashMap<String,Controller> controllerMap = new HashMap<>();
    static ServerSocket ss;
    public static void main(String[] args) {
        
        // go 명령어를 수행할 컨트롤러를 등록한다.
        controllerMap.put("1", new ScoreController("./data/score.csv"));
        controllerMap.put("2", new MemberController("./data/member.csv"));
        controllerMap.put("3", new BoardController("./data/board.csv"));
        controllerMap.put("4", new RoomController("./data/room.csv")); // OK!
        
        void service() throws Exception {
            ss = new ServerScoket(9999);
            
        
            System.out.println("서버 시작됨");
            
            
        }
        
        loop:
        while (true) {
            System.out.print("명령> ");
            String[] input = keyScan.nextLine().toLowerCase().split(" ");
            
            try {
                switch (input[0]) {
                case "menu": doMenu(); break;
                case "help": doHelp(); break;
                case "quit": doQuit(); break loop;
                case "go": doGo(input[1]); break;
                default:
                    doError();
                }
            } catch (Exception e) {
                System.out.println("명령 처리 중 오류 발생!");
                e.printStackTrace();
            }
            System.out.println();
        } // while
        
    }
    
    private static void doGo(String menuNo) {
   
        Controller controller = controllerMap.get(menuNo);
        
        if (controller == null) {
            System.out.println("해당 번호의 메뉴가 없습니다.");
            return;
        }
     
        controller.execute(Request request, Response response);
    }

    private static void doHelp() {
        System.out.println("[명령]");
        System.out.println("menu        - 메뉴 목록 출력한다.");
        System.out.println("go 번호     - 메뉴로 이동한다.");
        System.out.println("quit        - 프로그램을 종료한다.");
    }

    private static void doMenu() {
        System.out.println("1 성적관리");
        System.out.println("2 회원관리");
        System.out.println("3 게시판");
        System.out.println("4 강의실");
    }

    private static void doError() {
        System.out.println("실행할 수 없는 명령입니다.");
    }

    private static void doQuit() {
        Collection<Controller> controls = controllerMap.values();
        for (Controller control : controls) {
            control.destory();
        }
        System.out.println("프로그램을 종료합니다.");
    }
    
    




        
}




