// ##String 클래스 사용법 - 문자열 리터럴(literal) String 인스턴스 생성
// - literal을 사용하여 암시적으로 String 인스턴스를 생성하는법
package bitcamp.java100;

public class Test18_4 {

    public static void main(String[] args) {
     String s1 = "ABC가각간";
     String s2 = new String("ABC가각간");
     
     // 레퍼런스 주소 비교
     // 즉 인스턴스가 같은지 비교한다.
     if (s1 != s2) System.out.println("s1 != s2");
     
     // 내용물이 같은지 비교
     // =>String 클래스의 인스턴스 메서드인 equals()를 사용
     if (s1.equals(s2)) System.out.println("s1과 s2의 내용물이 같다.");
     
     //자바에서 문자열의 내용이 같은지 비교할 때는 반드시 equals 를 사용
    }
}    

