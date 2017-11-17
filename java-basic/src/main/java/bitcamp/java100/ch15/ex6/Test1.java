// 프로그램 아규먼트와 VM 아규먼트 
package bitcamp.java100.ch15.ex6;

import java.util.Properties;
import java.util.Set;

public class Test1 {

    public static void main(String[] args) {
        
        // 프로그램 아규먼트 추출하기 
        System.out.println("-------------------------------");
        for (String value : args) {
            System.out.println(value);
        }
        
        // => VM 아규먼트 추출하기
        System.out.println("------------------------");
        
        System.out.println(System.getProperty("aaa"));
        System.out.println(System.getProperty("bbb"));
        
        // VM에 설정된 모든 프로퍼티 값 출력하기
        System.out.println("----------------");
        Properties props = System.getProperties();
        Set<Object> keySet =  props.keySet();
        for (Object key : keySet) {
            System.out.printf("%s = %s\n", key, props.get(key));
        }
        
    }

}
