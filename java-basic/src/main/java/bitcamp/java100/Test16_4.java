// ## 반복문 while
//

package bitcamp.java100;

public class Test16_4 {

    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.print("=> ");
            System.out.println(i);
            i++;
        }
        System.out.println("---------------------");

        i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("---------------------");

        // while 문 중첩
        i = 1;
        while (i <= 5) {
            int count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i++;

        }
        System.out.println("------------------------------");
        i = 1;
        while (i <= 5) {
            int count = 5 - i;
            while (count > 0) {
                System.out.print(" ");
                count--;
            }
            count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i++;
        }

        System.out.println("------------------------------");

        i = 1;
        while (i <= 5) {
            int count = (5 - i) / 2;
            while (count > 0) {
                System.out.print(" ");
                count--;
            }

            count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i += 2;
        }

        System.out.println("------------------------------b");

        i = 5;
        while (i >= 1) {
            int count = (5 - i) / 2;
            while (count > 0) {
                System.out.print(" ");
                count--;
            }

            count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i -= 2;
        }

        System.out.println("------------------------------");

        // => break : 반목문을 멈추고 나가는 명령

        i = 0;
        while (i < 5) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
            i++;
        }

        System.out.println("------------------------------");

        // =>continue : 반목문 안에서 다음줄로 넘어가지 않고 바로 조건 검사로 이동시키는 명령
        i = 0;
        while (i < 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

        System.out.println("------------------------------");

        i = 1;
        label1: {
            while (i <= 10) {
                int count = 1;
                while (count <= i) {
                    System.out.print("*");
                    if (count == 5) {
                        // break; (현재 반복문을 탈출)
                        break label1; // (label1 블록을 탈출)
                    }
                    count++;
                }
                System.out.println();
                i++;
            }
        }
        System.out.println();
        System.out.println("------------------------------");

        // 라벨에 한 문장만 있을 경우 블록을 치지 않아도 된다.
        i = 1;
        label1: while (i <= 10) {
            int count = 1;
            while (count <= i) {
                System.out.print("*");
                if (count == 5) {
                    // break; (현재 반복문을 탈출)
                    break label1; // (label1 블록을 탈출)
                }
                count++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        System.out.println("------------------------------");

        // => 2단에서 9단까지 구구단을 출력하라
        i = 2;
        while (i <= 9) {
            int count = 1;
            while (count <= 9) {
                System.out.printf("%d * %d = %d\n", i, count, i * count);
                count++;
            }
            System.out.println();
            i++;
        }
        System.out.println("------------------------------");

        // 주어진 숫자를 뒤에서 부터 한 개 씩 출력하라
        // 987654321 => 1 2 3 4 5 6 7 8 9
        i = 987654321;
        while (i > 0) {
            System.out.printf("% d", i % 10);
            i /= 10;
        }
        System.out.println();
        System.out.println("------------------------------");
        
        // 주어진 숫자에서 1에서 9까지 등장하는 숫자의 개수를 세어라!
        // 주어지는 값 => 4885323
        // 출력 
        // 0 = 0 
        // 1 = 0 
        // 2 = 1
        // 3 = 2
        // 4 = 1
        // 5 = 1
        // 6 = 0
        // 7 = 0
        // 8 = 2
        // 9 = 0
        i = 4885323;
        int[] cnt = new int[10];
        
        while (i > 0) {
            cnt[i %10]++;
            i /= 10;
        }
        int x = 0;
        while (x < cnt.length) {
            System.out.printf("%d = %d\n" ,x, cnt[x]);
            x++;
        }
        
    }
}
