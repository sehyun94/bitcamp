package java100.app.web.v01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HellonController {

        @RequestMapping("/hello")
        public String hello() {
            return "/hello.jsp";
        }
}
