package step11;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//쿠키(cookie)
// => 서버가 보낸 데이터를 클라이언트에 저장하는 기술
// => 클라이언트는 서버로부터 받은 쿠키 데이터를 보관하고 있다가
//    조건에 맞는 경로로 서버에 요청할 경우, 
//    보관된 데이터를 요청 헤더에 포함시켜 서버에 보낸다.
// => 쿠키의 보관기간을 설정할 수 있으며, 서버에 전달할 때 그 경로 범위를 지정할 수 있다.
@SuppressWarnings("serial")
@WebServlet("/step11/Servlet01")
public class Servlet01 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        // 클라이언트에게 보낼 쿠키 준비 
        Cookie cookie = new Cookie("name", "hong");
        
        //응답 헤더에 추가 
        res.addCookie(cookie);
        
        res.addCookie(new Cookie("age", "20"));
        res.addCookie(new Cookie("working", "false"));
        
        res.setContentType("text/plain;charset=UTF-8"); 
        PrintWriter out = res.getWriter();
        out.println("쿠키를 보냈음");
        
        
        
       
    }
}




