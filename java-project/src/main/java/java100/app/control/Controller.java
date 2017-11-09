package java100.app.control;

public interface Controller {
    
    void execute();

    // 새 규칙 추가.
    // 새규칙을 추가하면 
    // 기존에 작성된 클래스들은 오류가 바랭할 것이다.
    // 그런경우를 고려항 새로 추가한 규치에 대해 기본으로 메서드를 구현 상태로 만든다.
    // 그것이 "default" 문법이다 (Java 8이상)
    // 객체를 사용하기 전에 준비시키는 메서드
    default void init() {
        // 이 메서드를 구현하지 않는 클래스를 위해
        // 기본으로 수행할 코드를 넣으면된다.
        // 물론 기본으로 수행할 일이 없다면 안 넣으면 된다.
    };
    
    // 프로그램을 종료하기 전에 객체에게 마무리 작업을 시키는 메서드
    default void destory() {
        
    };
}
