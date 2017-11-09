package java100.app.control;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import java100.app.domain.Score;
import java100.app.util.Prompts;

public class ScoreController {
    
    // 성적데이터를 보관하는 목록 객체는 외부 노출을 막는다.
    private ArrayList<Score> list = new ArrayList<>();
    static Scanner keyScan = new Scanner(System.in);
    
    public void excute() {
        loop:
        while(true) {
            System.out.print("성적관리> ");
            String input = keyScan.nextLine();
              // 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
          switch (input) {
          case "add": this.doAdd(); break;
          case "list": this.doList(); break;
          case "view": this.doView(); break;
          case "update": this.doUpdate(); break;
          case "delete": this.doDelete(); break;
          case "main": break loop;
          default: 
              System.out.println("해당 명령이 없습니다.");
          }
      }
    }
    // 대신 목록 객체에 값을 저장하고 꺼낸는 객체는 완전 공개
    private void doDelete() {
        System.out.println("[학생 삭제]");
        //Prompts 클래스의 input() 메서드를 사용한 예:
        //String name = Prompts.input("이름? ");
        
        String name = Prompts.inputString("이름? ");
        Score score = findByName(name);
        
        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        } else {
            if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
                list.remove(score);
                System.out.println("삭제하였습니다.");
            } else {
                System.out.println("삭제를 취소하였습니다.");
            }
        }
    }

    private void doUpdate() {
        System.out.println("[학생 정보 변경]");
        String name = Prompts.inputString("이름? ");
        
        Score score = findByName(name);
        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        } else {

            int kor = score.getKor();
            try {
               kor = Prompts.inputInt("국어?(%d)", score.getKor());
            } catch(Exception e) {}

            int eng = score.getEng();
            try {
               eng = Prompts.inputInt("영어?(%d)", score.getEng());
            } catch(Exception e) {}

            int math = score.getMath();
            try {
               math = Prompts.inputInt("수학?(%d)", score.getMath());
            } catch(Exception e) {}
            
            if (Prompts.confirm2("변경하시겠습니까?(y/N)")) {
                score.setKor(kor);
                score.setEng(eng);
                score.setMath(math);
                System.out.println("변경하였습니다");
            } else  {
                System.out.println("변경을 취소하였습니다");
            }
        }
    }

    private void doView() {
        System.out.println("[학생 정보]");
        String name = Prompts.inputString("이름? ");
        
        Score score = findByName(name);
        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
            return;
        }
            System.out.printf("이름 : %-4s 국어: %4d  영어: %4d  수학: %4d  합계: %4d  평균 :%6.1f\n", 
                    score.getName(), score.getKor(), score.getEng(),
                    score.getMath(), score.getSum(), score.getAver());
        }

    private void doList() {
        System.out.println("[학생 목록]");
        
        Iterator<Score> iterator = list.iterator();
        while (iterator.hasNext()) {
            Score score = iterator.next();
            System.out.printf("%-4s :  합계 = %4d 평균 = %6.1f\n", 
                    score.getName(), score.getSum(), score.getAver());
            }
        }

    private void doAdd() {
        System.out.println("[학생 등록]");

            Score score = new Score(); // 성적 데이터를 저장할 빈 객체를 준비한다.
            
            score.setName(Prompts.inputString("이름?"));
            score.setKor(Prompts.inputInt("국어점수? "));
            score.setEng(Prompts.inputInt("영어점수? "));
            score.setMath(Prompts.inputInt("수학점수? "));
            
            list.add(score);
    }
    
    private Score findByName(String name) {
        Iterator<Score> iterator = list.iterator();
        while (iterator.hasNext()) {
            Score score = iterator.next();
            if (score.getName().equals(name)) {
                return score;
            }
        }
        return null;
    }
}
