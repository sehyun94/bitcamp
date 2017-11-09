package java100.app.domain;
import java.util.Scanner;

import java100.app.control.CSVFormatException;

// ## 캡슐화 적용
// - 모든 필드에 대해  외부 접근을 차단
// 단 자식 클래스에서는 직접 접근할 수 있게 허락한다

//: -init() 메서드 대신 생성자를 이용하여 인스턴스 초기화
// :- print() 메서드는 인스턴스 데이터를 다루기 때문에 스태틱 메서드 대신 
// : 인스턴스 메서드로 전환한다

public class Member {

    protected String name;
    protected String email;
    protected String pw;
    

    // : ### 생성자
    // 다른 패키지에서도 호출 할 수 있도록 public 으로 공개한다.
    public Member() {
        // : 생성자란 ? 그 인스턴스를 사용 가능하도록 유효한 상태로 만드는 것
        // : 그래서 이 기본 생성자에서 할 일은 국,영,수 점수를 넣을 수 있도록
        // : subjects에 배열을 만들어 저장하는 것이다.
    }

    public Member(String name, String email, String pw) {
        this.name = name;
        this.email = email;
        this.pw = pw;
    }
    
    public Member(String csv) throws CSVFormatException {
        String[] rec = csv.split(",");
        if (rec.length != 3) //데이터의 개수가 올바르지 않다면,
            throw new CSVFormatException(
                    "CSV 데이터 항목의 개수가 올바르지 않습니다.");
        this.name = rec[0];
        this.email = rec[1];
        this.pw = rec[2];
    }

    
    @Override
    public String toString() {
        return "Member [name=" + name + ", email=" + email + ", pw=" + pw + "]";
    }
    
    public String toCSVStirng() {
        return String.format("%s,%s,%s", 
                this.getName(),
                this.getEmail(),
                this.getPw());
        }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    
}
    
   
