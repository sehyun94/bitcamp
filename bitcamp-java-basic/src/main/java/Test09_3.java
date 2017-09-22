// 소스 파일에서 제일 처음에 패키지를 선언한다.
// 그러면 이후에 선언되는 모든 클래스들은 이 패키지에 소속된다.

package a.b.c; //하위 패키지는 점(.)으로 구분한다.

public class Test09_3 {
  public static void main(String[]args) {
    System.out.println("Hello!");
  }
}

/* [패키지 클래스를 실행하는 방법]
*  >java -cp ./build/classes/java/main a.b.c.Test09_3
* 또는 java a.b.c.Test09_3
*[주의]
*-패키지를 클래스를 실행할 때 패키지 이름까지 포함해야 한다.
*- "-cp" 또는 "-classpath"에 패키지명까지 포함해봐야 소용없다.
* 예)
* >java -cp ./build/classes/java/main Test09_2   <== 실행 오류!
*
*/
 