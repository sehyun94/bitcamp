// 인터페이스 구현체 사용하는 입장
package bitcamp.java100.ch12.ex2;

import java.util.Iterator;

public class Caller2 {

    public static void main(String[] args) {
        
        Array list = new Array();
        list.add("홍길동");
        list.add("임꺽정");
        list.add("유관순");
        
        // caller 쪽 클래스를 만드는 입장에서 코딩해보자!
        
        Iterator<String> iterator = list.iterator();
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
