package bitcamp.java100.ch20.ex5;

import java.beans.PropertyEditorSupport;
import java.sql.Date;

public class MyDateEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        //파라미터로 넘어오는 값이 xml 설정 파일에 입력한 값이다.
        // 이문자열 값을 java.sql.Date 객체로 만들면 된다.
        // 이렇게 만든 객체를 내부 메서드를 호출하여 저장한다.
        this.setValue(Date.valueOf(text));
    }

}
