package bitcamp.java100.ch13.ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    
    static class Score {
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float aver;
    }
    
    static ArrayList<Score> list = new ArrayList<>();
    static Scanner keyScan = new Scanner(System.in);
    
    static void input() {
       
        Score score = new Score();
        
        System.out.print("이름?");
        score.name = keyScan.nextLine();
        
        System.out.print("국어?");
        score.kor = Integer.parseInt(keyScan.nextLine());
        
        System.out.print("영어?");
        score.eng = Integer.parseInt(keyScan.nextLine());
        
        System.out.print("수학?");
        score.math = Integer.parseInt(keyScan.nextLine());
        
        score.sum = score.kor + score.eng + score.math ;
        score.aver = score.sum / 3f;
        
        list.add(score);
        
    }
     
    static void print() {
        for(Score score : list) {
            System.out.printf("이름 : %-3s 국어 : %-3d 영어 : %-3d 수학 : %-3d 합계 : %-3d 평균 : %-3.1f\n",
                    score.name, 
                    score.kor,
                    score.eng,
                    score.math,
                    score.sum,
                    score.aver);
        }
    }
    
    
    public static void main(String[] args) {
        
        while (true) {
            input();
            
            System.out.print("계속하시겠습니까?(Y/n)");
            String response = keyScan.nextLine().toLowerCase();
            if(response.equals("") || response.equals("y") || response.equals("yes")) {
                continue;
            }
            break;
        }
        System.out.println("----------------------------------------");
        print();
    }

}
