// ##메서드 - call by yalue 와 call by reference
package bitcamp.java100;


public class Test17_14 {
    // ## call by value  
    // 메서드를 호출 할 때 값을 넘긴다
    // 호출자의 로컬 변수의 값을 변경할 수 없다.
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("swap(): a = %d, b = %d\n", a, b);
    }
    
    //## call by reference
    static void swap2(int[] r) {
        int temp = r[0];
        r[0] = r[1];
        r[1] = temp;
        System.out.printf("swap2(): r[0] = %d, r[1] = %d\n", r[0], r[1]);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        
        //호출할 때 값을 넘기는 예
        // = > "call by value" 라 부른다(int, short, char, float, double, boolean, byte, long 8가지 타입은 call by value) 
        swap(a, b);
        
        System.out.printf("main(): a = %d, b = %d\n", a, b);
       
        System.out.println("--------------------------------------------");
        // 호출할 때 메모리 주소를 넘기는 예: = > call by reference
        // swap2(&a, &b);  =< c에서는 가능하지만 자바 에서는 불가능
        int[] arr = new int[2];
        arr[0] = 5;
        arr[1] = 7;
        
        swap2(arr);
        System.out.printf("main(): arr[0] = %d, arr[1] = %d\n", arr[0], arr[1]);
        // 배열은 스텍메모리가 아닌 힙 메모리에 저장되기 때문에 메인 값이 바뀐다.
        
    }
}

