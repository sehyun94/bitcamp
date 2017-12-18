package java100.app.servlet.score;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.ScoreDao;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet("/score/delete")
public class ScoreDeleteServlet extends HttpServlet {
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(
                ScoreDao.class);
        
        int no = Integer.parseInt(request.getParameter("no"));
        int count = scoreDao.delete(no);
        // 작업한 결과를 JSP에 넘겨주기 위해 ServletRequest 보관소에 저장한다,
        request.setAttribute("count", count);
        
        response.setContentType("text/html;charset=UTF-8");
        
        // 이 값을 출력할 JSP로 인클루딩 한다.
        RequestDispatcher rd = request.getRequestDispatcher("/score/delete.jsp");
        rd.include(request, response);
        
    }
}
