package java100.app.control;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import java100.app.domain.Member;
import java100.app.util.Prompts;

public class MemberController extends GenericController<Member> {
    
    private String dataFilePath;
    public MemberController(String dataFilePath) {
        this.dataFilePath = dataFilePath;
        this.init();
    }
    
    @Override
    public void destory() {
        try (FileWriter out = new FileWriter(dataFilePath);) {
            for (Member member : this.list) {
                out.write(member.toCSVStirng() + "\n");
             }
             } catch (IOException e) {
        e.printStackTrace();
        } 
}

// CSV형식으로 저장된 파일에서 성적 데이터를 읽어
// ArrayList에 보관한다.
    
    @Override
    public void init() {
        try (
                FileReader in = new FileReader(dataFilePath);
                Scanner lineScan = new Scanner(in);){
            String csv = null;
            while (lineScan.hasNextLine()) {
                csv = lineScan.nextLine();
                try {
                    list.add(new Member(csv));
            } catch(CSVFormatException e) {
                System.err.println("CSV 데이터 형식오류!");
                e.printStackTrace();
            }
        }
            } catch(IOException e) {
                e.printStackTrace();
    }
}
    
    
    @Override
    public void execute() {
        loop: while (true) {
            System.out.print("회원관리> ");
            String input = keyScan.nextLine();
            // 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
            switch (input) {
            case "add": this.doAdd(); break;
            case "list": this.doList(); break;
            case "view": this.doView(); break;
             case "update": this.doUpdate(); break;
            case "delete": this.doDelete(); break;
            case "main": 
                break loop;
            default:
                System.out.println("해당 명령이 없습니다.");
            }
        }
    }

    // 대신 목록 객체에 값을 저장하고 꺼낸는 객체는 완전 공개
    private void doDelete() {
        System.out.println("[회원 삭제]");
        String email = Prompts.inputString("이메일? ");

        Member member = findByEmail(email);

        if (member == null) {
            System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
            return;
        } 
        
            if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
                list.remove(member);
                System.out.println("삭제하였습니다.");
            } else {
                System.out.println("삭제를 취소하였습니다.");
            }
    }

     private void doUpdate() {
     System.out.println("[회원 정보 변경]");
     String email = Prompts.inputString("이메일? ");
    
     Member member = findByEmail(email);
    
         if (member == null) {
             System.out.printf("'%s'의 성적 정보가 없습니다.\n", email);
          return;
         }
           
             String name = Prompts.inputString("이름? (%s)", member.getName());
             if(name.isEmpty()) {
                 name = member.getName();
             }
             
             String pw = Prompts.inputString("암호? (%s)",member.getPw());
             if (pw.isEmpty()) {
                 pw = member.getPw();
             }
             
             if (Prompts.confirm2("변경하시겠습니까?(y/N)")) {
                 member.setName(name);
                 member.setPw(pw);
                 System.out.println("변경하였습니다");
             } else  {
                 System.out.println("변경을 취소하였습니다");
             }
     }
    
    private void doView() {
        System.out.println("[회원 상세 정보]");
        String email = Prompts.inputString("이메일? ");

        Member member = findByEmail(email);

        if (member == null) {
            System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
            return;
        }
        System.out.printf("이름 : %-4s\n메일 : %s\n암호 : %s\n",
                   member.getName(), member.getEmail(), member.getPw());
    }

    private void doList() {
        System.out.println("[회원 목록]");

        Iterator<Member> iterator = list.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            System.out.printf("이름 : %-4s이메일 : %s\n", 
                    member.getName(), member.getEmail());
        }
        
    }

    private void doAdd() {
        System.out.println("[회원 등록]");

        Member member = new Member();
        
        member.setEmail(Prompts.inputString("이메일?"));
   
        if(findByEmail(member.getEmail()) != null) { 
            System.out.println("이미 등록된 메일입니다.");
            return;
    }
        
        member.setName(Prompts.inputString("이름?")); 
        member.setPw(Prompts.inputString("암호?"));
        
   
    list.add(member);
}

    private Member findByEmail(String email) {
        Iterator<Member> iterator = list.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getEmail().equals(email)) {
                return member;
            }
        }
        return null;
    }
}

