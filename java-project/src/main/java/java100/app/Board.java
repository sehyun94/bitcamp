package java100.app;
import java.sql.Date;
import java.util.Scanner;

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

    @Override
    public String toString() {
        return "Board [no=" + no + ", title=" + title + ", content=" + content + ", regDate=" + regDate + ", viewCount="
                + viewCount + "]";
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

    public void print() {
        System.out.printf("번호: %-4d 제목: %s  날짜: %s   조회수: %d\n", 
                this.no,
                this.title,
                this.regDate.toString(),
                this.viewCount);
    }
    public void printDetail() {
        System.out.printf("제목: %s\n내용:%s\n등록일: %s\n조회수: %d\n", 
                this.title,
                this.content,
                this.regDate.toString(),
                ++this.viewCount);
    }
    
    
    public void update() {
        Scanner keyScan = new Scanner(System.in);
       

        System.out.printf("제목? (%s)", this.title);
        String title = keyScan.nextLine();
        if (title.isEmpty()) {
            title = this.title; 
        }
        
        
        System.out.printf("내용? (%s)", this.content);
        String content = keyScan.nextLine();
        
        
        if (Prompts.confirm2("변경하시겠습니까?(y/N)")) {
            this.title = title;
            this.content = content;
            this.regDate = new Date(System.currentTimeMillis());
            System.out.println("변경하였습니다");
        } else  {
            System.out.println("변경을 취소하였습니다");
        }
    }

    
    
    
    public void input() {
        Scanner keyScan = new Scanner(System.in);
       
        System.out.print("번호? ");
        this.no = Integer.parseInt(keyScan.nextLine());

        System.out.print("제목? ");
        this.title = keyScan.nextLine();

        System.out.print("내용? ");
        this.content = keyScan.nextLine();
        
        this.regDate = new Date(System.currentTimeMillis());
        
    }
    
    
  
   
}
    
   
