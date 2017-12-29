package step9;

public class MybatisInsert {
    
    public static void main(String[] args) throws Exception{
        BoardDao boardDao = new BoardDao();
        boardDao.setSqlSessionFactory(SqlSessionFactoryBean.getObject());
         // insert 를 실행할 때 넘겨줄 값을 준비
        Board board = new Board();
         board.setTitle("오호라 ~ 제목이래요!");
         board.setContents("내용이드래요~~~~");
        
         
         // insert(SQL문을 찾을 때 이름, 데이터가 저장된 객체)
         int count = boardDao.insert(board);
         
         
         System.out.printf("%d 개가 입력 되었습니다.", count);
             
    }
}
