// ##래퍼(wrapper) 클래스 사용법 - 래퍼 클래스의 소개

package bitcamp.java100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test20_1 {

    public static void main(String[] args) {
        ArrayList l;
        HashSet s;
        HashMap m;
        
        // primitive 변수
        int i = 10;
        
        // int wrapper 클래스 사용
        Integer i2 = new Integer(10);
        
        // 래퍼(wrapper) 클래스?
        // -primitive 값을 객체로 다루기 위해 제공되는 클래스이다.
        // - 각각의 privitive 타입에 대한 클래스가 있따.
        //  ex)
        //  byte    => java.lang.Byte
        //  short   => java.lang.Short
        //  int     => java.lang.Integer
        //  long    => java.lang.Long
        //  float   => java.lang.Float
        //  double  => java.lang.Double
        //  boolean => java.lang.Boolean
        //  char    => java.lang.Character
        
        // 현재 클래스가 소속되어 있는 패키지가 아닌
        // 다른 패키지에 소속되어 있는 클래스를 사용할 때는
        // 반드시 클래스 앞에 패키지를 적어야 한다.
        
        // intValue()
        //> 객체에 저장된 int 값을 뽑아서 리턴해준다.
        int i3 = i2.intValue();
        
        // floatValue()
        //> 객체에 저장된 int 값을 뽑아서 float으로 만들어 리턴해준다.
        float f1 = i2.floatValue();
        
        // Integer 클래스에 있는 int로 저장할 수 있는 최소/최대값을 알려주는 변수가 있다.
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        
        // Integer 클래스에는 문자열을 해석하여 int로 변환해주는 메서드도 있다.
        int value = Integer.parseInt("2345");
        System.out.println(value + 100);
        
        // 또한 int 값을  2진수, 8진수, 16진수로 표현된 문자열로 바꾸는 메서드도 있다.
        System.out.println(Integer.toBinaryString(44032));
        System.out.println(Integer.toOctalString(44032));
        System.out.println(Integer.toHexString(44032));
        
        System.out.println(Integer.valueOf('가'));
    }
}    

