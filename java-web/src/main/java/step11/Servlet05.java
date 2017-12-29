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
@WebServlet("/step11/Servlet05")
public class Servlet05 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        // 기본경로 step11/* 서블릿만 name을 받을 수 있다. 
        res.addCookie(new Cookie("name", "hong"));
        // 모든 경로의 서블릿들이 쿠키를 받을 수 있도록 조정
        Cookie cookie = new Cookie("age", "20");
        cookie.setPath("/");
        res.addCookie(cookie);

        // 특정 경로의(/java-web/other/) 서블릿만이 쿠키를 받을 수 있도록 설정
        cookie = new Cookie("working", "true");
        cookie.setPath("/java-web/other/");
        res.addCookie(cookie);
        
        res.setContentType("text/plain;charset=UTF-8"); 
        PrintWriter out = res.getWriter();
        out.println("쿠키를 보냈음");
        
        
        
       
    }
}




