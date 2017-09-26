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
    }
}
