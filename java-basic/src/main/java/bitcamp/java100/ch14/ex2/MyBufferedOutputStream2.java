package bitcamp.java100.ch14.ex2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MyBufferedOutputStream2  {

    OutputStream worker;
    //출력할 데이터를 모아두는 버퍼
    byte[] buf = new byte[8192];
    int len; //버퍼에 저장하는 개수
    int cursor; //저장할 위치
    
    
    public MyBufferedOutputStream2(OutputStream worker) throws FileNotFoundException {
        this.worker = worker;
    }
    
    
    

    public void write(int b) throws IOException {
        if (cursor == buf.length) { // 버퍼가 꽉찻다면 
            worker.write(buf);    // 버퍼의 내용을 파일로 출력
            cursor = 0; 
        }
        
        buf[cursor++] = (byte)b;
    }

    public void flush() throws IOException {
     // 버퍼에 남아있는 데이터를 마저 출력한다.
        worker.write(buf, 0, cursor);
        cursor = 0;
    }
}

