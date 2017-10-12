// ## 사용자 정의 데이터 타입 만들기
package bitcamp.java100;

public class Test14_1{

    public static void main(String[] args)  {
 // 사용자 데이터 타입 정의하기
 //1) 설계도 작성
        class Score {
                String name;
                int kor;
                int eng;
                int math;
                int sum;
                float aver;
        }
 //2) 새 데이터 타입에 따라 만든 메모리의 주소를 저장할 변수 선언
        Score r1; //Scroe 설계도에 따라 준비한 메모리의 주소를 저장.

//3) 사용자가 새로 정의한 데이터 타입에 따라 메모리를 준비하기
        r1 = new Score(); 
        
//4) 레퍼런스를 사용하여 새 메모리에 값 넣기
        r1.name = "홍길동";
        r1.kor = 100;
        r1.eng = 98;
        r1.math = 95;
        r1.sum = r1.kor + r1.eng + r1.math ;
        r1.aver = r1.sum / 3.0f;
        
        System.out.printf("%s %d %d %d %d %f\n", 
        r1.name, r1.kor, r1.eng, r1.math, r1.sum, r1.aver);
    }
}

