/** #ver06 
* 배열 문법응x용 
* 여러 명의 성적을 저장하고 다음과 같이 출력하라!
 * 출력내용:
 * '''
 * 홍길동,  100,  90,  80,  270,  90.0
 * 임꺽정,   80,  80,  80,  240,  80.0
 * 유관순,  100, 100, 100,  300, 100.0
 */

public class App{
    public static void main(String[]args)   {
        // 학생의 성적을 저장할 때 사용할 사용자 정의 데이터 타입을 만든다.
        // > 사용자 정의 데이터 타입은 데이터를 저장할 메모리를 설계하는 것이다.

        /**ver07 
        * 배열 응용2
        
        */
        class Score {
            String name;
            int[] subjects = new int[3];
            int sum;
            float aver;
        }
        
//        Score[] scores = new Score[3];
//        scores[0] = new Score();
//        scores[1] = new Score();
//        scores[2] = new Score();
        Score[] scores = {new Score(), new Score(), new Score()};
        
        scores[0].name = "홍길동";
        scores[0].subjects[0] = 100;
        scores[0].subjects[1] = 90;
        scores[0].subjects[2] = 80;
        for (int sub : scores[0].subjects) {
            scores[0].sum += sub;
        }
        scores[0].aver = scores[0].sum / 3f;
       
        
        scores[1].name = "임꺽정";
        scores[1].subjects[0] = 80;
        scores[1].subjects[1] = 80;
        scores[1].subjects[2] = 80;
        for (int sub : scores[1].subjects) {
            scores[1].sum += sub;
        }
        scores[1].aver = scores[1].sum / 3f;

        scores[2].name = "유관순";
        scores[2].subjects[0] = 100;
        scores[2].subjects[1] = 100;
        scores[2].subjects[2] = 100;
        for (int sub : scores[2].subjects) {
            scores[2].sum += sub;
        }
        scores[2].aver = scores[2].sum / 3;
        
        for (Score s : scores) {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",s.name, s.subjects[0], s.subjects[1], s.subjects[2], 
                s.sum, s.aver);       

        }
    } 
}    
        
        
        
        
        
        
        
        /** #ver06 
        * 배열 문법응용 
        class Score {
            String name;
            int[] subjects = new int[3];
            int sum;
            float aver;
        }
        
        Score s1 = new Score();
        s1.name = "홍길동";
        s1.subjects[0] = 100;
        s1.subjects[1] = 90;
        s1.subjects[2] = 80;
        for (int sub : s1.subjects) {
            s1.sum += sub;
        }
        s1.aver = s1.sum / 3f;
        Score s2 = new Score();
        s2.name = "임꺽정";
        s2.subjects[0] = 80;
        s2.subjects[1] = 80;
        s2.subjects[2] = 80;
        for (int sub : s2.subjects) {
            s2.sum += sub;
        }
        s2.aver = s2.sum / 3f;
        Score s3 = new Score();
        s3.name = "유관순";
        s3.subjects[0] = 100;
        s3.subjects[1] = 100;
        s3.subjects[2] = 100;
        for (int sub : s3.subjects) {
            s3.sum += sub;
        }
        s3.aver = s3.sum / 3;
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",s1.name, s1.subjects[0], s1.subjects[1], s1.subjects[2], 
                s1.sum, s1.aver);       
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",s2.name, s2.subjects[0], s2.subjects[1], s2.subjects[2], 
                s2.sum, s2.aver);
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",s3.name, s3.subjects[0], s3.subjects[1], s3.subjects[2], 
                s3.sum, s3.aver);
        
    }
}    
       */ 
       
        
        
        
        
        
        
        
        /** #ver05
        * 클래스 문법응용
        * 여러 명의 성적을 저장하고 다음과 같이 출력하라!
         * 출력내용:
         * '''
         * 홍길동,  100,  90,  80,  270,  90.0
         * 임꺽정,   80,  80,  80,  240,  80.0
         * 유관순,  100, 100, 100,  300, 100.0
         

        class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }
        //학생의 성적을 저장할 메모리를 준비.
        Score s1 = new Score();
        s1.name = "홍길동";
        s1.kor = 100;
        s1.eng = 90;
        s1.math = 80;
        s1.sum = s1.kor + s1.eng + s1.math;
        s1.aver = s1.sum / 3f; //(3.f 3.0f 다 된다)
        
        Score s2 = new Score();
        s2.name = "임꺽정";
        s2.kor = 80;
        s2.eng = 80;
        s2.math = 80;
        s2.sum = s2.kor + s2.eng + s2.math;
        s2.aver = s2.sum / 3.0f;
       
        Score s3 = new Score();
        s3.name = "유관순";
        s3.kor = 100;
        s3.eng = 100;
        s3.math = 100;
        s3.sum = s3.kor + s3.eng + s3.math;
        s3.aver = s3.sum / 3f;
        
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);       
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.aver);
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",s3.name, s3.kor, s3.eng, s3.math, s3.sum, s3.aver);
    }
}
       
       */ 
        
        
        
/** #ver04
        * 배열 문법응용 
        * 여러 명의 성적을 저장하고 다음과 같이 출력하라!
         * 출력내용:
         * '''
         * 홍길동,  100,  90,  80,  270,  90.0
         * 임꺽정,   80,  80,  80,  240,  80.0
         * 유관순,  100, 100, 100,  300, 100.0
                 
        String[] names = {"홍길동", "임꺽정", "유관순"};
        int[] kor = {100, 80, 100};
        int[] eng = {90, 80, 100};
        int[] math = {80, 80, 100};
       
       for (int i=0; i<names.length; i++) {
        int sum = kor[i] + eng[i] + math[i];
        float aver = sum / 3.0f;
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",
        names[i], kor[i], eng[i], math[i], sum, aver);       
       }
    }
}
*/  


// ver03
//변수를 이용하여 이름,국어,영어,수학,총점 ,합계를 저장하라! 그런후 다음과 같이 출력하라!
//이름:홍길동
// 국어:100
// 엉어:100
// 수학:100
// 총점:300
// 평균 : 100.0
/**
 *  String name = "홍길동";
        int kor = 100;
        int eng = 97 ;
        int math = 98 ;
        int sum = kor + eng + math ;
        float aver = sum / 3.0f ;

        System.out.printf("이름: %s\n", name);
        System.out.printf("국어: %d\n", kor);
        System.out.printf("영어: %d\n", eng);
        System.out.printf("수학: %d\n", math);
        System.out.printf("총점: %d\n", sum);
        System.out.printf("평균: %f\n", aver);
 */


// ver 02
// - 학생 한 명의 성적 점수를 출력하라!
// -이름, 국어, 영어, 수학, 총좀, 평균
//  ex) 
// 이름:홍길동
// 국어:100
// 엉어:100
// 수학:100
// 총점:300
// 평균 : 100.0

/** 
//ver 01
// - 표준출력장치로 인사문구 출력하기
public class App {
    
    public static void main(String[] args) {
        // 변수를 선언하여 값을 보관한다.
        String name = "홍길동";
        int kor = 100;
        int eng = 97 ;
        int math = 98 ;
        int sum = kor + eng + math ;
        float aver = sum / 3.0f ;

        System.out.printf("이름: %s\n", name);
        System.out.printf("국어: %d\n", kor);
        System.out.printf("영어: %d\n", eng);
        System.out.printf("수학: %d\n", math);
        System.out.printf("총점: %d\n", sum);
        System.out.printf("평균: %.1f\n", aver);
     
 */       
/**
        System.out.print("이름: "); 
        System.out.println("홍길동");
        System.out.print("국어: ");
        System.out.println(100);
        System.out.print("영어: ");
        System.out.println(100);
        System.out.print("수학: ");
        System.out.println(100); 
        System.out.print("총점: ");
        System.out.println(300);
        System.out.print("평균: ");
        System.out.println(100.0);
*/

