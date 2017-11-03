// 다형성 - 오버라이딩 사용 전
package bitcamp.java100.ch08.ex3;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        ArrayList list = new ArrayList(); 
        
        while (true) {
            Score s = new Score(); // 학생 성적 정보를 입력할 메모리준비
            
            // 값 담기
            s.setNo(Prompts.inputInt("번호? "));
            s.setName(Prompts.inputString("이름? "));
            s.setKor(Prompts.inputInt("국어? "));
            s.setEng(Prompts.inputInt("영어? "));
            s.setMath(Prompts.inputInt("수학? "));
            
            list.add(s);
            
            System.out.println(s.toString());
            // toString 가볍게 값을 출력할때
            if (!Prompts.confirm("계속하시겠습니까?")) {
                break;
            }
            
        }
    }

}
