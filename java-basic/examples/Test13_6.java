// ## 객체(object) 와 가비지(garbage)
package bitcamp.java100;

public class Test13_6{

    public static void main(String[] args)  {
//배열의 주소를 저장하는 변수 => "레퍼런스"
        int[] arr1;

// new 명령으로 준미된 메모리 => "인스턴스"(instance)" or "객체(object)"

        arr1 = new int[3];
 
// 새배열 메모리를 만들어 arr1에 주소를 저장하면 기본 배열은 주소를 잃어버린다.그러면 기존 배열 메모리는 사용할 수 없는 상태가 되는데, 이렇게 메모리만 차지하고 사용할 수 없는 인스턴스를 "가비지(garbage)"라 부른다.
        arr1 = new int[5];
    }
}

