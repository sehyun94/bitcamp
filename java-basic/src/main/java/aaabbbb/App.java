//: ## ver 16
//: - ArrayList에 generic을 적용하여 저장하는 타입을 지정할 수 있게 한다.
//: - 학습목표
//:   - 제넥릭을 이용하여 클래스를 정의하는 방법
//:   - 제네릭이 적용된 클래스를 사용하는 방법
//: 
//: 
//: 여러 명의 성적을 저장하고 다음과 같이 출력하라!
//:
//: 출력내용:
//: ```
//: 홍길동, 100,  90,  80, 270,  90.0
//: 임꺽정,  80,  80,  80, 240,  80.0
//: 유관순, 100, 100, 100, 300, 100.0
//: ```
package aaabbbb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
 
public class App {
    static Scanner keyScan = new Scanner(System.in);
    
    static String prompt(String message) {
        System.out.print(message);
        return keyScan.nextLine();
    }
    
    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();
        
        if (response.equals("y") || response.equals("yes") || response.equals(""))
            return true;
        return false;
    }
    static boolean confirm2(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();
        
        if (response.equals("n") || response.equals("no") || response.equals("")) {
            return true; 
        } return false;
    }
    public static void main(String[] args) {
        
  
        ArrayList<Score> list = new ArrayList<>();
        Iterator<Score> iterator;
       
                
        loop:
        while (true) {
            System.out.print("성적관리> ");
            String input = keyScan.nextLine();
            String name = null;
            Score score = null;
             switch(input) { 
             case "add" :
                 System.out.println("[학생등록]");
                
                 while(true) {
                     score = new Score();
                     score.input();
                     list.add(score);
                     if(!confirm("계속 하시겠습니까(Y/n)"))
                             break;
                 }
                 break;
             case "list" :
                 System.out.println("[학생 목록]");
                 
                      iterator = list.iterator();
                     while(iterator.hasNext()) {
                         iterator.next().print();
                     }
                     break;
                     
             case "view" :
                 System.out.println("[성적 조회]");
                 name = prompt("이름?");
                 
                 score = null;
                 iterator = list.iterator();
                 while(iterator.hasNext()) {
                    Score temp = iterator.next();
                    if(temp.name.equals(name)) {
                        score = temp;
                        break;
                    }
                 }
                 
                 if(score == null) {
                     System.out.printf("'%s'의 성적 정보가 없습니다", name);
                 } else { 
                     score.printDetail();
             }
             break;
             
             case"delete":
                 
                 System.out.println("[성적 삭제]");
                 name = prompt("이름?");
                 
                 iterator = list.iterator();
                 while(iterator.hasNext()) {
                     Score temp = iterator.next();
                     if(temp.name.equals(name)) {
                         score = temp;
                         break;
                     }
                 }
                 
                 if(score == null) {
                     System.out.printf("'%s'의 성적 정보가 없습니다\n", name);
                 } else { 
                     if(!confirm2("정말 삭제하시겠습니까?(y/N)")) {
                         list.remove(score);
                     System.out.println("삭제하였습니다");
                 } else {
                     System.out.println("삭제 취소 되었습니다");
                 }
             }
                 break;
                 
             case "update" :
                 System.out.println("[성적 변경]");
                 name = prompt("이름?");
                 iterator = list.iterator();
                 while(iterator.hasNext()) {
                     Score temp = iterator.next();
                     if(temp.name.equals(name)) {
                         score = temp;
                         break;
                     }
                 }
                 if(score == null) {
                     System.out.printf("'%s'의 성적 정보가 없습니다\n", name);
                 } else {
                     score.update();
                 }
                 break;
                 
             case "quit" : break loop;
                 
             default:
                 System.out.println("실행할 수 없는 명령입니다");
             }
            
        }
        System.out.println();
    }
        
}




