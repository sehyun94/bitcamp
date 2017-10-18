// ##클래스 문법을 사용하여 메서드를 분류(classifictaion)한다 
// 로컬 변수의 생명주기와 객체의 생명주기에 대해 알아보자 
package bitcamp.java100;


public class Test17_16 {
    public static void main(String[] args) {
        
        
        // 별도의 클래스로 분류된 메서드 사용하기
        // 문법: 클래스명.메서드명
        Test17_16_A.m1();
        Test17_16_B.m1();
        Test17_16_A.m2();
        Test17_16_B.m2();
        Test17_16_A.m3();
        Test17_16_B.m3();
        Test17_16_B.m4();

        
//        Test17_16_C.m1(); 컴파일오류
        bitcamp.java100.other.Test17_16_C.m1();
        bitcamp.java100.other.Test17_16_C.m2();
        bitcamp.java100.other.Test17_16_C.m3();
        bitcamp.java100.other.Test17_16_C.m4();
    }
    
}

