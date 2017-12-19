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
        scoreDao.delete(no);
       
        request.setAttribute("viewName", "redirect:list.do");
        
       
    }
}
