// 스태틱 변수의 활용 - 상수를 사용한 후
package bitcamp.java100.ch06.ex6;

public class Test3 {

    public static void main(String[] args) throws Exception{
    
        Car3[] cars = new Car3[6];
        
        
        cars[0]  = new Car3("티코", 900, Car3.TYPE_BUS , Car3.USE_COMPANY);
        cars[1]  = new Car3("티코", 900, Car3.TYPE_SEDAN ,Car3.USE_PRIVATE);
        cars[2]  = new Car3("티코", 900, Car3.TYPE_TRUCK , Car3.USE_COMMERCIAL);
                          
        cars[3]  = new Car3("소나타", 1980, Car3.TYPE_TRUCK , Car3.USE_PRIVATE);
        cars[4]  = new Car3("소나타", 1980, Car3.TYPE_SEDAN ,Car3.USE_COMPANY);
        cars[5]  = new Car3("소나타", 1980, Car3.TYPE_BUS , Car3.USE_COMMERCIAL);
        
        System.out.printf("총 생산량 = %d 대\n", Car3.count);
        for(int i = 0; i < cars.length; i++) {
            System.out.printf("%d, %s,  %d\n", 
                    cars[i].no, cars[i].model, cars[i].cc );
        }

    }

}
