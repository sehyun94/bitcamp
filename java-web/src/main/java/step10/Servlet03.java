package step10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step10/Servlet03")
public class Servlet03 extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=UTF-8"); 
        PrintWriter out = res.getWriter();
        
        String name = req.getParameter("name");
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        
        if (name == null) {
            // Refresh 명령을 HTTP 응답 헤더가 아닌 다음과 같이
            // HTML meta 태그로 설정할 수 있다.
            out.println("<meta http-equiv='Refresh' content='3;url=ErrorServlet'>");
        }
        out.println("<meta charset='UTF-8'>");
        out.println("<title>redirect</title>");
        out.println("</head>");
        out.println("<body>");
        
        if (name == null) {
            out.println("실행 오류! (3초후에 페이지 이동)");
        } else {
            out.printf("<p>%s 님 환영합니다!</p>\n", name);
        }
        out.println("</body>");
        out.println("</html>");
    }
}




