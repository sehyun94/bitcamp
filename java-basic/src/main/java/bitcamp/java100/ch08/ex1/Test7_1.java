// 캡슐화의 존재 이유
// => 인스턴스 변수에 무효한 값이 저장되는 것을 방지함으로써 
//    추상화가 무너지는 것을 막는다.
// => 추상화(abstraction)??
//    사물이나 사람, 업무 등을 데이터와 메서드로 표현한 것.
//    즉 클래스를 정의하는 것을 말한다.
//    객체지향의 출발점은 클래스를 식별하여 정의하는 것으로 시작한다.
//    어떻게?  
//    => 객체지향 분석/설계(OOA/D, Object-Oriented Analysis and Design)을 통해
//       어떤 클래스가 있어야 하는지, 그 클래스에 어떤 필드와 메서드가 있어야 하는지
//       찾아내어 클래스로 정의한다.
//
package bitcamp.java100.ch08.ex1;

// Gym 회원을 추상화 해보자!
class Member{
    String name;
    int age;
    float weight;
    float height;
}

public class Test7_1 {
    public static void main(String[] args) {
        
        Member m = new Member();
        m.name = "홍길동";
        m.age = 20;
        
        // 다음 코드는 몸무게와 키를 저장한다.
        // 문법으로는 아무런 문제가 없다.
        // 하지만 내용에서는 Gym 회원이 아니다.
        m.weight = 900.70f;
        m.height = 16.0f;
        
        
                
    }

}











