package java100.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java100.app.domain.Score;
import java100.app.util.DataSource;

public class ScoreDao {
    
    // 주입 받은 DataSource 객체를 저장할 인스턴스 변수 준비
    DataSource ds;
    
    // 외부에서 DataSource 객체를 주입할 수 있도록 셋터 준비
    public void setDataSource(DataSource ds) {
        this.ds = ds;
    }
    
    public List<Score> selectList() {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        
        try {
            con = ds.getConnection();
            pstmt = con.prepareStatement(
                    "select no,name,kor,eng,math from ex_score");
            rs = pstmt.executeQuery();
                 
            // ScoreController에게 성적 데이터를 리턴하기 위한 List 객체 준비.
            ArrayList<Score> list = new ArrayList<>();
            
            while (rs.next()) {
                Score score = new Score(
                        rs.getInt("no"),
                        rs.getString("name"),
                        rs.getInt("kor"),
                        rs.getInt("eng"),
                        rs.getInt("math"));
                
                list.add(score);
            }
            
            return list;
            
        } catch (Exception e) {
            throw new DaoException(e);
            
        } finally {
            try {rs.close();} catch (Exception e) {}
            try {pstmt.close();} catch (Exception e) {}
            ds.returnConnection(con);
        }
    }
    
    public int insert(Score score) {
        Connection con = null;
        PreparedStatement pstmt = null;
        
        try {
            con = ds.getConnection();
            pstmt = con.prepareStatement(
                    "insert into ex_score(name,kor,eng,math) values(?,?,?,?)");
            
            pstmt.setString(1, score.getName());
            pstmt.setInt(2, score.getKor());
            pstmt.setInt(3, score.getEng());
            pstmt.setInt(4, score.getMath());
            
            return pstmt.executeUpdate();
            
        } catch (Exception e) {
            throw new DaoException(e);
        } finally {
            try {pstmt.close();} catch (Exception e) {}
            ds.returnConnection(con);
        }
    }
    
    public int update(Score score) {
        Connection con = null;
        PreparedStatement pstmt = null;
        
        try {
            con = ds.getConnection();
            pstmt = con.prepareStatement(
                    "update ex_score set name=?,kor=?,eng=?,math=? where no=?");
            pstmt.setString(1, score.getName());
            pstmt.setInt(2, score.getKor());
            pstmt.setInt(3, score.getEng());
            pstmt.setInt(4, score.getMath());
            pstmt.setInt(5, score.getNo());
            
            return pstmt.executeUpdate();
            
        } catch (Exception e) {
            throw new DaoException(e);
        } finally {
            try {pstmt.close();} catch (Exception e) {}
           ds.returnConnection(con);
        }
    }
    
    public int delete(int no) {
        Connection con = null;
        PreparedStatement pstmt = null;
        
        try {
            con = ds.getConnection();
            pstmt = con.prepareStatement(
                    "delete from ex_score where no=?");
            
            pstmt.setInt(1, no);
            
            return pstmt.executeUpdate();
            
        } catch (Exception e) {
            throw new DaoException(e);
        } finally {
            try {pstmt.close();} catch (Exception e) {}
            ds.returnConnection(con);
        }
    }
    
    public Score selectOne(int no) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            con = ds.getConnection();
            pstmt = con.prepareStatement(
                    "select no,name,kor,eng,math from ex_score where no=?");
            
            pstmt.setInt(1, no);
            
            rs = pstmt.executeQuery();
            
            Score score = null;
            
            if (rs.next()) {
                score = new Score();
                score.setNo(no);
                score.setName(rs.getString("name"));
                score.setKor(rs.getInt("kor"));
                score.setEng(rs.getInt("eng"));
                score.setMath(rs.getInt("math"));
            } 
            
            return score;
            
        } catch (Exception e) {
            throw new DaoException(e);
        } finally {
            try {rs.close();} catch (Exception e) {}
            try {pstmt.close();} catch (Exception e) {}
            ds.returnConnection(con);
        }
    }
}















