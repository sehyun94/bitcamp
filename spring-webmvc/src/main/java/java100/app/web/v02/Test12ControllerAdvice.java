// 클라이언트가 보낸 문자열 데이터를 다른 타입으로 변환하기
package java100.app.web.v02;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

// 방법2: @ControllerAdvice 클래스에 둔다.
// @ControllerAdvice ?
// 
//@ControllerAdvice(assignableTypes= {Test12.class,Test11.class})
public class Test12ControllerAdvice {
    
    public  Test12ControllerAdvice() {
        System.out.println("");
    }
    
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        System.out.println("Test12ControllerAdvice initBinder() 호출");

        // 문자열을 날짜 객체로 만들어줄 도구를 준비
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        dateFormat.setLenient(false); // 날짜 형식을 엄격하게 검사하라
        //스프링에서 제공하는 문자열을 날짜 객체로 변환시켜주는 
        // 커스텀 에디터를 준비하여 WebDataBinder에 등록한다.
        binder.registerCustomEditor(Date.class, // 문자열을 어떤 타입으로 바꿀지 설정한다. 
                new CustomDateEditor( // 문자열을 java.util.Date 객체로 만들어준다.
                        dateFormat, // 실제로는 그 작업을 SimpleDateFormat이 한다. 
                        false)); // 문자열 값이 비어 있는 것을 허락할 것인지 여부!
    }
}
