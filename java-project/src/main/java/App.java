/** #ver04
* 배열 문법응용 
* 여러 명의 성적을 저장하고 다음과 같이 출력하라!
 * 출력내용:
 * '''
 * 홍길동,  100,  90,  80,  270,  90.0
 * 임꺽정,   80,  80,  80,  240,  80.0
 * 유관순,  100, 100, 100,  300, 100.0
 */

public class App{
    public static void main(String[]args)   {
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

