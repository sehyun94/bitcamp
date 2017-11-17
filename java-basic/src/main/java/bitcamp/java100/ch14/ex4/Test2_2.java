// 데이터 프로세싱 스트림 클래스 사용법 - ObjectOutputStream
// 
package bitcamp.java100.ch14.ex4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test2_2 {
    public static void main(String[] args) throws Exception {
        
        // 다음 데이터를 출력해보자!
        // 조건: 국,영,수 각각의 만점은 1000점이다.
        
        
        ObjectInputStream in = new ObjectInputStream(
                                new FileInputStream("test2_new.dat"));

        // ObjectOutputStream은 인스턴스의 변수의 값을 바이트 배열로 만들어 출력한다.
        // 이것을 "serialization(직렬화)"이라 부른다
        Score3 s = (Score3)in.readObject();
        
        in.close();
        
        System.out.println(s);
    }
}











