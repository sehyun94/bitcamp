// 역활: Queue 방식으로 데이터 관리
package bitcamp.java100.ch09.ex5;

public class Queue {
    private class Box {
        Object value;
        Box next;
        
        public Box() {}
        public Box(Object value) {
            this.value = value;
        }
    }
    

    // 시작 상자와 끝 상자의 주소
    Box head;
    Box tail;
    
    // 전체 상자 개수
    int len;

   
    public void add(Object value) {

        // 새 상자를 만들어 값을 보관한다.
        Box box = new Box(value);
   
        if (tail != null)
            tail.next = box;
        
        
        // 새 상자가 꼬리를 가리킨다.
        tail = box;
        
        // 상자 개수를 증가 시킨다.
        len++;
        
        if(head == null) // 처음 추가한 상자라면 head가 되게한다. 
            head = box;
    }
        
     
    
    public int size() {
        return len;
    }
    
    public Object poll() {
        if(len == 0)
            return null;
        
        // 리턴할 값을 담은 Box의 주소를 보관한다.
        Box box = head;
        
        // head를 다음 상자로 이동한다.
        head = head.next;

        // 상자의 개수를 줄인다
        len--;
        return box.value;
    }
}

      
        