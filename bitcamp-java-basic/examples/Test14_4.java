// ## 객체와 레퍼런스
package bitcamp.java100;

public class Test14_4{

    public static void main(String[] args)  {
 // 사용자 데이터 타입 정의하기
 // 비트캠프의 수강생 정보를 저장할 데이터 타입
 //1) 설계도 작성
 class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
}

    Score s1 = new Score();
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 100;
    s1.math = 100;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.aver = s1.sum / 3.0f;

        System.out.printf("%s,%d,%d,%d,%d,%f\n", 
        s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);

        Score s2 = s1;
        s1 = new Score();
        s1.name = "임꺽정";
        s1.kor = 90;
        s1.eng = 90;
        s1.math = 97;
        s1.sum = s1.kor + s1.eng + s1.math;
        s1.aver = s1.sum / 3.0f;

        System.out.printf("%s,%d,%d,%d,%d,%f\n", 
        s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);
        System.out.printf("%s,%d,%d,%d,%d,%f\n", 
        s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.aver);

    }
}    

