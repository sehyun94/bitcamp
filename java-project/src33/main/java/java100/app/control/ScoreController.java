package java100.app.control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

import java100.app.domain.Score;
import java100.app.util.Prompts;

public class ScoreController extends GenericController<Score> {
    
    private String dataFilePath;
    
    
    public ScoreController(String dataFilePath) {
            this.dataFilePath = dataFilePath;
            this.init();
    }
    //ArrayList에 보관된 데이터를 score.csv 파일에 저장한다.
    // 저장하는 형식은 CSV(Comma Separated Value) 방식을 사용
    // 예)홍길동,100,100,100,300,100.0
   
        @Override
        public void destory() {
         
        try (PrintWriter out = new PrintWriter (
                                  new BufferedWriter(
                                    new FileWriter(this.dataFilePath)));) {
         
        for (Score score : this.list) {
            out.println(score.toCSVStirng());
        }  
        out.flush();
        
        
        } catch (IOException e) {
            e.printStackTrace();
        }
               
        }
    // CSV형식으로 저장된 파일에서 성적 데이터를 읽어
    // ArrayList에 보관한다.
        
    @Override
    public void init() {
        
        
        try (
                //FileReader in = new FileReader(this.dataFilePath);
                //BufferedReader in2 = new BufferedReader(in);
                
                BufferedReader in = new BufferedReader(new FileReader(this.dataFilePath)))
                
        //        Scanner lineScan = new Scanner(in);)
        {
            
            String csv = null;
            while ((csv = in.readLine()) != null) {
//                System.out.println(str);
                try {
                    list.add(new Score(csv));
                } catch(CSVFormatException e) {
                    System.err.println("CSV 데이터 형식오류!");
                    e.printStackTrace();
                    
                }
            }

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    
    @Override
    public void execute() {
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
