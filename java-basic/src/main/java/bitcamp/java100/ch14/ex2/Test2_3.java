// 파일 읽기 : Byte 스트림으로 읽기
package bitcamp.java100.ch14.ex2;

import java.io.FileOutputStream;

public class Test2_3 {
    
    public static void main(String[] args) throws Exception {
        
        // 데이터 준비
        // => 랜덤 메서드를 사용하여 임의의 값을 400만개 준비한다.
        byte[] data = new byte[4000000];
        for(int i = 0; i < data.length; i++) {
            data[i] = (byte)(Math.random() * 255); // 바이트는 최대 255 넘어갈수 없다
        }
        
        
        
        FileOutputStream out = new FileOutputStream("./test3.dat");
        

        
        // 4백만개의 데이터를 출력해보고 걸린시간 알아보자
        long start = System.currentTimeMillis();
        int len = 0;
        for(int i = 0; i < data.length; i += 8192) {
//            if(data.length - i > 8192)
//                out.write(data, i, 8192);
//            else 
//                out.write(data, i, data.length - i);
            out.write(data, i, 
                    (data.length - i) > 8192 ? 8192 : data.length - i);
        }

        // 읽은후에 시간을 저장한다 
        long end = System.currentTimeMillis();
        //총읽은 바이트수를 출력
        System.out.printf("걸린시간 = %d\n", (end - start));
        
        out.close();
    } 
   
}
