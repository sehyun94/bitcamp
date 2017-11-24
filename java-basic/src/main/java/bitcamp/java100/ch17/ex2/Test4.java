package bitcamp.java100.ch17.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.util.ResultSetUtil;

public class Test4 {
    
    public static void main(String[] args) throws Exception {
         
        
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb","study","1111");
        
        System.out.println("연결되었음!");
        
        Statement stmt = con.createStatement();
        
        ResultSet rs = stmt.executeQuery("select * from jdbc_test"); 

        //ResultSet 도구를 사용하여 서버에 준비된 결과를 한개씩 가져오기.
        while (rs.next()) {
            
            System.out.printf("%d, %s, %s, %s, %d\n", 
                    rs.getInt("no"), // 레코드에서 값을 꺼낼 때 컬럼 이름 지정
                    rs.getString(2), // 레코드에서 값을 꺼낼때 select에서 지정한 컬럼번호 사용가능
                    rs.getString("conts"), // 하지만 컬럼명을 지정해주는 것이 좋다.
                    rs.getDate("regdt"),
                    rs.getInt("vwcnt"));
            
        }
        
        rs.close();
        
        stmt.close();
        
        con.close();
        
    }
}
