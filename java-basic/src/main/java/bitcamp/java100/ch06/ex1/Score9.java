package bitcamp.java100.ch06.ex1;


// 인스턴스 초기화 블록
public class Score9 {
    // 필드 선언
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
   
    // 인스턴스 초기화 블록정의
    {  //생성자가 호출되기 전에 먼저 실행된다.
        // 생성자를 만들 수 없는 익명 클래스를 정의할 때 사용할 수 있다.
        System.out.println("인스턴스 초기화 블록 실행111!");
    }
    
    Score9(){
        System.out.println("Score9() 호출됨!");
    }
    Score9(String name) {
        System.out.println("Score9(String) 호출됨!");
    }

    //인스턴스 블록 위치는 상관없다
    {
        System.out.println("인스턴스 초기화 블록 실행222!");
    }
    void compute() {
        // 일반 인스턴스 메서드에서 생성자를 호출할 수 없다.
        //=> 오직 new 명령으로 인스턴스를 생성할 때만 호출할 수 있다.
        // this();  컴파일 오류 !!!!       
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
    // 모든 인스턴스 블록이 실행된 다음에 생성자가 호출된다
    // 가능한 인스턴스 블록 한개만 만들어라
    // 지금처럼 여러개 두는 것은 좋지 않다. 최악이다
    // 위치도 맨아래 아니면 맨위에 두는 것이 좋다.
    {
        System.out.println("인스턴스 초기화 블록 실행33333!");
    }
    
}
