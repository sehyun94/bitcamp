// ## 배열 선언
package bitcamp.java100;

public class Test13_2{

    public static void main(String[] args)  {
//배열 만들기
        int[]  arr1; // 주로 java 표기법
        int arr2[]; // 주로 c 언어 표기법

        // arr1 = 100 ;
        // arr2 = 100 ;
        
        arr1 = new int[3];
        arr2 = new int[4];
        
        arr1[0] = 100;
        arr1[1] = 90;
        arr1[2] = 80;        
        System.out.printf("%d,%d,%d\n", arr1[0], arr1[1], arr1[2]);

        arr2[0] = 100;
        arr2[1] = 200;
        arr2[2] = 300;
        arr2[3] = 400;
        System.out.printf("%d,%d,%d,%d\n", 
        arr2[0], arr2[1], arr2[2], arr2[3]);

    }
}

