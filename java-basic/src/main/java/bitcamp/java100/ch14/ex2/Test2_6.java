//FileOutputStream => MyBufferedFileOutputStream
package bitcamp.java100.ch14.ex2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Test2_6 {
    public static void main(String[] args) throws Exception {
        
        // 데이터 준비 
        // => 랜덤 메서드를 사용하여 임의의 값을 400만개를 준비한다.
        int[] data = new int[4000000];
        
        for (int i = 0; i < data.length; i++) {
            data[i] = (int)(Math.random() * 100000);
        }
        
        
        // 파일에 출력할 객체 생성
        FileOutputStream out = new FileOutputStream("./test2.dat");
        BufferedOutputStream out2 = new BufferedOutputStream(out);
        // 4백만개의 데이터를 출력해보고, 걸린 시간을 알아보자!
        
        long start = System.currentTimeMillis();
        
        for (int b : data) {
            out2.write(b);
        }
//        버퍼에 남은 마지막 찌그러기 출력하기
        out2.flush();
        
        long end = System.currentTimeMillis();
        System.out.printf("걸린시간 = %d\n", end - start);
        
        out.close();
        
    }
}

