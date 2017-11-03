package bitcamp.java100.ch09.ex7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Test11 {
       
          static class Contact {
           String name;
           String email;
           String tel;
           
           public Contact ( String name, String email, String tel) {
               this.name = name;
               this.email = email;
               this.tel = tel;
        }

           
        @Override
        public String toString() {
            return "Contact [name=" + name + ", email=" + email + ", tel=" + tel + "]";
        }
           
    }
    public static void main(String[] args) {
        
        
        HashMap<String,Contact> map = new HashMap<>();
        
        map.put("c01", new Contact("홍길동1", "hong@test.com", "1111-1111"));
        map.put("c02", new Contact("홍길동1", "hong@test.com", "1111-1111"));
        map.put("c03", new Contact("홍길동1", "hong@test.com", "1111-1111"));
        map.put("c04", new Contact("홍길동1", "hong@test.com", "1111-1111"));
        map.put("c05", new Contact("홍길동1", "hong@test.com", "1111-1111"));

     // HashMap 에서 값만 꺼내고 싶을 때는 이방법을 이용한다. =>key 값은 알 수 없다
        Collection<Contact> values = map.values();
        for(Contact c : values) {
            System.out.println(c.toString());
        }
       }
}


