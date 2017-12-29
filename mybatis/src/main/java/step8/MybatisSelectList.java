package step8;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisSelectList {
    
    public static void main(String[] args) throws Exception{
        InputStream inputStream = 
                Resources.getResourceAsStream("step8/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
 SqlSession sqlSession = sqlSessionFactory.openSession();
        
         // 정렬 정보를 맵 객체에 담아 selectList()에 넘긴다 
         Map<String, Object> data = new HashMap<>();
         // order by 를 위한 값
         data.put("orderCoulmn", "title");
         data.put("align", "asc");
         
         // where 절을 위한 값 
         List<String> words = new ArrayList<>();
         words.add("aa");
         words.add("1");
         words.add("5");
         
         data.put("words", words);
        List<Board> records = sqlSession.selectList("JdbcTestMapper.findAll", data);
        
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
