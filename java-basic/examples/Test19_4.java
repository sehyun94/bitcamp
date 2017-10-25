// ##import - 클래스가 어떤 패키지에 있는지 컴파일러에게 알리는방법

package bitcamp.java100;

// import 선언할 때 와일드 카드(*)로 선언하면 
// 클래스 이름까지 자세하게 적을 필요가 없어 편리하다.
import java.util.*;
import java.io.*;
import java.net.*;

// 단 클래스가 어떤 패키지에 소속되어 있는지 널리 알려진 경우에는 괜찮지만 ,
// 잘 알려진 클래스가 아닌 경우에는 오히려 그 클래스가 어떤 패키지인지
// 확인할 수 없어서 코드를 해석하기 어렵게 만든다.

public class Test19_4 {

    public static void main(String[] args) {
        
        ArrayList<java.lang.String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        HashMap<String,Object> map = new HashMap<>();
        
        File f;
        FileInputStream in;
        FileOutputStream out;
        
        Socket s;
        ServerSocket ss;
        URL url;
        Long a = Long.parseLong("12626262626260");
        
        System.out.println(a);
        
        int[] cnt = new int[10];

        while (a > 0) {
//            long i = a % 10;
//            cnt[(int)i]++;
            cnt[(int)(a % 10)]++;
           a /= 10;
        }

        
        }
}    

