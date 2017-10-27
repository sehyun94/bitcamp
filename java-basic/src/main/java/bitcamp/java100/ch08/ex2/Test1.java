// 다형성(polymorphism) - 다형적 변수(polymorphic variables)
package bitcamp.java100.ch08.ex2;

public class Test1 {

    public static void main(String[] args) {
        
        Vehicle v;
        v = new Vehicle();
        v = new Boat();
        v = new Car();
        v = new Sedan();
        v = new Truck();
        
        Boat b;
        b = new Boat();
        // b = new Vehicle(); 하위분류로  상위분류를 가리킬 수 없다.
        // b = new Car(); 다른 파생 분류를 가리킬 수 없다.
        // b = new Sedan(); 다른 파생 분류를 가리킬 수 없다.
        // b = new Truck(); 다른 파생 분류를 가리킬 수 없다.
        
        Car c;
        c = new Car();
        c = new Truck();
        c = new Sedan();
        // c = new Boat(); 다른 파생 분류를 가리킬 수 없다.
        // c = new Vehicle(); 하위분류로  상위분류를 가리킬 수 없다.
        
        Sedan s;
        s = new Sedan();
        //c = new Car(); 하위분류로  상위분류를 가리킬 수 없다.
        //c = new Truck(); 다른 파생 분류를 가리킬 수 없다.+
    }

}
