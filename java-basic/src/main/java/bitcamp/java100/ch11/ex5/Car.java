package bitcamp.java100.ch11.ex5;

// Car 클래스는 자동차가 기본으로 가져야 할 필드와 메서드를 선언하고 있다.
// 목적은 서브 클래스에 이들을 물려주기 위함이다.
//이런 목적을 만든 클래는 직접 인스턴스를 생성하지 못하도록 막아야 한다.
// 어떻게 ??? ==> 추상클래스로 선언하라.

public abstract class Car {
    
    String model;
    int cc;
    
    public void stop() {
        System.out.println("멈춘다!");
    }
    
    // Car의 모든 서브 클래스가 반드시 run()을 구현하도록 강제하자!
    // 대신 수퍼 클래스에서는 구현하면 안된다!
    public abstract void run();
    
}
