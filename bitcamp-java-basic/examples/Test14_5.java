// ## 새로운 데이터 타입에 대해 사용할 연산자 만들기
package bitcamp.java100;

public class Test14_5{

    public static void main(String[] args)  {
    
    class Score {
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float aver;

        // 새 연산자(operator) => compute 
        // operator = metho = message =function
        // 리턴할 것 이 없으면 앞에 void를 붙인다
        void compute(){
            sum = kor + eng + math;
            aver = sum / 3.0f;
        }
    }

    Score s1 = new Score();
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 100;
    s1.math = 100;
    s1.compute(); // 연산자 실행 = 메서드 호출 = 메세지 전송

        System.out.printf("%s,%d,%d,%d,%d,%f\n", 
        s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);

        Score s2 = s1;
        s1 = new Score();
        s1.name = "임꺽정";
        s1.kor = 90;
        s1.eng = 90;
        s1.math = 97;
        s1.compute();

        System.out.printf("%s,%d,%d,%d,%d,%f\n", 
        s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);
        System.out.printf("%s,%d,%d,%d,%d,%f\n", 
        s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.aver);

    }
}    

