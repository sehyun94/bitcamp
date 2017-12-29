// 요청 핸들러의 리턴 값 - View 
package java100.app.web.v03;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/v03/test03")
public class Test03 {

    //직접 HttpServletRequest 보관소에 저장하기
    @RequestMapping("/m1")
    public String m1(HttpServletRequest request) {
        
        // 보관소에 데이터 저장
        request.setAttribute("member", new Member("홍길동", 20, true));
        
        return "v03/test03";
    }
    
    // 간접적으로 HttpServletRequest 보관소에 저장하기
    @RequestMapping("/m2")
    public String m2(Map map) {
        
        // 프론트 컨트롤러에게 Map 객체를 달라고 요청하라!
        // 그리고 그 맵 객체에 값을 저장하면,
        // 프론트 컨트롤러가 그 맵에 저장된 값을 꺼내
        // 다시 ServletRequest에 저장할 것이다.
        map.put("member", new Member("홍길동", 20, true));
        
        return "v03/test03";
    }
    
 // 간접적으로 HttpServletRequest 보관소에 저장하기II
    @RequestMapping("/m3")
    public String m3(Model model) {
        // 프론트 컨트롤러에게 Model 객체를 달라고 요청하라!
        // 그리고 그 모델 객체에 값을 저장하면,
        // 프론트 컨트롤러가 그 모델 객체에 저장된 값을 꺼내
        // 다시 ServletRequest에 저장할 것이다.

        model.addAttribute("member", new Member("홍길동", 20, true));
        return "v03/test03";
    }
    
 // map 객체를 리턴하기 
    @RequestMapping("/m4")
    public Map m4() {
        
        // Map 객체 값을 담아 리턴하면, 프론트 컨트롤러는 맵에 저장되어 있는 객체를
        // ServletReuqest로 옮긴다.
        Map map = new HashMap();
        map.put("member", new Member("홍길동", 20, true));
        
        // view url을 리턴하지 못하기 때문에 프론트 컨트롤러는 현재 url 을 view url로 사용
        return map;
    }
    
    //model 객체를 리턴하기
    @RequestMapping("/m5")
    public Model m5() {
        
        Model model = new ConcurrentModel();
        // Model 객체 값을 담아 리턴하면, 프론트 컨트롤러는 model에 저장되어 있는 객체를
        // ServletReuqest로 옮긴다.
        model.addAttribute("member", new Member("홍길동", 20, true));
        
        // view url을 리턴하지 못하기 때문에 프론트 컨트롤러는 현재 url 을 view url로 사용
        return model;
    }
    
    @RequestMapping("/m6")
    public ModelAndView m6() {
        
        ModelAndView mv = new ModelAndView();
        // Model 객체 값을 담아 리턴하면, 프론트 컨트롤러는 model에 저장되어 있는 객체를
        // ServletReuqest로 옮긴다.
        mv.addObject("member", new Member("임꺽정", 30, false));
        mv.setViewName("v03/test03");
        
        return mv;
    }
}