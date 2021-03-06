// ##// ##클래스 문법을 사용하여 메서드를 분류(classification)한다 
// 
package bitcamp.java100.other;


public class Test99 {
  

        
        static int m1() {
            int a = 100;
            int b = 200;
            int c = a + b;
            return c; // 로컬 변수의 c의 값을 리턴한다.
        }
        
        // ### 메서드에서 만든 배열의 생명주기
        // - new 연산자를 통해 만든 배열은 Heap 영역에 존재하기 때문에
        //   메서드 호출 끝나더라도 유지된다.
        static int[] m2() {
            int[] arr = new int[3];
            arr[0] = 100;
            arr[1] = 200;
            arr[2] = 300;
            return arr; // 배열의 주소를 리턴한다.
            // 이때 arr는 로컬 변수이기 때문에 호출이 끝나면 제거된다.
        }
        
        public static void main(String[] args) {
            int r1 = m1();
            
            // m1()에서 만든 로컬 변수는 접근할 수 없다.
            //a = 300; // 컴파일 오류!
            //b = 300; // 컴파일 오류!
            //c = 300; // 컴파일 오류!
            
            //m1()의 로컬 변수 c의 값은 r1 변수에 리턴 받았기 때문에 사용할 수 있다.
            System.out.println(r1);
            
            System.out.println("---------------------------------------");
            
            int[] r2 = m2();
            // m2()에서 만든 배열을 m2() 호출이 끝나더라도 사용할 수 있다.
            // 이유? new 로 만든 메모리는 Heap 영역에 생성되기 때문이다.
            // Stack 영역에 생성된 로컬 변수는 메서드 호출이 끝나면 사라지지만,
            // Heap 영역에 생성된 변수는 메서드 호출이 끝나더라도 사라지지 않는다.
            
            for (int i : r2) {
                System.out.println(i);
            }
        }
    }

