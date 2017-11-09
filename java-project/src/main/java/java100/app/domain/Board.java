package java100.app.domain;
import java.sql.Date;
import java.util.Scanner;

import java100.app.control.CSVFormatException;

// ## 캡슐화 적용
// - 모든 필드에 대해  외부 접근을 차단
// 단 자식 클래스에서는 직접 접근할 수 있게 허락한다

//: -init() 메서드 대신 생성자를 이용하여 인스턴스 초기화
// :- print() 메서드는 인스턴스 데이터를 다루기 때문에 스태틱 메서드 대신 
// : 인스턴스 메서드로 전환한다

public class Board {

    
    protected int no;
    protected String title;
    protected String content ;
    protected Date regDate;
    protected int viewCount;

    // : ### 생성자
    // 다른 패키지에서도 호출 할 수 있도록 public 으로 공개한다.
    public Board() {
        // : 생성자란 ? 그 인스턴스를 사용 가능하도록 유효한 상태로 만드는 것
        // : 그래서 이 기본 생성자에서 할 일은 국,영,수 점수를 넣을 수 있도록
        // : subjects에 배열을 만들어 저장하는 것이다.
    }
    
    
    
    
    public Board(String csv) throws CSVFormatException {
        String[] rec = csv.split(",");
        if (rec.length != 5) //데이터의 개수가 올바르지 않다면,
            throw new CSVFormatException(
                    "CSV 데이터 항목의 개수가 올바르지 않습니다.");
        this.no = Integer.parseInt(rec[0]);
        this.title = rec[1];
        this.content = rec[2];
        this.regDate = Date.valueOf(rec[3]); 
        this.viewCount = Integer.parseInt(rec[4]);
    }

    @Override
    public String toString() {
        return "Board [no=" + no + ", title=" + title + ", content=" + content + ", regDate=" + regDate + ", viewCount="
                + viewCount + "]";
    }
    
    public String toCSVStirng() {
        return String.format("%d,%s,%s,%s,%d", 
                this.getNo(),
                this.getTitle(),
                this.getContent(),
                this.getRegDate().toString(),
                this.getViewCount());
        }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
   
}
    
   
