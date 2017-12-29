package step12;
// 세션 - 요청과 요청 사이에 데이터 공유하기
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//세션 (session)
// => 클라이언트가 요청한 작업을 수행한 후 그 결과를 서버에 보관하는 방법
// => 서블릿에서 getSession()  호출하면 HttpSession 객체가 생성된다.
//    서블릿 컨테이너는 이 세션 객체를 내부에서 임의로 생성한
//    문자열(세션ID 라 부른다) 를 사용하여 보관한다.
//    그리고 클라이언트에 응답할 때  이 세션아이디를 쿠키로 보낸다.
// => 클라이언트는 세션아이디가 쿠키이기 때문에 쿠키를 다루는 방식으로 저장하고 다룬다.

@SuppressWarnings("serial")
@WebServlet("/step12/Servlet03")
public class Servlet03 extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //세션 객체 준비 
        HttpSession session = req.getSession();
        // 클라이언트가 보낸 파라미터 값을 세션 보관소에 저장
        String name = req.getParameter("name");

        session.setAttribute("name", name);
        
        // 
        RequestDispatcher rd = req.getRequestDispatcher("/step12/form2.jsp");
        rd.forward(req, res);
    }
}




