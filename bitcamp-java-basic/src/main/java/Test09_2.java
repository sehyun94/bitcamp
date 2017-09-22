// 소스 파일에서 제일 처음에 패키지를 선언한다.
// 그러면 이후에 선언되는 모든 클래스들은 이 패키지에 소속된다.

package a;

public class Test09_2 {
  public static void main(String[]args) {
    System.out.println("Hello!");
  }
}

/*[패키지 소속 클래스]
* -위와 같이 특정 패키지에 소속된 클래스를 말한다.
* - 컴파일러가  패키지 클래스를 컴파일 할 때 
* 패키지에 해당하는 폴더를 자동 생성한다.
* 
* [패키지 클래스를 실행하는 방법]
* 1)패키지 무소속 클래스
*   >java -cp ./build/classes/java/main Test09_1
* 2)패키지 소속 클래스
* 패키지명을 포함하여 클래스명을 지정한다.
*  >java -cp ./build/classes/java/main Test09_1
*
*[주의]
*-패키지를 클래스를 실행할 때 패키지 이름까지 포함해야 한다.
*- "-cp" 또는 "-classpath"에 패키지명까지 포함해봐야 소용없다.
* 예)
* >java -cp ./build/classes/java/main Test09_2   <== 실행 오류!
*
*/
 