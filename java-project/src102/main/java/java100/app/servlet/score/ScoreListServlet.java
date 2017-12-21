package java100.app.servlet.score;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.ScoreDao;
import java100.app.domain.Score;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/score/list")// 이클래스의 객체를 자동 생성해야함을 표시
public class ScoreListServlet extends HttpServlet {


    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException {
     
        ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(ScoreDao.class);
        List<Score> list = scoreDao.selectList();
        
        request.setAttribute("list", list);
        
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher rd = request.getRequestDispatcher("/score/list.jsp");
        rd.include(request, response);
        
    }
}









