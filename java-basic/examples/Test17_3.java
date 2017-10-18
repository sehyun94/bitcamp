// ##메서드 - 메서드 정의
// 메서드 정의 기본 문법을 알아보자
package bitcamp.java100;

public class Test17_3 {
    
    static void m1(String name) {
        System.out.printf("%s님 반갑습니다!\n", name);
    }   
        // 여러 개의 값이 넘어올 때는 각각의 값을 저장할 변수를 선언하면 된다.
        static void m2(String name, int age) {
            System.out.printf("%s(%d)님 반갑습니다!\n", name, age);
    }
    public static void main(String[] args) {
        // 메서드를 호출 할 때 값을 전달하기 
        // 메서드를 호출할 때 파라미터에 넘기는 값을 "아규먼트(argument)라 부른다.
        m1("홍길동");
        m1("임꺽정");
        m1("유관순");
        
        m2("홍길동", 20);
        m2("임꺽정", 30);
        m2("유관순", 16);
        
        //컴파일 오류 ! 
        // 1) 파라미터 개수 만큼 정화하게 값을 전달해야한다. 
//        m1(); 
//        m1("홍길동", 20);

        // 2) 파라미터 타입과 다른 종류의 값을 전달하면 오류
        // m1(20);
        
        
        // 3) 파라미터의 순서도 정확해야한다
//        m2(20, "홍길동");
       
    }
}    

