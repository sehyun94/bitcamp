// ## 배열의 길이와 인덱스
package bitcamp.java100;

public class Test13_3{

    public static void main(String[] args)  {
// 1) 배열 레퍼런스 선언
        int[] arr1;

// 2) 배열 생성
        arr1 = new int[3];
       
// 3) 배열의 크기를 알아내기
        System.out.println(arr1.length);

// 4) 배열을 사용할 때는 반드시 유효한 인덱스를 지정해야 한다.
        arr1[0] = 100;
        arr1[1] = 90;
        arr1[2] = 80;
        //arr1[-1] = 200;
        //arr1[3] = 300;
        
    }
}

