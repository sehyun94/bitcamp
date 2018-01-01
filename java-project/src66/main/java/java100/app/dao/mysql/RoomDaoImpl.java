package java100.app.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.dao.DaoException;
import java100.app.dao.RoomDao;
import java100.app.domain.Room;
import java100.app.util.DataSource;

//기존에 있던 RoomDao 클래스에서 컨트롤러가 호출하는 기본 메서드 
//호출 규칙을 별도의 인터페이스로 분리하고,
//이 클래스는 그 인터페이스를 구현한 클래스로 전환한다.
//
@Component // 이클래스의 객체를 자동 생성해야함을 표시
public class RoomDaoImpl implements RoomDao {
    
    // 주입 받은 DataSource 객체를 저장할 인스턴스 변수를 준비한다.
    @Autowired
    DataSource ds;
    
    
    // DataSource를 주입 받았다 가정하고 다음 아래의 메서드들을 변경한다.
    // => 이렇게하면 DataSource를 얻기 위해 ApplicationContext를 사용한
    //    코드를 제거해도 된다. 
    // => 즉 더이상 ApplicationContext에 종속되지 않는다.
    //
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
            pstmt.setInt(3, room.getCapacity());
            
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














