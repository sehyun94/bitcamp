// ##키보드로부터 입력받기  
// -Scanner 클래스를 사용하여 키보드로부터 입력 받는 방법을 알아보자!!

package bitcamp.java100;

import java.util.Scanner;

public class Test21_1 {

    public static void main(String[] args) {
        // System.in 객체
        // - System 클래스에 선언된 변수이다.
        // - 키보드 정보가 들어있는 객체를 가리킨다. 즉 그 객체의 주소를 갖고 있다.
        
        // System.out 객체
        // -System 클래스에 선언된 레퍼런스
        // 표준 출력장치인' 콘솔 또는 명령창' 정보가 들어 있는 객체를 가리킨다.
        // - 즉 그객체의 주소를 갖고 있다.
        
        //1)준비
        // -scanner 객체생성
        // 생성할 때 키보드 정보를 넘긴다
        Scanner keyScan = new Scanner(System.in);
        
        //2) 스캐너 객체를 이용하여 키보드로부터 들어온 데이터 읽기
        // nextLine() : 입력된 내용을 한 줄씩 잘라서 리턴
        //              즉 사용자가 한줄 입력을 완료 까지 리턴하지 않는다
        System.out.print("입력하세요:");
        
        String line = keyScan.nextLine();
        
        System.out.println(line);
        
        //3) 사용완료 후 그 객체가 사용한 자원을 해제시킨다 
        // - OS에서 제공하는 자원 중에서 다른 프로그램이 사용할 수 있도록 풀어줘야 하는 자원있다.
        // - 이러한 자원을 사용하는 경우, 쓸 때만 묶어두고 쓰지 않으면 즉시 풀어주는 방식으로 코드를 작성해야 한다.
        // -그런 객체는 보통 클래스에 close() 라는 메서드를 갖고 있다.
        // 이런 클래스를 사용할 때는 사용후 close()를 호출하도록 하라!
        // 단 즉시 JVM을 종료하는 경우, close()를 호출하지 않아도 된다.
        //왜 ? JVM이 종료하되면 VM에서 사용한 모든 자원은 OS가 강제 수거한다.
        keyScan.close();
    }
}    

