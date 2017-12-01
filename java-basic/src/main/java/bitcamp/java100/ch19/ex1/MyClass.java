package bitcamp.java100.ch19.ex1;

import bitcamp.java100.ch19.ex2.MyAnnotation2;
import bitcamp.java100.ch19.ex2.MyAnnotation3;
import bitcamp.java100.ch19.ex2.MyAnnotation4;

@MyAnnotation
@MyAnnotation2
@MyAnnotation3
@MyAnnotation4
// MyAnnotatinoon
public class MyClass {

    @MyAnnotation
    public int a;

    @MyAnnotation
    public void m() {
        System.out.println("hello");
    } 

    public void m2(@MyAnnotation int a, @MyAnnotation String b)  {
        @MyAnnotation
        int x = 10;
    }
}
