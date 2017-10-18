// ##메서드 - 메서드 정의
// 값을 반환하는 메서드 정의 
// 메서드 정의 기본 문법을 알아보자
package bitcamp.java100;
public class Test17_7 {

    /**7) 메서드 안에서 값을 여러개 리턴하는 방법 
    
*/        

    //사용자 정의 데이터 타입 만들기 
    static class Member {
        String name;
        int age;
        boolean working;
        float score;
        char level;
    }
        // 사용자 정의 객체를 리턴하는 메서드
        // 다시 한번 강조한다. primitive 타입인 경우멘 값을 리턴한다.
        // 기타 배열이나 객체인 경우 리턴되는 것은 메모리의 주소이다
        // 따라서 m1() 이 리턴하는 것은 Member 설계도에 따라만든 메모리의 주소이다
    static Member m1() {
        Member ref = new Member();
        ref.name = "홍길동";
        ref.age = 20;
        ref.working = false;
        ref.score = 4.12f;
        ref.level = 'M';
        
        //ref 레퍼런스에 저장된 객체의 주소를 리턴한다.
        return ref;
    }
    
    public static void main(String[] args) {
        Member mem = m1();
        System.out.println(mem.name);
        System.out.println(mem.age);
        System.out.println(mem.working);
        System.out.println(mem.score);
        System.out.println(mem.level);
        
    }
}    

