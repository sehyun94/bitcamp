package java100.app.servlet.member;

import java.io.IOException;
import java.io.PrintWriter;

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
@WebServlet(urlPatterns="/member/view") // 이클래스의 객체를 자동 생성해야함을 표시
public class MemberViewServlet extends HttpServlet {
    
 
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
        
        MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
        response.setContentType("text/html;charset=UTF-8");
    
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>회원관리</title>");
        
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
        out.println("<link rel='stylesheet' href='../css/common.css'>");

        
        out.println("<body>");
        out.println("<div class='container'>");

        RequestDispatcher rd = request.getRequestDispatcher("/header");
        rd.include(request, response);
        out.println("<h1>[회원 상세정보]</h1>");
        
        
        try {
            
            int no = Integer.parseInt(request.getParameter("no"));
            Member member = memberDao.selectOne(no);
            
            if (member != null) {
                out.println("<form action='update' method='post'>");
                out.println("<div class='form-group row'>");
                out.println("<label class='col-sm-2 col-form-label' for='no'>번호</label>");
                out.println("<div class='col-sm-10'>");
                out.printf("<input class='form-control' readonly id='no' type='number' name='no' value='%d'>\n", 
                            member.getNo());
                out.println("</div>");
                out.println("</div>");
                
                out.println("<div class='form-group row'>");
                out.println("<label class='col-sm-2 col-form-label' for='name'>이름</label>");
                out.println("<div class='col-sm-10'>");
                out.printf("<input class='form-control' id='name' type='text' name='name' value='%s'>\n", 
                            member.getName());
                out.println("</div>");
                out.println("</div>");
                
                out.println("<div class='form-group row'>");
                out.println("<label class='col-sm-2 col-form-label' for='email'>이메일</label>");
                out.println("<div class='col-sm-10'>");
                out.printf("<input id='email' type='text' name='email' value='%s'>\n", 
                            member.getEmail());
                out.println("</div>");
                out.println("</div>");
                
                out.println("<div class='form-group row'>");
                out.println("<label for='date'  class='col-sm-2 col-form-label'>등록일</label>");
                out.println("<div class='col-sm-10'>");
                out.printf("<input class='form-control'  readonly id='date' type='text' name='date' value='%s'>\n", 
                            member.getCreatedDate());
                out.println("</div>");
                out.println("</div>");
                
                out.println("<div class='form-group row'>");
                out.println("<label for='password' class='col-sm-2 col-form-label'>비밀번호</label>");
                out.println("<div class='col-sm-10'>");
                out.printf("<input class='form-control' id='password' type='password' name='password' >\n", 
                            member.getPassword());
                out.println("</div>");
                out.println("</div>");
                
                out.println("<div class='form-group row'>");
                out.println("<div class='col-sm-10'>");
                out.println("<button class='btn btn-primary btn-sm'>변경</button>");
                out.printf("<a href='delete?no=%d' class='btn btn-primary btn-sm'>삭제</a>\n",member.getNo());
                out.println("</div>");
                out.println("</div>");
                out.println("</form>");
                
               
            } else {
                out.printf("<p>'%s'번의 회원 정보가 없습니다.</p>\n", no); 
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
        
        rd = request.getRequestDispatcher("/footer");
        rd.include(request, response);
        
        out.println("</div>");
        out.println("<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>");
        out.println("<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>");
        out.println("<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>");     
        out.println("</body>");
        out.println("</html>");
    } 
   
}









