package java100.app.servlet.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.MemberDao;
import java100.app.domain.Member;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet("/member/add")
public class MemberAddServlet extends HttpServlet {
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
        
        Member member = new Member();
        member.setName(request.getParameter("name"));
        member.setEmail(request.getParameter("email"));
        member.setPassword(request.getParameter("password"));
        int count = memberDao.insert(member);
        
        request.setAttribute("count", count);
        
        response.setContentType("text/html;charset=UTF-8");
        
        // 이 값을 출력할 JSP로 인클루딩 한다.
        RequestDispatcher rd = request.getRequestDispatcher("/member/add.jsp");
        rd.include(request, response);
        
    }
}
