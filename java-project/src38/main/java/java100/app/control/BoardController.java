package java100.app.control;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;

import org.gjt.mm.mysql.Driver;

import java100.app.domain.Board;

public class BoardController extends GenericController<Board> {


    @Override
    public void destroy() {}


    @Override
    public void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("JDBC 드라이버 클래스를 찾을수 없습니다");
        }
    }

    @Override
    public void execute(Request request, Response response) {
        switch (request.getMenuPath()) {
        case "/board/list": this.doList(request, response); break;
        case "/board/add": this.doAdd(request, response); break;
        case "/board/view": this.doView(request, response); break;
        case "/board/update": this.doUpdate(request, response); break;
        case "/board/delete": this.doDelete(request, response); break;
        default: 
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }

    private void doList(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[게시물 목록]");

        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb","study","1111");

                PreparedStatement pstmt = con.prepareStatement(
                        "select no,title,regdt,vwcnt from ex_board");

                ResultSet rs =pstmt.executeQuery();) {
            while(rs.next()) {
                out.printf("%d, %s, %s, %d\n",  
                        rs.getInt("no"), 
                        rs.getString("title"),
                        rs.getDate("regdt"),
                        rs.getInt("vwcnt"));    

            }


        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());

        }
    }

    private void doAdd(Request request, Response response) {
        PrintWriter out = response.getWriter();

        out.println("[게시물 등록]");

        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb","study","1111");

                PreparedStatement pstmt =con.prepareStatement(
                        "insert into ex_board(title,conts,regdt)"
                                + " values(?,?,now())");
                ) {

            pstmt.setString(1, request.getParameter("title"));
            pstmt.setString(2, request.getParameter("content"));

            pstmt.executeUpdate();
            out.println("등록하였습니다.");

        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    } 

    private void doView(Request request, Response response) {

        PrintWriter out = response.getWriter();
        out.println("[게시물 상세 정보]");


        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb", "study","1111");
                ) {

            int no = Integer.parseInt(request.getParameter("no"));

            try (
                    PreparedStatement pstmt = con.prepareStatement(
                            "update ex_board set vwcnt = vwcnt + 1 where no=?")) {
                pstmt.setInt(1, no);
                pstmt.executeUpdate();
            } catch (Exception e) {}

            try (PreparedStatement pstmt = con.prepareStatement(
                    "select no,title,conts,regdt,vwcnt from ex_board where no=?")) {
                pstmt.setInt(1, no);


                ResultSet rs = pstmt.executeQuery();

                if(rs.next()) {
                    out.printf("번호: %d\n" , rs.getInt("no"));
                    out.printf("제목: %s\n", rs.getString("title"));
                    out.printf("내용: %s\n", rs.getString("conts"));
                    out.printf("등록일: %s\n", rs.getDate("regdt"));
                    out.printf("조회수: %d\n", rs.getInt("vwcnt"));
                } else {
                    out.printf("'%s'번의 게시물 정보가 없습니다.\n ",
                            request.getParameter("no"));
                }
                rs.close();
            } catch (Exception e) {}


        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    } 

    private void doUpdate(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[게시물 변경]");
        

        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb", "study","1111");
        
        PreparedStatement pstmt = con.prepareStatement(
                "update ex_board set title=?, conts=? where no=?");
        ) { 
            
            
            pstmt.setString(1, request.getParameter("title"));
            pstmt.setString(2, request.getParameter("content"));
            pstmt.setInt(3, Integer.parseInt(request.getParameter("no")));

            if (pstmt.executeUpdate() > 0) {
                out.println("변경하였습니다.");
            } else {
                out.printf("%d번 게시물이 없습니다.\n", 
                        request.getParameter("no"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }

    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[게시물 삭제]");

        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb", "study", "1111");

                PreparedStatement pstmt = con.prepareStatement(
                        "delete from ex_board where no=?");
                ){

            pstmt.setInt(1, Integer.parseInt(request.getParameter("no")));

            if(pstmt.executeUpdate() > 0) {
                out.println("삭제하였습니다");
            } else {
                out.printf("%d번 게시물이 없습니다.\n", 
                        request.getParameter("no"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }



    private Board findByNo(int no) {
        Iterator<Board> iterator = list.iterator();
        while (iterator.hasNext()) {
            Board board = iterator.next();
            if (board.getNo() == no) {
                return board;
            }
        }
        return null;
    }
}








