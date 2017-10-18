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

      int number = 123321;
      int tmp = number;
      int result = 0;
      while (tmp != 0) {
          result = result * 10 + tmp % 10;
          tmp /= 10;
          System.out.println(result);
      }
      if(number == result)
          System.out.println( number + "는 회문수 입니다 ."); 
      else
          System.out.println( number + " 는 회문수 아닙니다.");       
    }
}    
