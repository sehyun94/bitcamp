package bitcamp.java100.ch17.ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Test1 {
    
    public static void main(String[] args) throws Exception {
         
        
        //실무에서는 이방법을 주로 사용한다 
        // 왜? ==> 파라미터로 driver 값을 받을 수 있기 때문에 변경하기도 쉽기때문이다.
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb","study","1111");

        //SQL 문 준비
        PreparedStatement pstmt = con.prepareStatement(
                "insert into jdbc_test(title,conts,regdt) values(?,?,now())");
        // 값 준비
        pstmt.setString(1,"제목이래요");
        pstmt.setString(2,"내용이래요");
        
        //SQL 전송
        pstmt.executeUpdate();
        
        System.out.println("입력완료!");

        pstmt.close();
        
        con.close();
        
    }
}
