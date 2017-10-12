// ##메모리에 값 저장
package bitcamp.java100;

public class Test12_2{

    public static void main(String[] args)  {
        int i;
        int j;
        i = 100;
        j = i;

        System.out.println(i);
        System.out.println(j);

// => l-value 에는 값이 올 수 없다.       
        //100 = 200;

 // => 메모리를 준비할 때 선언한 것과 다른 종류의 값을 저장할 수 없다.
       // i = 3.14;
    }
}

