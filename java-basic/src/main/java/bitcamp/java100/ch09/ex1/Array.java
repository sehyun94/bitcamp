package bitcamp.java100.ch09.ex1;

public class Array {
    
    private Object[] arr = new Object[10000];
    private int cursor = 0;
    
    public void add(Object obj) {
        if (cursor == arr.length) 
            return;
        arr[cursor++] = obj;
    }
    
    public int size() {
        return cursor;
    }
    
    public Object get(int index) {
        if (index < 0 || index >= cursor) 
            return null;
        return arr[index];
    }
    
    public Object remove(int index) {
        if (index < 0 || index >= cursor) 
            return null;
        
        // 삭제할 값을 임시 변수에 저장
        Object removedValue = arr[index];
        
        // 앞의 값을 당겨서 현재 위치에 덮어쓴다.
        for (int i = index; i < cursor - 1; i++) {
            arr[i] = arr[i + 1];
        }
        // cursor의 위치를 한칸 당긴다
        cursor--;
        
        //삭제한 항목의 값은 리턴한다
        return removedValue;
    }
    
    public void insert(int index, Object value) {
        if (cursor == arr.length) 
            return;
        
        if (index < 0 || index >= cursor) 
            return;
        
        for (int i = cursor - 1; i >= index; i--) {
            // 현재 i 가 가리키는 방의 값을 앞쪽 방으로 옮긴다.
            arr[i + 1] = arr[i];
        }
        
        // 지정된 위치에 값을 넣는다.
        arr[index] = value;
        
        // cursor의 위치를 증가시킨다
        cursor++;
    }
    
    
    
}
