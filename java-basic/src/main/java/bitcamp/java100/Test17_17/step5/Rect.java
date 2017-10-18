// ## 메서드 - 인스턴스(클래스 설계도에 따라 만든 메모리)를 다루는 메서드 
// 메서드를 이용하여 인스턴스를 다루는 방법을 알아보자! 
package bitcamp.java100.Test17_17.step5;

public class Rect {

    int width;
    int height;
    static float area(Rect r) {
        return (r.width * r.height) / 10000f;
    }
    //평을 구하는 메서드
    static float pyeong(Rect r) {
        return ((r.width * r.height) / 10000f / 3.3f);
    }
    
}  