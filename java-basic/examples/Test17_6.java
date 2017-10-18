// ##메서드 - 메서드 정의
// 값을 반환하는 메서드 정의 
// 메서드 정의 기본 문법을 알아보자
package bitcamp.java100;
public class Test17_6 {

    /**5) 여러개의 값을 반환하는 방법
    -자바에는 여러개의 문자를 반환하는 방법이 없다
    
    해결책?
    배열이나 객체에 담아서 반환*/
    static int[] m1() {
       // 배열을 초기화 시키는 문법은 배열 레퍼런스 변수 선언문과 함께 사용해야 한다.
        int[] values = {100, 90, 80}; 
        
//        만약 레퍼런스 변수를 선언한 다음에 초기하 시키려면 반드시 new 명령을 작성해야한다.
        int[] values2;
//        values = {100, 90, 80}   < = 컴파일 오류
        values2 = new int[] {100, 90, 80};

            //다음과 같이 배열을 바로만들 값 을 리턴할 경우는 컴파일 오류ㅣ!!
//        return {100, 90, 80};
        
        return new int[] {100, 90, 80};
                }
    
    public static void main(String[] args) {
            
            int[] arr = m1();
            for (int i : arr) {
                System.out.println(i);
        }
        
    }
}    

