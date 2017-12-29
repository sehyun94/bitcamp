package step11;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 쿠키의 사용범위를 지정하기 
// 쿠키의 사용범위를 지정하지 않으면 기본으로 그 쿠키를 보낸 서플릿에 한정된다,
// 물론 그 하위 경로를 포함한다.

// =>  
@SuppressWarnings("serial")
@WebServlet("/step11/Servlet06")
public class Servlet06 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        //사용 기간을 지정하지 않을 경우,
        res.addCookie(new Cookie("name", "hong"));

        // 사용 기간을 30초로 지정할 경우,
        Cookie cookie = new Cookie("age", "20");
        cookie.setMaxAge(30);
        res.addCookie(cookie);

        // 사용 기간을 1분으로 지정할 경우,
        cookie = new Cookie("working", "true");
        cookie.setMaxAge(60);
        res.addCookie(cookie);
        
        res.setContentType("text/plain;charset=UTF-8"); 
        PrintWriter out = res.getWriter();
        out.println("쿠키를 보냈음");
        
        
        
       
    }
}




