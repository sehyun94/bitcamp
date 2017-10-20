package bitcamp.java100.ch06.ex1;


// 인스턴스 초기화 문장
public class Score10 {
    // 필드 선언
    String name = "이름없음";
    int kor = 10;
    int eng = 10;
    int math;
    int sum;
    float aver;
   // 인스턴스 블록
    {
        this.name = "홍길동";
        this.kor = 20;
    }
    
    // 생성자
    Score10() {
        this.name = "임꺽정";
        compute();
    }
    
    void compute() {
        // 일반 인스턴스 메서드에서 생성자를 호출할 수 없다.
        //=> 오직 new 명령으로 인스턴스를 생성할 때만 호출할 수 있다.
        // this();  컴파일 오류 !!!!       
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
    
}
