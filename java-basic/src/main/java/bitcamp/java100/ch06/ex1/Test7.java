//클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기
package bitcamp.java100.ch06.ex1;

// 인스턴스를 만들 때 생성자 호출하기
public class Test7 {
    public static void main(String[] args) {
        // 학생의 성적 정보를 저장할 변수를 준비하라!
        Score5 score;
        

        // 인스턴스를만들 때 생성자 호출

        score = new Score5();
        
        score = new Score5("임꺽정", 100, 100,100);

        score = new Score5("유관순");
        
    }
}
