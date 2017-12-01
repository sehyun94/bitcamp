package java100.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java100.app.beans.ApplicationContext;
import java100.app.domain.Board;
import java100.app.util.DataSource;

public interface BoardDao {


    List<Board> selectList(); 
    int insert(Board board); 
    int update(Board board); 
    int delete(int no); 
    Board selectOne(int no); 

}















