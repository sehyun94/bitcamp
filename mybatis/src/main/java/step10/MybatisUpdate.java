package step10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisUpdate {
    
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext iocContainer = 
                new ClassPathXmlApplicationContext(
                        "step10/application-context.xml");
        
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
         Board board = new Board();
         
         // 값을 저장할 때 사용한 key는
         // SQL Mapper 파일에서 그 값을 꺼낼 때 사용할 것이다.
         board.setNo(31);
         board.setTitle("제목 변경!");
         board.setContents("내용 변경!");
        
         
         int count = boardDao.update(board);
         
         System.out.printf("%d개가  변경 되었습니다.", count);
         iocContainer.close();
    }
}
