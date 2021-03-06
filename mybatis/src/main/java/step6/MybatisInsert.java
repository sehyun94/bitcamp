package step6;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisInsert {
    
    public static void main(String[] args) throws Exception{
        InputStream inputStream = 
                Resources.getResourceAsStream("step6/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
 SqlSession sqlSession = sqlSessionFactory.openSession();

         // insert 를 실행할 때 넘겨줄 값을 준비
        Board board = new Board();
        
         
         // 값을 저장할 때 사용한 key는
         // SQL Mapper 파일에서 그 값을 꺼낼 때 사용할 것이다.
         board.setTitle("오호라 ~ 제목이래요!");
         board.setContents("내용이드래요~~~~");
        
         
         // insert(SQL문을 찾을 때 이름, 데이터가 저장된 객체)
         int count = sqlSession.insert("JdbcTestMapper.insert", board);
         
         sqlSession.commit();
         System.out.printf("%d 개가 입력 되었습니다.", count);

             
        sqlSession.close();
        System.out.println("종료!");
    }
}
