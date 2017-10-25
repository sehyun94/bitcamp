// 클래스 멤버와 인스턴스 멤버의 활용
package bitcamp.java100.ch06.ex4;

//4단계 : 클래스 분리
        // 계산을 수행하는 코드를 별도의 클래스로 분류해두면
//          다른 프로그램을 개발할 때 재사용하기 쉬울 것 이다.
public class Test5 {
    
   
    
    public static void main(String[] args) {
        // 2 + 5 * 3 - 7 / 2 = ?
        // 3 * 6 - 5 + 11 / 2 = ?
        // => 단 연산자 우선순위는 적용하지 않고 그냥 순서대로 계산하라!
        
        //첫 번째 식 계산: 2 + 5 * 3 - 7 / 2 = ?
        Calculator1.plus(2);
        Calculator1.plus(5);
        Calculator1.multiple(3);
        Calculator1.minus(7);
        Calculator1.divide(2);
        System.out.println(Calculator1.result);

        //두 번째 식 계산: 3 * 6 - 5 + 11 / 2 = ?
        Calculator1.result = 0;
        Calculator1.plus(3);
        Calculator1.multiple(6);
        Calculator1.minus(5);
        Calculator1.plus(11);
        Calculator1.divide(2);
        System.out.println(Calculator1.result);
    }

}
