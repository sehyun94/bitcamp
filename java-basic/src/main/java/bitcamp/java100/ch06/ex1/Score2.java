package bitcamp.java100.ch06.ex1;

// 새 데이터를 다루는 연산자 정의
public class Score2 {
    // 필드 선언
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    //메서드 정의
    // => 새 데이터를 다루는 코드를 별도의 메서드로 정의해 둔다.
    
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}
