package bitcamp.java100.ch06.ex1;

// 기본 생성자(default constructor)
// 

public class Score6 {
    // 필드 선언
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
   
    // 파라미터 없는 생성자 = default constructor
    // => 생성자가 한 개 도 없으면 컴파일러가 다음과 같이 기본 생성자를 추가한다.
    // => 그래서 자바의 모든 클래스는 무조건 생성자가 존재한다.
    /*
    Score6() {
         System.out.println("기본 생성자 호출됨!!");
     }
   */
   
    //메서드 정의
    // => 새 데이터를 다루는 코드를 별도의 메서드로 정의해 둔다.
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}
