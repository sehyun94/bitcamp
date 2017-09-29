// ## 배열 초기화
package bitcamp.java100;

public class Test13_4{

    public static void main(String[] args)  {
// 1) 배열 레퍼런스 선언과 동시에 배열 생성
        int[] arr1 = new int[3];

// 배열 생성과 동시에 값 초기화
// => 방법1
//      초기화 시키는 값 개수만큼 배열을 만든다.
        //int[] arr2 = new int[3] {100, 90, 80};  컴파일 오류      
        int[] arr2 = new int[] {100, 90, 80};     
// 레퍼런스 먼저 만든 후 배열 생성을 할 수 있다.        
        int[] arr3;
        arr3 = new int[] {90, 80, 70};
 // => 방법2       
         int[] arr4 = {100, 200, 300};
// 단, 레퍼런스 선언과 동시에 값을 초기화 할때만 new int[]를 생략가능
       // int[] arr5;
       // arr5 = {100, 200, 300}; 컴파일오류!
       

    }
}

