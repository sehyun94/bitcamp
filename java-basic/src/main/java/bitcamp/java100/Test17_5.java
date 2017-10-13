// ##메서드 - 메서드 정의
// 값을 반환하는 메서드 정의 
// 메서드 정의 기본 문법을 알아보자
package bitcamp.java100;
public class Test17_5 {

    // 값을 반환하는 메서드는 선언문 앞에 반환하는 데어터의 타입을 지정해야 한다.
    // 값을 반환하지 않을 때는 void를 적는다.
    static String m1() {
        return "hello";
    }
    static int m2() {
        return 100;
    }
    static boolean m3() {
        return true;
    }
        // 메서드에 선언된 리턴 타입과 실제 반환 하는 데이터의 타입이 일치해야한다. 일치하지 않으면 컴파일 오류이다!
//    static int m4() {return "hello";} 
//    static int m5() {} 리턴값을 주지 않아도 컴파일 오류이다!
    // return 명령을 수행하는 즉시 메서드 실행을 멈추고 호출한데로 간다.
    // 따라서 return 명령 다음에 다른 명령을 작성해서는 안된다.
/**    static int m6() {
        return 100;
        int a = 100;
        a++;
    } */
    
    public static void main(String[] args) {
        
        //값을 반환하는 메서드 호출
        String v = m1();
        System.out.println(v);
        
        //반환 받은 값을 변수에 저장하지 않고 바로 사용가능
        System.out.println(m1());
        
        //반환 값을 다루지 않아도 된다.
        m1(); // 변환 값을 저장하지 않으면 값은 버린다. 
        
        // 반환 값의 타입과 다른 메모리에 저장할수 없다
//        String s = m2(); 리턴 값은 int인데 String 값에 저장하려 한다. 컴파일 오류 .
        
    }
}    

