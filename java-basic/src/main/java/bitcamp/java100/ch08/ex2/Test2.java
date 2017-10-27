// 다형성(polymorphism) - 다형적 변수(polymorphic variables)
package bitcamp.java100.ch08.ex2;

public class Test2 {

    public static void main(String[] args) {
        
        
        Car c;
        
        //하위 클래스의 객체를 가리킬 수 있는 이유?
        c = new Car();

        c.model = "티코";
        c.capacity = 4;
        c.enginType = "경유";
        c.cylinder = 4;
        c.valve = 16;
        
        // c.auto = true;
        
        c = new Truck(); // 하위 분류를 카리킬 수 있다.
        // 위의 c 변수는 실제 Truck 인스턴스를 가리킨다.
        c.model = "타이탄";
        c.capacity = 3;
        c.enginType = "경유";
        c.cylinder = 8;
        c.valve = 32;
        // 비록 c가 Truck의 인스턴스를 가리키고 있더라도 c 의 변수를 통해서는 사용할 수 없다.
        //c.weight = 15;
        //c.dump = true;
        
        c = new Sedan();
        
    }

}
