package step12;

import java.io.IOException;
import java.io.PrintWriter;

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
@WebServlet("/step12/Servlet01")
public class Servlet01 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

      
        // 세션 생성
        // 시나리오 1: 요청헤더의 쿠키 값으로 세션 아이디가 넘어 오지 않앗다.
        //  => 새로 세션을 만들어서 리턴한다.
        //  => 물론 응답할 때 새로 만든 세션의 세션아이디를 보낸다 . 
        // 시나리오 2: 요청 헤더의 쿠키 값으로 세션 아이디가 넘어 왔다.
        //          => 그 세션아이디로 기존에 생성했던 세션 객체를 찾아 리턴한다.
        //          => 이때는 응답할 때 세션아이디를 다시 보내지 안흔ㄴ다.
        //          => 왜? 이미 클라이언트가 알고 있지 않으가!
        // 시나리오 3: 요청헤더의 쿠키 값으로 세션아이디가 넘어 왔는데,
        //              세션의 유효기간(보통 5분 or 30분) 이 지났다.
        //          => 새로 세션을 만들어서 리턴.
        //          => 물론 기존의 세션 객체를 제거한다.
        //              따라서 기존 세션 객체에 보관된 모든 데이터도 날아간다.
        //          => 새로 세션객체를 만들었기 때문에 응답할 때,
        //             세션아이디를 보내야한다.
        // 참고!
        //         => JSP 페이지로 생성한 서블릿 클래스는 내부적으로
        //            HttpSession 객체를 준비하기 때문에
        //            JSP 페이지를 요청하면 무조건 세션 객체가 생성ㄴ된다.
        HttpSession session = req.getSession();
        
        //HttpSession 보관소에 값을 저장
        session.setAttribute("name", "홍길동");
        
        res.setContentType("text/plain;charset=UTF-8"); 
        PrintWriter out = res.getWriter();
        out.println("세션을 생성하였고 그 세션아이디 값을 쿠키로 보냈음!");
        
    }
}




