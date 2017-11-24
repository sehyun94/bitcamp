package bitcamp.java100.ch17.ex5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test2 {
    
    public static void main(String[] args) throws Exception {
         
        Scanner keyboard = new Scanner(System.in);
        //실무에서는 이방법을 주로 사용한다 
        // 왜? ==> 파라미터로 driver 값을 받을 수 있기 때문에 변경하기도 쉽기때문이다.
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb","study","1111");
        
        // 오토커밋 해제
        con.setAutoCommit(false);
        
        //SQL 문 준비
        PreparedStatement pstmt = con.prepareStatement(
                "insert into jdbc_test(title,conts,regdt) values(?,?,now())");
        
        // 값 준비
        
        // 트랜잭션 묶기 시작
        while(true) {
        System.out.print("제목?");
        String title = keyboard.nextLine();
        
        System.out.print("내용?");
        String contents = keyboard.nextLine();
        
        pstmt.setString(1, title);
        pstmt.setString(2, contents);
        
        //SQL 전송
        
        pstmt.executeUpdate();
        System.out.println("입력완료!");
        
        System.out.print("계속 입력하시겠습니까?(Y/n)");
        String str = keyboard.nextLine().toLowerCase();
        if(str.equals("n"))
            break;
        con.commit();
        
        }
        con.commit();
        pstmt.close();
        con.close();
        keyboard.close();
        
    }
}
