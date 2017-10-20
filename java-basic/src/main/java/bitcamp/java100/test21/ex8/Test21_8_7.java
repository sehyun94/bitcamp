// ##키보드로부터 입력받기  II
// - 다음과 같이 사용자로 구구단 번호를 입력 받아 출력하라!
// 실행 예)
// 구구단 ? 2
// 2 * 1 = 2
// .....
// 2 * 9 = 18
// -----------------------------------------
// 구구단 ? 10
// 2에서 9단까지만 가능합니다!
// 구구단 ? 0 <===== 0이하의 수를 입력하면 종료하라!
// 다음에 또 봐요!
// > 
package bitcamp.java100.test21.ex8;

//8단계 : 예외 처리 문법을 도입하여 add()와 get(), main()에 적용한다
//        배열의 크기를 벗어나거나 
import java.io.Console;
import java.util.ArrayList;


public class Test21_8_7 {
    
    //콘솔객체 준비
    static Console console ;
    //Contact 값을 저장할 레퍼런스 배열을 만든다.
    static Contact[] contacts = new Contact[100];
    // 값이 저장될 위치 (index)
    static int cursor = 0;
    
 

    static class Contact {
        String name;
        String email;
        String tel;
    }
    static void pirntContacts() {
        // 배열에 저장된 값 출력
        for(int i = 0; i < size(); i++) {
            Contact contact = get(i);
            System.out.printf("%s, %s, %s\n", 
                    contact.name, 
                    contact.email, 
                    contact.tel);
        }
    }
    
    static boolean confirm(String message) {
        String input = console.readLine(message + "(y/n)");
        if (input.toLowerCase().equals("y") 
            || input.toLowerCase().equals("yes")) // toLowercase() 입력값을 소문자로 변환후 확인 
                return true;
        return false;
    }
    
    static Contact inputContact() {
     // 사용자가 입력할 데이터를 저장할 메모리 준비
        Contact contact = new Contact();

        //사용자가 입력한 데이터를 Contact 인스턴스(객체)에 저장
        contact.name = console.readLine("이름? ");
        contact.email = console.readLine("이메일? ");
        contact.tel = console.readLine("전화? ");
        return contact;

    }
    static void add(Contact contact) {
        if (cursor >= contacts.length) 
            throw new RuntimeException("최대 저장 개수 초과");
        
        contacts[cursor] = contact;
        cursor++;
    }
    static Contact get(int index) {
        if (index < 0 || index >= cursor) 
            throw new RuntimeException("유효하지 않은 인덱스");
     return contacts[index];
    }
    
    static int size() {
        return cursor;
    }
    
    public static void main(String[] args) {
        
        console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }
        
        // 배열 개수 만큼 입력을 받는다
        while(true) {
        
            Contact contact = inputContact();
           
            if(confirm("저장하시겠습니까?")) {
                try {
                add(contact);
                } catch (RuntimeException e) {
                    System.err.println("최대 저장 개수를 초과하였습니다");
                    break;
                }
             }
            
                //이름, 이메일, 전화 데이터가 들어있는 인스턴스 주소를 배열에 저장.
            if(!confirm("계속 입력하시겠습니까?")) 
                break;
        }
            pirntContacts();
        
    }
}


