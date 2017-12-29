package step12;
// 세션 - 무효화 시키기 
import java.io.IOException;
import java.io.PrintWriter;

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
@WebServlet("/step12/Servlet06")
public class Servlet06 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        // 세션을무효화 시키는 방법
        // 1) 클라이언트쪽에서 모든 웹 브라우저를 닫기 
        //    - 모든 웹브라우저가 종료되면 메모리에 보관되어 있는
        //      쿠키 값들이 모두 제거된다.
        //    - 세션아이디는 사용기간이 지정되지 않았기 때문에
        //      메모리에 보관된다.
        //    - 따라서 모든 웹브라우저를 닫으면 세션아이디도 잃게 된다.
        //    - 그러면 다음에 웹브라우저가 서버에 요청할 때 
        //      세션아이디를 보낼 수 없기 때문에
        //      서버 입장에서는 새로 HttpSession을 만들 수 밖에 없다.
        //    - 결국 기존 세션 객체가 무효화 된 것이다.
        
        // 2) 세션의 타임 아웃 시간을 경과할 경우
        //    - 서버에 마지막으로 요청(request)한 시각에서 
        //      서버에 설정된 타임아웃 시간까지 요청이 없을 때 
        //      서버는 세션을 무효화 시킨다.
        //    - 타임아웃 시간은 서버 설정 파일에 지정한다.
        //    - 서버마다 설정하는 방법이 다르니 메뉴얼을 참고하라!
        
        // 3) 프로그램 코드로 명확하게 세션을 무효화 하기!
        //    -다음 코드를 보라
        
        HttpSession session = req.getSession();
        session.invalidate(); // 세션을 무효화 하라! 
        
        
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("세션을 무효화 했습니다.");
    }
}




