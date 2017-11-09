package bitcamp.java100.ch13.ex7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test2 {

    
    static void m1(int i) throws Exception, SQLException, IOException, FileNotFoundException {
        switch (i) {
        case 1: throw new Exception();
        case 2: throw new SQLException();
        case 3: throw new IOException();
        case 4: throw new FileNotFoundException();
        }
    }
    
    public static void main(String[] args) throws IOException, Exception {
        //예외를 던지는 메소드 호출하기
        //1) try ~ catch 로 하나씩 예외 받기
        
        try {
            m1(2);
        } catch (FileNotFoundException e) {
        } catch (SQLException e) {
        } catch (IOException e) {
        } catch (Exception e) {
        }
        
        //2) try~ catch~ 로 한번에 받기
        try {
            m1(1);
        } catch (Exception e) {
        }
        
        //3) 일부는 받고 일부는 상위 호출자에게 책임을 넘기기
        //  m1() 메서드가 던지는 예외 중에서 2개만 받고
        // 나머지는 main()메소드에 넘기기
        try {
            m1(3);
        } catch (SQLException e) {
        } catch (FileNotFoundException e) {
        }
        
    }
}
