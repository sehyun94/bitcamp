package java100.app.dao;

import java.util.List;
import java.util.Map;

import java100.app.domain.Book;

public interface BookDao {

    int insert(Book book);

    List<Book> findAll(Map<String, Object> params);

    int countAll();

    int delete(int no);

    Book findByNo(int no);

    int update(Book book);
   
    void deleteAllByBookNo(int no);
}
