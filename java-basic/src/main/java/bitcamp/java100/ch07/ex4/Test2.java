// 상속 - Object 클래스의 주요 메서드

package bitcamp.java100.ch07.ex4;

public class Test2 {

    
    public static void main(String[] args) {
        
        Test2 obj = new Test2();
        
        // toString()
        System.out.println(obj.toString());
        
        //hashCode()
        System.out.println(Integer.toHexString(obj.hashCode()));
    
        System.out.println("________________________________________");
        //equals()
        Test2 obj2 = new Test2();
        Test2 obj3 = obj;
        System.out.println(obj.equals(obj2));
        System.out.println(obj.equals(obj3));
        System.out.println("________________________________________");
        //equals() 메서드를 재정의한 대표적인 클래스
        // =>String와 wrapper 클래스
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println("________________________________________");
        // => StringBuffert는 equals()를 재정의하지 않았기 때문에
        // Object의 equals 를 사용한다
        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("hello");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        
        //getClass
        //  => 인스턴스의 클래스 정보(를 담은 인스턴스의 주소)를 리턴한다.
        
        
        Class c = obj.getClass();
        System.out.println(c.getName());
    
    
    }
}

