package bitcamp.java100.ch21.ex7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Front {
    @Override
    public String toString() {
        return "Front [x=" + x + "]";
    }
    @Autowired X x;
    public void test(String name) {
        System.out.println("Front.test() 호출시작----------------");
        try {
            String str = x.m1(name);
            System.out.println(str);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("----------------  Front.test() 호출끝 ");
    }
 }
