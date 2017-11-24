package bitcamp.java100.ch17.ex1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test4 {
    
    public static void main(String[] args) throws Exception {
         
        
        //실무에서는 이방법을 주로 사용한다 
        // 왜? ==> 파라미터로 driver 값을 받을 수 있기 때문에 변경하기도 쉽기때문이다.
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb","study","1111");
        
        System.out.println("연결되었음!");
        
        con.close();
        
    }
}
