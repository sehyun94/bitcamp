package java100.app.dao;

import java.util.List;

import java100.app.domain.UploadFile;

public interface FileDao {

    List<UploadFile> findByBoardNo(int no);
    // insert/ update/delte 개수를 리턴하고 싶다면 리턴타입
    void insert(UploadFile file);
    
    // 게시물 첨부파일를 지운다
    void deleteAllByBoardNo(int no);


    // insert 개수를 리턴하고 싶다면 리턴 타입을 int 로 선언한다.
    // 굳이 리턴할 이유가없다면 void로 선언해야 한다.
}
