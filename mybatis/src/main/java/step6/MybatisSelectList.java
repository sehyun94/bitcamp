package step6;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisSelectList {
    
    public static void main(String[] args) throws Exception{
        InputStream inputStream = 
                Resources.getResourceAsStream("step6/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
 SqlSession sqlSession = sqlSessionFactory.openSession();
        
         // selectList(SQL문을 찾을 때 이름)
         // => SQL 문을 찾을 떄 이름 = 네임스페이스명.SQL아이디
         // <mapper namespace = "네임스페이스명">
         // <select id="SQL 아이디">
        List<Board> records = sqlSession.selectList("JdbcTestMapper.findAll");
        
        // List에 저장된 객체의 타입은
        // => Sql Mapper에 설정된 reslutType이다.
        
        for (Board board : records) {
            System.out.printf("%d, %s, %s, %s\n",
                    board.getNo(),
                    board.getTitle(),
                    board.getCreatedDate(),
                    board.getViewCount());
                
            
        }
        
        sqlSession.close();
        System.out.println("종료!");
    }
}
