// 데이터 프로세싱 스트림 클래스 사용법
// 
package bitcamp.java100.ch14.ex3;

import java.io.FileInputStream;

public class Test2_2 {
    public static void main(String[] args) throws Exception {
        
        // 성적 데이터를 읽어보자!
        Score s = new Score();
         
        FileInputStream  in = new FileInputStream("test2.dat");
        
        MyDataInputStream in2 = new MyDataInputStream(in);

        
        // 4) 읽은 바이트 배열을 String 객체로 만든다.
        s.setName(in2.readUTF());
        s.setKor(in2.readInt());
        s.setEng(in2.readInt());
        s.setMath(in2.readInt());
        
  

        in.close();
        
        System.out.println(s);
    }
}











