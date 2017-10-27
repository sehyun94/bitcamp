// 상속 - java.lang.Object 클래스
package bitcamp.java100.ch07.ex4;


// Test1 클래스는 수퍼클래스를 지정하지 않았다.
// 따라서 컴파일러가 Object를 수퍼클래스로 자동으로 지정한다
public class Test1 /*extends Object*/ {

    // 모든 클래스에는 그 클래스 정보가 담겨있는 인스턴스의 주소를 가지고 있다.
    // 어느 변수에?
    // => static Class class = ....;
    
    public static void main(String[] args) {
        // 해당 인스턴스가 어떤 클래스의 자손인지 검사하기
        // instance of 연산자 사용
        Test1 obj = new Test1();
        // 증명1
        if (obj instanceof Test1) 
            System.out.println("obj는 Test1의 인스턴스 이다.");
        
        if (obj instanceof Object) 
            System.out.println("obj는 Object의 인스턴스 이다.");
        
        // 증명2
        // 클래스 정보를 살펴본다.
        
        // Test1 클래스의 정보를 담은 인스턴스 주소를 얻는다.
        Class c = Test1.class;
        
        // Test1의 수퍼 클래스 정보를 담은 인스턴스 주소를 얻는다.
        Class sc = c.getSuperclass(); // Test1의 수퍼 클래스의 정보를 얻는다
        
        // 수퍼 클래스의 정보를 담은 인스턴스를 사용하여 클래스 이름을 뽑아낸다
        System.out.println(sc.getName());
        
        //Object 클래스의 수퍼 클래스는?
        Class sc2 = sc.getSuperclass();
        System.out.println(sc2.getName()); // Object 클래스의 수퍼 클래스는 존재하지 않는다.
                                          // nullpointExceptionError
    }

}
