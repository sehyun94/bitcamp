// ##키보드로부터 입력받기  II
// -Console 클래스를 사용하여 키보드로부터 입력 받는 방법을 알아보자!!

package bitcamp.java100;

import java.io.Console;

public class Test21_4 {

    public static void main(String[] args) {
        
        // 키보드에서 입력 받은 값을 날개의 변수에 저장하지 말고
        // 적절한 인스턴스를 생성하여 저장하라!
        
        class Student {
            String name;
            int age;
            boolean working;
            float gpa;
        }
        
 Console console = System.console();
        
        if (console == null) {
            // Eclipse 에서 바로 실행할 경우 noninteractive 환경으로 인식하여
            // Console 객체를  리텉하지 않는다. 이럴경우 명령창에서 바로실행하라!
            System.err.println("콘솔을 지원하지 않습니다");
        }
            
            Student s = new Student();
            
            s.name = console.readLine("이름? (예: 홍길동) ");
            s.age  = Integer.parseInt(console.readLine("나이? (예:20)" ));
            s.working = Boolean.parseBoolean(console.readLine("재직여부? (예:true or false)" ));
            s.gpa = Float.parseFloat(console.readLine("졸업학점? (예:4.15)" ));
           
           
           
            System.out.printf("이름: %s\n", s.name);
            System.out.printf("나이: %d\n", s.age);
            System.out.printf("재직여부: %b\n", s.working);
            System.out.printf("졸업학점: %f\n", s.gpa);
        
    
    }
}    

