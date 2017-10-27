package bitcamp.java100.ch07.ex5;

public class C extends A{
    C() {
        
    }
    
    C(String msg) {
        //super();

//        super("hello"); // 파라미터로 문자열을 주면 String을 받는 생성자를 호출
        super(100); // 파라미터로  int 값을 주면 int 값을 받는 생성자를 호출
        System.out.println("C(String) 생성자 호출 -" + msg);
    }
}
