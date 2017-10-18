// ## 메서드 - 인스턴스(클래스 설계도에 따라 만든 메모리)를 다루는 메서드 
// 메서드를 이용하여 인스턴스를 다루는 방법을 알아보자! 
package bitcamp.java100.Test17_17.step6;

public class Rect {

    int width;
    int height;
  
    // 인스턴스 메서드로 만들기
    //1) static 키워드를 제거한다
    //2) 인스턴스를 다룰 때 파라미터 대신 내장 변수 this 를 사용한다.
    // - 인스턴스의 전용 메서드를 호출하려면 인스턴스 주소를 사용해야 한다.
    // - 그 주소는 내장변수 this 에 자동저장된다. 

    //평방미터 를 구하는 메서드
    float area() {
        return (this.width * this.height) / 10000f;
    }
    //평을 구하는 메서드
    float pyeong() {
        return ((this.width * this.height) / 10000f / 3.3f);
    }
}
    
