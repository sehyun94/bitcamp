package java100.app.service;

import java.util.List;
import java.util.Map;

import java100.app.domain.Book;

public interface BookService {
    int add(Book book);
    int update(Book book);
    int getTotalCount();
    List<Book> list(int pageNo, int pageSize, Map<String, Object> options);
    int delete(int no);
    Book get(int no);
}
