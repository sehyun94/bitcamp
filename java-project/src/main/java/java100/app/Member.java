package java100.app;
import java.util.Scanner;

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

    
    @Override
    public String toString() {
        return "Member [name=" + name + ", email=" + email + ", pw=" + pw + "]";
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
    
    
    
    public void printDetail() {
        System.out.printf("이름 : %-4s\n메일 : %s\n암호 : %s\n",
                this.name, this.email, this.pw);
    }
    public void print() {
        System.out.printf("이름 : %-4s 이메일 : %s\n ", 
                this.name, this.email);
    }
    
    
    public void input() {
        Scanner keyScan = new Scanner(System.in);
       
        System.out.print("이름? ");
        this.name = keyScan.nextLine();

        System.out.print("이메일? ");
        this.email = keyScan.nextLine();

        System.out.print("암호? ");
        this.pw = keyScan.nextLine();
    }
    
   public void update() {
        Scanner keyScan = new Scanner(System.in);
       

        System.out.printf("이름? (%s)", this.name);
        String name = keyScan.nextLine();
        if (name.isEmpty()) {
            name = this.name; 
        }
        System.out.printf("암호? (%s)", this.pw);
        String pw = keyScan.nextLine();
        if (pw.isEmpty()) {
            pw = this.pw;
        }
        
        if (Prompts.confirm2("변경하시겠습니까?(y/N)")) {
            this.name = name;
            this.pw = pw;
            System.out.println("변경하였습니다");
        } else  {
            System.out.println("변경을 취소하였습니다");
        }
    }
  
}
    
   
