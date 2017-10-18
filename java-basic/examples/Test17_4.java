// ##메서드 - 메서드 정의
// 메서드 정의 기본 문법을 알아보자
package bitcamp.java100;

public class Test17_4 {
    
    // 3) 0개 이상의 아규먼트를 받을 수 있는 파라민터 선언하기
    // - 아규먼트의 개수를 확정 할 수 없는 경우에 유용 (단! 아규먼트의 타입은 같아야 한다.)
    // - 해당 파라미터는 메서드 안에서 배열로 취급한다.
    // = 문법 : 메서드명(타입... 변수명){  }
    static void m1(int... values) {
        System.out.printf("아규먼트 개수: %d\n", values.length);
        for (int v : values) {
            System.out.println(v);
        }
        System.out.println("------------------------------------");
    }
    
    //가변길이 파라미터는 오직 한개만 사용할 수 있다.
//    static void m2(int... values, int... values2) {}
//    static void m2(int...values, Strings... values2) {}

    //가변 길이 파라미터와 일반 파라미터를 섞어 쓸 때는 반드시 일반 파리미터가 먼저 와야한다.    
    
    static void m3(String name, int age, int... values){}   
//    static void m4(String name, String name int age){}   
//    static void m5(int...values String name, int age){}
    
    // 가변 길이 파라미터의 응용
    static void sum(int... values) {
        int s = 0;
        for (int v : values) {
            s += v;
     }
            System.out.printf("합계 : %d\n", s);
    }
    public static void main(String[] args) {
        m1();
        m1(10);
        m1(10, 20);
        m1(10, 20, 30);
        
        //m1(10, "hello") 컴파일 오류!
        // 다른타입의 값을 넣을수 없다/
        sum();
        sum(1, 2, 3, 4, 5, 6, 7, 8, 9);
        sum(100, 80, 70, 90) 
;    
    
    }
}    

