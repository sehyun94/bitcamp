/** #ver04
* 배열 문법응용 
* 여러 명의 성적을 저장하고 다음과 같이 출력하라!
 * 출력내용:
 * '''
 * 홍길동,  100,  90,  80,  270,  90.0
 * 임꺽정,   80,  80,  80,  240,  80.0
 * 유관순,  100, 100, 100,  300, 100.0
 */

public class App2{
    public static void main(String[]args)   {
        
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
        
        
        }
    }
        
