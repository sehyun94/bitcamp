package bitcamp.java100.ch06.ex1;

//  아주 특별한 인스턴스 메서드 "생성자(constructor)"
public class Score3 {
    // 필드 선언
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    // 인스턴스를 만들 때 자동으로 호출되는 메서드
   
   Score3() {
       System.out.println("Score3() 호출됨!");
       this.name ="홍길동";
       this.kor = 50;
       this.eng = 50;
       this.math = 50;
       
       this.compute();
   }
   
   
    //메서드 정의
    // => 새 데이터를 다루는 코드를 별도의 메서드로 정의해 둔다.
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}
