package java100.app.servlet.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.BoardDao;
import java100.app.domain.Board;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet("/board/update")
public class BoardUpdateServlet extends HttpServlet {
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
        
        Board board = new Board();
        board.setNo(Integer.parseInt(request.getParameter("no")));
        board.setTitle(request.getParameter("title"));
        board.setContent(request.getParameter("content"));
        
        int count = boardDao.update(board);
        
        // 작업한 결과를 JSP에 넘겨주기 위해 ServletRequest 보관소에 저장한다,
        request.setAttribute("count", count);
        
        response.setContentType("text/html;charset=UTF-8");
        
        // 이 값을 출력할 JSP로 인클루딩 한다.
        RequestDispatcher rd = request.getRequestDispatcher("/board/update.jsp");
        rd.include(request, response);
        
    }
}