// ##import - 클래스가 어떤 패키지에 있는지 컴파일러에게 알리는방법

package bitcamp.java100;
//import 명령
//- 반드시 클래스 선언 위에 적어야 한다.
//- package 명령 다음에 적어야 한다.
import java.util.ArrayList;
//이렇게 아래에서 사용할 클래스가 어떤 패키지에 있는지 컴파일러에게 알려준다.
//이명령은 컴파일할 때 사용하고 컴파일이 끝나면 제거된다.
//즉 컴파일할 때 ArrayList는 모두 java.util.ArrayList로 바뀐다.
//따라서 import 명령어가 많이 있다 하더라도 .class 파일에 들어가지 않기 때문에
//많이 작성하는 것에 대해 두려워 말라!

//java.lang 패키지에 들어있는 클래스들은 자바 프로그래밍에서 가장 많이 사용하는 
//핵심 클래스들이기 때문에 import를 따로 선언하지 않아도 찾는다.
//import java.lang.String;
//
//주의!
//java.lang 패키지만 해당된다.
//그 하위 패키지는 해당되지 않는다.
//ex) java.lang.reflect, java.lang.annotation, java.lang.invoke 패키지의 소속된
//클래스를 사용할 때는 무조건 import를 선언해야한다.
public class Test19_2 {

    public static void main(String[] args) {
        ArrayList<java.lang.String> list = new ArrayList<>();
        list.add("홍길동");
    }
}    

