package step10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisInsert {
    
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext iocContainer = 
                new ClassPathXmlApplicationContext(
                        "step10/application-context.xml");
        
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
        Board board = new Board();
         board.setTitle("오호라 ~ 제목이래요!");
         board.setContents("내용이드래요~~~~");
        
         
         // insert(SQL문을 찾을 때 이름, 데이터가 저장된 객체)
         int count = boardDao.insert(board);
         
         
         System.out.printf("%d 개가 입력 되었습니다.", count);
         iocContainer.close();
             
    }
}
