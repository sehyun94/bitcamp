package bitcamp.java100.ch06.ex3;

public class MyClass3 {

    // 스태틱 변수 = 클래스 변수
    static int v1 = 100; 

    // 스태틱 메서드 = 클래스 메서드
    static void m1() {  
        System.out.println(v1);
    }
    
    //스태틱 블록
    // = > 스태틱 변수가 생성된후 자동으로 실행되는 블록
    static {
        System.out.println("MyClass3.static 블록 실행!");
        v1 = 300;
        
    }
     
    /*
     * 한 클래스에 스태틱 블록을 여러개 만들 수 있지만
     * 만든다면 가능한 한개만 만들라
     * 많이 만들면 코드를 이해하는데 방해
    static {
        System.out.println("MyClass3.static 블록 실행22222222!");
        v1 = 300;
        
    }
    */
   
}
   