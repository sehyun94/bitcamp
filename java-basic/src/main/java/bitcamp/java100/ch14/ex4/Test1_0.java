// 데이터 프로세싱 스트림 클래스 사용법 - ObjectOutputStream
// 
package bitcamp.java100.ch14.ex4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test1_0 {
    public static void main(String[] args) throws Exception {
        
        // 다음 데이터를 출력해보자!
        // 조건: 국,영,수 각각의 만점은 1000점이다.
        Score s = new Score("홍길동", 800, 900, 1000);
        
        
        ObjectOutputStream out = new ObjectOutputStream(
                                new FileOutputStream("test0.dat"));

        // ObjectOutputStream은 인스턴스의 변수의 값을 바이트 배열로 만들어 출력한다.
        // 이것을 "serialization(직렬화)"이라 부른다
        out.writeObject(s); 
        
        out.close();
        
        System.out.println("출력을 완료했습니다.");
    }
}











