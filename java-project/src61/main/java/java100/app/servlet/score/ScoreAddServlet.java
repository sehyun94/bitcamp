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

@SuppressWarnings("serial")
@WebServlet("/score/add")
public class ScoreAddServlet extends HttpServlet {
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(
                ScoreDao.class);
        
        Score score = new Score();
        score.setName(request.getParameter("name"));
        score.setKor(Integer.parseInt(request.getParameter("kor")));
        score.setEng(Integer.parseInt(request.getParameter("eng")));
        score.setMath(Integer.parseInt(request.getParameter("math")));

        scoreDao.insert(score);
        
        request.setAttribute("viewName", "redirect:list.do");
        
        
    }
}
