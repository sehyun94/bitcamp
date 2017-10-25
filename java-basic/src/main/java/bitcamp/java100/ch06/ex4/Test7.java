// 클래스 멤버와 인스턴스 멤버의 활용
package bitcamp.java100.ch06.ex4;

//7단계 : 인스턴스 메서드의 활용 
//        => 인스턴스 메서드를 사용하면 인스턴스 멤버를 보다 쉽게 다룰 수  있다.
//        => 왜? 인스턴스 메서드에서 인스턴스 주소를 보관하는 내장변수 this가 있다.
//        
//        
public class Test7 {
    
   
    
    public static void main(String[] args) {
        // 2 + 5 * 3 - 7 / 2 = ?
        // 3 * 6 - 5 + 11 / 2 = ?
        // => 단 연산자 우선순위는 적용하지 않고 그냥 순서대로 계산하라!
        
        // 
        Calculator3 c1 = new Calculator3();
        Calculator3 c2 = new Calculator3();
        
        //첫 번째 식 계산: 2 + 5 * 3 - 7 / 2 = ?
        c1.plus(2);
        c1.plus(5);
        c1.multiple(3);
        c1.minus(7);
        c1.divide(2);
        System.out.println(c1.result);

        //두 번째 식 계산: 3 * 6 - 5 + 11 / 2 = ?
        c2.plus(3);
        c2.multiple(6);
        c2.minus(5);
        c2.plus(11);
        c2.divide(2);
        System.out.println(c2.result);
    }

}

// plus, minus, multiple, divide 메서드는 stack 메모리
//      Calculator2 c1 = new Calculator2(); , Calculator2 c2 = new Calculator2(); 인스턴스 메모리


