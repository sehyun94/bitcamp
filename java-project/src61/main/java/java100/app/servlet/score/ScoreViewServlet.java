package java100.app.servlet.score;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.ScoreDao;
import java100.app.domain.Score;
import java100.app.listener.ContextLoaderListener;

@WebServlet("/score/view")
@SuppressWarnings("serial")
public class ScoreViewServlet extends HttpServlet {
    
    @Override
    protected void doGet(
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(
                ScoreDao.class);
        
        int no = Integer.parseInt(request.getParameter("no"));
        Score score = scoreDao.selectOne(no);
        
        // 작업한 결과를 JSP에게 넘겨주기 위해 ServletRequest 보관소에 저장한다.
        request.setAttribute("score", score);
        
        // 프론트 컨트롤러가 실행할 JSP URL을 등록한다.
        request.setAttribute("viewName", "/score/view.jsp");        
    }
}








