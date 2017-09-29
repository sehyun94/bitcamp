// ## 문자 코드 값을 저장할 변수
package bitcamp.java100;

public class Test12_9{

    public static void main(String[] args)  {
        char c1;
        c1 = 44032; // 가의 유니코드 값을 10 진수로 표현한 것
        char c2 = 0xAC00; // 가의 유니코드 값을 16 진수로 표현한 것
        System.out.println(c1);
        System.out.println(c2);

        char n1=0xC624, n2=0xC138, n3=0xD604;
        System.out.printf("%c %c %c\n", n1, n2, n3);
        n1 = '홍';
        n2 = '길';
        n3 = '동';
        System.out.printf("%c %c %c\n", n1, n2, n3);

// 문자 7 -> 숫자 7로 변환.
        char x = '7';
        int num;
        num = x- '0';
        System.out.println(num);

    }
}

