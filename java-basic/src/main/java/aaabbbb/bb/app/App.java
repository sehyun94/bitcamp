//: ## ver 31
//: - 인터페이스를 적용하여 상속의 한계를 극복해보자!
//: - 학습목표
//:   - 인터페이스의 사용법과 이점을 익힌다.
//: 
package aaabbbb.bb.app;

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
    static HashMap<String,Controller> controllerMap = 
            new HashMap<>();
    
    public static void main(String[] args) {
        
        // go 명령어를 수행할 컨트롤러를 등록한다.
        controllerMap.put("1", new ScoreController());
        controllerMap.put("2", new MemberController());
        controllerMap.put("3", new BoardController());
        
        // 비록 RooomController가 GenericController의 서브클래스는 아니지만,
        // Controller의 규칙을 따르기 때문에 
        // controllerMap에 저장할 수 있다.
        controllerMap.put("4", new RoomController()); // OK!
        
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
        
        // controllerMap에 저장된 컨트롤러 객체는 
        // Controller 규칙을 따르는 객체이기 때문에
        // 레퍼런스를 선언할 때도 Controller 레퍼런스를 사용하라!
        Controller controller = controllerMap.get(menuNo);
        
        if (controller == null) {
            System.out.println("해당 번호의 메뉴가 없습니다.");
            return;
        }
        
        // App 클래스는 컨틀롤러 객체를 사용할 때
        // Controller 규칙에 정의된 메서드를 호출할 뿐이다!
        // 이 규칙을 따르는 객체라면 누구를 상속 받는지 상관없이
        // 호출할 수 있다.
        // 이것이 인터페이스 문법을 사용하는 이유이다.
        // 그 자격을 갖춘 객체라면 상속과 상관없이 호출할 수 있다.
        // 사용하는 객체의 범위를 더 확대시키는 문법이다.
        // 훨씬 코드 확장을 유연하게 도와준다.
        // 이전의 방식이라면 GenericController의 서브 클래스만 
        // 가능하기 때문에 너무 협소적이었다.
        controller.execute();
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
    }

    private static void doError() {
        System.out.println("실행할 수 없는 명령입니다.");
    }

    private static void doQuit() {
        System.out.println("프로그램을 종료합니다.");
    }




        
}



