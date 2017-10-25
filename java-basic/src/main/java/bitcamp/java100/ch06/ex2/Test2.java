// 클래스 문법의 용도 - 메서드를 묶는 문법
package bitcamp.java100.ch06.ex2;

import java.io.Console;

// 클래스 문법 사용 하여 메서드 분리
public class Test2 {

    static Console console;
    static void prepareConsole() {
        console = System.console();
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다");
            System.exit(1);
        }
    }
    
    public static void main(String[] args) {
        prepareConsole();
        while (true) {
        // 학생의 성적 정보를 저장할 변수를 준비하라!
        Score score = new Score();
        // 학생의 점수를 입력 받아 score 객체에 저장
        ScoreView.input(score);
        // 배열에 학생 데이터를 저장
        ScoreDao.add(score);

        if (!MessageBox.confirm("계속하시겠습니까?")) {
            break;
        }
        }
        // 학생의 점수 출력
        for(int i = 0; i < ScoreDao.size(); i++)
        ScoreView.print(ScoreDao.get(i)); 
    }

}
