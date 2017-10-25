// 스태틱 변수의 활용 - 상수를 사용하기 전
package bitcamp.java100.ch06.ex6;

public class Test2 {

    public static void main(String[] args) throws Exception{
    
        Car2[] cars = new Car2[6];
        
        
        cars[0]  = new Car2("티코", 900,3 ,2);
        cars[1]  = new Car2("티코", 900,2 ,1);
        cars[2]  = new Car2("티코", 900,1 ,3);
                          
        cars[3]  = new Car2("소나타", 1980,3 ,2);
        cars[4]  = new Car2("소나타", 1980,2 ,1);
        cars[5]  = new Car2("소나타", 1980,1 ,3);
        
        System.out.printf("총 생산량 = %d 대\n", Car.count);
        for(int i = 0; i < cars.length; i++) {
            System.out.printf("%d, %s, %d\n", cars[i].no, cars[i].model, cars[i].cc);
        }

    }

}
