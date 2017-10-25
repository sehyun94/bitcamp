// ##String 클래스 사용법 - String 인스턴스 생성

package bitcamp.java100;

public class Test18_1 {

    public static void main(String[] args) {
        // String 클래스를 가지고 문자열 배열 만들기
        //1) String 메모리 주소를 저장할 레퍼런스 선언
        String s1;
        
        //2) 문자열 저장할 메모리 준비
        
        s1 = new String("ABC가각간");
        
        String s2;
        s2 = new String("ABC가각간");
        
        if(s1 != s2) {
            System.out.println("s1 != s2");
        }
    }
}    

