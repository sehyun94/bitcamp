package java100.app.control;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import java100.app.dao.MemberDao;
import java100.app.domain.Member;

public class MemberController implements Controller {

    MemberDao memberDao = new MemberDao();
    @Override
    public void destroy() {}

    @Override
    public void init() {}

    @Override    
    public void execute(Request request, Response response) {
        switch (request.getMenuPath()) {
        case "/member/list": this.doList(request, response); break;
        case "/member/add": this.doAdd(request, response); break;
        case "/member/view": this.doView(request, response); break;
        case "/member/update": this.doUpdate(request, response); break;
        case "/member/delete": this.doDelete(request, response); break;
        default: 
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }

    private void doList(Request request, Response response) {
        PrintWriter out = response.getWriter();

        out.println("[회원 목록]");

        try {
            List<Member> list = memberDao.selectList(); 

            for (Member member : list){
                out.printf("%d, %s, %s, %s\n",
                        member.getNo(),
                        member.getName(),
                        member.getEmail(),
                        member.getCreatedDate());
                
                   
            }
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }



    }

    private void doAdd(Request request, Response response) {
        PrintWriter out = response.getWriter();

        out.println("[회원등록]");

        try {
            Member member = new Member();
           
            member.setName(request.getParameter("name"));
            member.setEmail(request.getParameter("email"));
            member.setPassword(request.getParameter("password"));

            memberDao.insert(member);
            out.println("저장하였습니다");
            
        }catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }


    } 

    private void doView(Request request, Response response) {
        PrintWriter out = response.getWriter();

        out.println("[회원 상세 정보]");

        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb","study", "1111");

                PreparedStatement pstmt = con.prepareStatement(
                        "select no,name,email,regdt from ex_memb where no=?");
                ){

            pstmt.setInt(1, Integer.parseInt(request.getParameter("no")));

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                out.printf("번호 : %d\n", rs.getInt("no"));
                out.printf("이름 : %s\n", rs.getString("name"));
                out.printf("번호 : %s\n", rs.getString("email"));
                out.printf("등록일 : %s\n", rs.getString("regdt"));

            } else {
                out.printf("'%d'의 성적 정보가 없습니다.\n", 
                        request.getParameter("no"));

            }
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }

    }
    private void doUpdate(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[회원 변경]");

        try  {
            Member member = new Member();
            
            member.setName(request.getParameter("name"));
            member.setEmail(request.getParameter("email"));
            member.setPassword(request.getParameter("password"));
            
            if(memberDao.update(member) > 0) { 
                out.println("변경하였습니다!");
            } else {
                out.printf("'%s' 의 이메일 정보가 없습니다.\n", 
                        request.getParameter("no"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }

    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[회원 삭제]");

        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb","study", "1111");

                PreparedStatement pstmt = con.prepareStatement(
                        "delete from ex_memb where no=?");
                ){
            pstmt.setInt(1, Integer.parseInt(request.getParameter("no")));

            if (pstmt.executeUpdate() > 0) {
                out.println("삭제했습니다.");
            } else {
                out.printf("'%d'의 회원 정보가 없습니다.\n", 
                        request.getParameter("no"));
            }


        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }

    }
}










