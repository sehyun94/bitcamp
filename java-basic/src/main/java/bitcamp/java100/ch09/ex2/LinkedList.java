package bitcamp.java100.ch09.ex2;



public class LinkedList {
    // 시작 상자와 끝 상자의 주소
    Box head;
    Box tail;
    
    // 전체 상자 개수
    int len;
    
    public void add(Object value) {
        // 값을 보관할 상자를 준비한다.
        Box box = new Box();
        
        // 상자에 값을 담는다.
        box.value = value;
        
        // 목록의 끝에 상자를 연결한다.
        if (tail == null) {
            head = box;
            tail = box;
            
        } else {
            tail.next = box;
            tail = box;
        }
        
        len++;
    }
    
    public int size() {
        return len;
    }
    
    public Object get(int index) {
        if(index < 0 || index >= len)
            return null;
        
        Box box = head;
        for (int count = 1; count <= index; count++) {
            box = box.next;
            
        }
        return box.value;
    }
      
        public void insert(int index, Object value) {
            if(index < 0 || index >= len)
                return;                
            
            Box box = new Box();
            box.value = value;
            
            if (index == 0) {
                box.next = head;
                head = box;
                len++;
                return;
            }
        
            Box pre = head;
            
            for(int count = 1; count < index; count++) {
                pre = pre.next;
            }
            box.next = pre.next;
            pre.next = box;
            len++;
            
        }
       
        public Object remove(int index) {
            if(index < 0 || index >= len)
                return null;
           
            Box removedBox;
            
            if (index == 0) {
                removedBox = head;
                head = head.next;
                len--;
                return removedBox.value;
            }
            
            Box pre = head;
            
            for(int count = 1; count < index; count++) {
                pre = pre.next;
            }
            
            removedBox = pre.next; 
            pre.next = pre.next.next;
            len--;
            
            if (index == len -1) {
                tail = pre;
            }
            
            return removedBox.value;
        }
    }
