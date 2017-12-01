package java100.app.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java100.app.dao.DaoException;
import java100.app.dao.RoomDao;
import java100.app.domain.Room;
import java100.app.util.DataSource;

public class RoomDaoImpl implements RoomDao {
    
    // 주입 받은 DataSource 객체를 저장할 인스턴스 변수 준비
    DataSource ds;
    
    // 외부에서 DataSource 객체를 주입할 수 있도록 셋터 준비
    public void setDataSource(DataSource ds) {
        this.ds = ds;
    }
    
    public List<Room> selectList() {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            con = ds.getConnection();
            pstmt = con.prepareStatement(
                    "select no,loc,name,capacity from ex_room");
            rs = pstmt.executeQuery();
            
            ArrayList<Room> list = new ArrayList<>();
            
            while (rs.next()) {
                Room room = new Room();
                room.setNo(rs.getInt("no"));
                room.setLocation(rs.getString("loc"));
                room.setName(rs.getString("name"));
                room.setCapacity(rs.getInt("capacity"));
                
                list.add(room);
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
    
    public int insert(Room room) {
        Connection con = null;
        PreparedStatement pstmt = null;
        
        try {
            con = ds.getConnection();
            pstmt = con.prepareStatement(
                    "insert into ex_room(loc,name,capacity) values(?,?,?)");
            
            pstmt.setString(1, room.getLocation());
            pstmt.setString(2, room.getName());
            pstmt.setInt(3, room.getNo());
            
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
                    "delete from ex_room where no=?");
            pstmt.setInt(1, no);
            
            return pstmt.executeUpdate();
            
        } catch (Exception e) {
            throw new DaoException(e);
        } finally {
            try {pstmt.close();} catch (Exception e) {}
            ds.returnConnection(con);
        }
    }
    
}















