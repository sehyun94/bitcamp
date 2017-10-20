//클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기
package bitcamp.java100.ch06.ex1;

// 사용자 정의 데이터 타입 적용 후 
public class Test2 {
    public static void main(String[] args) {
        // 학생의 성적 정보를 저장할 변수를 준비하라!
        
        //1) 새로 만든 설계도에 따라 준비된 메모리의 주소를 저장할 변수 선언
        // => 이렇게 주소를 저장하는 변수를 "레퍼런스" 라고 부른다
        Score score;
        
        //2) 새 설계도에 따라 메모리 준비하기
        // => 이렇게 준비된 메모를 "인스턴스" or "객체" 라고 부른다
        // => new 연산자를 통해 준비된 메모리는 "힙(heap)이라 불리는 영역에 존재한다.
        score = new Score();
        
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 100;
        score.math = 100;
        score.sum = score.kor + score.eng + score.math;
        score.aver = score.sum / 3f;
    
      
   
        

    }
}
