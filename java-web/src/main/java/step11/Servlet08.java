package step11;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL 인코딩 된 쿠키 값 꺼내기 
@SuppressWarnings("serial")
@WebServlet("/step11/Servlet08")
public class Servlet08 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        //응답 헤더에 포함된 쿠키 꺼내기

        Cookie[] cookies = req.getCookies();

        res.setContentType("text/plain;charset=UTF-8"); 
        PrintWriter out = res.getWriter();
        out.println("클라이언트가 보낸 쿠키");

        if(cookies != null) {
            for (Cookie cookie : cookies) { 
                // URL 로 인코딩 되어 있는 값을 받았다면 ,
                // 사용하기 전에 URL 디코딩하여 원래의 값을 복원해야한다.
                out.printf("%s = %s\n", cookie.getName(), 
                        URLDecoder.decode(cookie.getValue(),"UTF-8"));
            }
        }

    }
}




