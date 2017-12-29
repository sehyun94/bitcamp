package step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcInsert {
    
    public static void main(String[] args) throws Exception {
         
        
        //실무에서는 이방법을 주로 사용한다 
        // 왜? ==> 파라미터로 driver 값을 받을 수 있기 때문에 변경하기도 쉽기때문이다.
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb","study","1111");
        
        System.out.println("연결되었음!");
        
        // SQL문을 보내는 일을 할 객체를 Connection 객체로부터 얻는다.
        // 빈 SQL 문 객체를 만든다
        Statement stmt = con.createStatement();
        
        //Statment 객체의 메서드를 통해 SQL문을 서버에 보낸다,.
        stmt.executeUpdate("insert into jdbc_test(title,conts,regdt)"
                + " values('aaa','aaaa',now())");  // values 들어오기전에 항상 앞에 공백이 있어야한다.

        
        System.out.println("입력완료!");
        stmt.close();
        
        con.close();
        
    }
}
