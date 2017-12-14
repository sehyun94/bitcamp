package java100.app.servlet.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.MemberDao;
import java100.app.domain.Member;
import java100.app.listener.ContextLoaderListener;
@SuppressWarnings("serial")
@WebServlet(urlPatterns="/member/add") // 이클래스의 객체를 자동 생성해야함을 표시
public class MemberAddServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>회원관리</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>[회원 등록]</h1>");

        out.println("<form method='post'>");

        out.println("<div>");
        out.println("<label for='name'>이름</label>");
        out.println("<input id='name' type='text' name='name'>"); 
        out.println("</div>");

        out.println("<div>");
        out.println("<label for='email'>이메일</label>");
        out.println("<input id='email' type='text' name='email'>"); 
        out.println("</div>");
        
        out.println("<div>");
        out.println("<label for='password'>비밀번호</label>");
        out.println("<input id='password' type='password' name='password'>"); 
        out.println("</div>");


        out.println("<button>추가</button>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        

    }


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>회원관리</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>[회원 등록결과]</h1>");
        try {

            Member member = new Member();
            member.setName(request.getParameter("name"));
            member.setEmail(request.getParameter("email"));
            member.setPassword(request.getParameter("password"));

            memberDao.insert(member);

            out.println("<p>저장하였습니다.</p>");

        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
        
        out.println("<p><a href='list'>목록</a></p>");
        out.println("</body>");
        out.println("</html>");
    } 
}









