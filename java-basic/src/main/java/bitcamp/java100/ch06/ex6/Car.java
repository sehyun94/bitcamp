package bitcamp.java100.ch06.ex6;

public class Car {
    // 모든차량이 공유하는 변수는 스태틱 변수로 선언해야 한다.
    static int count;
    
    //각 차량마다 고유정보를 저장하는 인스턴스 변수로 선언해야한다
    long no;
    String model;
    int cc;

    Car(String model, int cc) {
        count++;
        this.model = model;
        this.cc = cc;
        this.no = System.currentTimeMillis(); 
        
        // 차량의 고유 번호는 no 라는 변수에 저장된다.
        // 그런데 차량의 고유 번호가 현재 실행 시간을 저장한다.
        try { // 객체 생성하는데 최소 0.05 초 걸린다고 가정
            Thread.currentThread().sleep(50);   // 0.05초동안 실행하지 않는다
        } catch (Exception e) {}
    }
}
