// ## 반목문 - for

package bitcamp.java100;

public class Test16_6 {

    public static void main(String[] args) {
        // = > for 기본문법
        // -for (변수 선언; 조건; 증가문) 명령문;
        for (int i = 0; i<5; i++)
            System.out.println(i);
        
        System.out.println("-----------------------");
        
        //=> 같은 타입의 변수는 여러개 선언 할 수 있다.
        for (int i = 0, j = 0; i < 5; i++, j += 2)
            System.out.printf("%d, %d\n", i, j);
        
        System.out.println("-----------------------");
        
        //=> for 문에 선언된 변수는 for 블록안에서만 사용한다.
        int sum = 0;
        for (int i = 1; i < 10; i++)
            sum += i;
            System.out.println(sum);
//            System.out.println(i); 컴파일 오류! i 는 for문의 로컬변수이다.
        
        System.out.println("-----------------------");
        
       //=> 여러문장은 블록으로 묵는다.
        for (int i = 1; i <= 10; i++) {
            System.out.print("=> ");
            System.out.println(i);
        }
        System.out.println("-----------------------");
        
        // => break
        for (int i = 0; i < 10; i++)  {
            if (i == 5)
                break;
            System.out.println(i);
        }
        
        System.out.println("-----------------------");
        
         // => continue 
        for (int i = 0; i < 10; i++)  {
            if (i == 5)
                continue;
            System.out.println(i);
        }    
        
        System.out.println("-----------------------");
        
        // = > 변수 초기화 문장 생략가능
        int i = 0;
        for (; i < 5; i++) 
            System.out.println(i);
        System.out.println(i); // i 변수는 for 의 로컬 번수가 아니다.
        System.out.println("-----------------------");
        
        //증가 감소문 생략가능
        i = 0;
        for (; i<5;) {
            System.out.println(i);
            i++;
        }
        System.out.println("-----------------------");
        
        // 조건문 생략가능
        i = 0;
        for (;;) {
            System.out.println(i);
            i++;
            if (i == 5)
                break;
        }
        System.out.println("-----------------------");

        // ##for 문의 주요 사용처
        String[] names = {"홍길동", "임꺽정", "유관순", "안중근", "윤봉길"};
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
        
        System.out.println("-----------------------");
        
        // 중첩 for 문
        
        for (int a = 1; a < 5; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
        }
        System.out.println();
        }
        
        System.out.println("-----------------------");
        // 중첩 for 문 가장 바깥쪽 반복문 탈출하기
        label1:
        for (int a = 1; a < 5; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
                if ( b == 2) 
                     break label1;
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("-----------------------");
        
        // => for 문만을 이용하여 구구단을 출력하라!
        for (int j = 2; j < 10; j++) {
            for (int k = 1; k < 10; k++) {
                System.out.printf("%d * %d = %d\n", j, k, j*k);
            }
        }
        
        // => 주어진 숫자를 거꾸로 한 개씩 출력하라!
        // 98761234
        // 출력 4 3 2 1 6 7 8 9
        int v = 98761234;
        for (; v > 0; v /= 10) {
            System.out.printf("%d ", v % 10);
        }
        System.out.println();
        
        
        System.out.println("-----------------------");
    
          
    }
}
