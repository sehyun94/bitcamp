//클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기
package bitcamp.java100.ch06.ex1;

// 인스턴스를 만들 때 생성자 호출하기
public class Test5 {
    public static void main(String[] args) {
        // 학생의 성적 정보를 저장할 변수를 준비하라!
        Score4 score;

        // 인스턴스를만들 때 생성자 호출
        
        //score = new Score4(); // Score 4의 생성자는 파라미터 값을 받는 생성자이다
                                                  // 따라서 파라미터 값을 넘기지 않고 호출할 수 없다
                                                  // 컴파일 오류!!
        score = new Score4("임꺽정", 100, 80, 70);
        
        // 출력결과
        // 생성자에서 초기화 시킨 값이 출력된다.
        System.out.printf("이름 = %s\n", score.name);
        System.out.printf("총점 = %d\n", score.sum);
        System.out.printf("평균 = %f\n", score.aver);
        
        // 인스턴스를 만들 때 생성자를 호출하지 않는다면?
        // score = new  Score3; // 컴파일오류!!
        
        // 생성자를 호출할 때 반드시 그 생성자가 원하는 파라미터 값을 넘겨야 한다.
        // score = new Score3("홍길동"); Score3에는 문자열을 받는 생성자가 없어 컴파일 오류!!!!!!
        
    }
}
