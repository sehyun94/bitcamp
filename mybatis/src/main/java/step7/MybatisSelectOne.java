package step7;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisSelectOne {
    
    public static void main(String[] args) throws Exception{
        InputStream inputStream = 
                Resources.getResourceAsStream("step7/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
 SqlSession sqlSession = sqlSessionFactory.openSession();
        
         // selectOne(SQL문을 찾을 때 이름)
        Board board = sqlSession.selectOne("JdbcTestMapper.findByNo",24);
        
        // List에 저장된 객체의 타입은
        // => Sql Mapper에 설정된 reslutType이다.
        
            System.out.printf("번호: %d\n", board.getNo());
            System.out.printf("제목: %s\n", board.getTitle());
            System.out.printf("내용: %s\n", board.getContents());
            System.out.printf("날짜: %s\n", board.getCreatedDate());
            System.out.printf("조회수: %s\n", board.getViewCount());
            
        
        sqlSession.close();
    }
}
