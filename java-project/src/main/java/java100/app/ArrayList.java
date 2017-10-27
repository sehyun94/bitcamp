package java100.app;

// 여러개의 Score 인스턴
// 개별적으로 데이터를 관리하기 위해 인스턴스 메서드, 변수로 코드를 구성한다.

public class ArrayList {
    // 배열 레퍼런스의 타입을 최상위 루트 클래스로 전환한다
    Object[] list = new Object[10000];
    int cursor = 0 ;
    
    // 파리미터로 모든 타입의 객체 주소를 받을 수 있게 전환한다.
    void add (Object obj) {
        if(this.cursor == this.list.length) {
            System.err.println("최대 저장 개수 초과");
            return;
        }
        this.list[this.cursor++] = obj; 
    }
    
    int size() {
        return this.cursor;
    }
    
    Object get(int index) {
        if(index < 0 || index >= this.cursor) {
            return null;
        }
        return this.list[index];
    }
}

