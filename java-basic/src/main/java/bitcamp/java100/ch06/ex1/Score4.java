package bitcamp.java100.ch06.ex1;

//  파라미터가 있는 "생성자"
public class Score4 {
    // 필드 선언
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
   
    // 생성자가 호출될때 파라미터 값 받을 수 있음
   Score4(String name, int kor, int eng, int math) {
       System.out.println("Score4() 호출됨!");
       
       this.name =name;
       this.kor = kor;
       this.eng = eng;
       this.math = math;
       
       this.compute();
   }
   
   
    //메서드 정의
    // => 새 데이터를 다루는 코드를 별도의 메서드로 정의해 둔다.
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}
