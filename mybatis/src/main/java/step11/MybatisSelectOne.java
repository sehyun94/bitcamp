package step11;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisSelectOne {
    
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext iocContainer = 
                new ClassPathXmlApplicationContext(
                        "step11/application-context.xml");
        
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
        
        
         // selectOne(SQL문을 찾을 때 이름)
        Board board = boardDao.findByNo(24);
        
        // List에 저장된 객체의 타입은
        // => Sql Mapper에 설정된 reslutType이다.
        
            System.out.printf("번호: %d\n", board.getNo());
            System.out.printf("제목: %s\n", board.getTitle());
            System.out.printf("내용: %s\n", board.getContents());
            System.out.printf("날짜: %s\n", board.getCreatedDate());
            System.out.printf("조회수: %s\n", board.getViewCount());
            
            iocContainer.close();
        
    }
}
