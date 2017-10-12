// # 자바에서 값 표현(literal)하기 - 정수의 크기
//
package bitcamp.java100;

public class Test11_6{
        
    public static void main(String[] args)  {
// 정수값은 기본은 4바이트 크기를 갖는다.
// -2**31 ~ +2**31 = -2147483648 ~ +2147483647
        System.out.println(-21_4748_3648);
        System.out.println(21_4748_3647);
// 숫자가 1이라도 증가하면 4바이트가 넘기 때문에
// 컴파일 오류가 발생 
        //System.out.println(-21_4748_3649);
        //System.out.println(21_4748_3648);
        
//해결책
//자바는 8바이트 크기 정수 값 표현 가능.
// 숫자 뒤에 l 또는 L을 붙여라
// 대문자L으로 주로 사용 이유 소문자l은 1과 헷갈리기 때문
        
        System.out.println(-21_4748_3649l);
        System.out.println(21_4748_3648L);
        System.out.println(10); //4바이트 정수 값
        System.out.println(10L); // 8바이트 정수 값
        System.out.println(-922_3372_0368_5477_5808l); // 8바이트 정수 최대값
        System.out.println(922_3372_0368_5477_5807l); // 8바이트 정수 최대값
        
    }
}

