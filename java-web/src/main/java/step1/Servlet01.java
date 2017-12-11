package step1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/step1/servlet01")

public class Servlet01 implements javax.servlet.Servlet {
    
    ServletConfig config;
    
    public Servlet01() {
        System.out.println("step1.Servlet01.Servlet01();");
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("step1.Servlet01 init()호출됨!");
    }
    
    @Override
    public void destroy() {
        
        System.out.println("step1.Servlet01 destory()호출됨!");
    }
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("step1.Servlet01 service() 호출됨!");
    }
    
    @Override
    public ServletConfig getServletConfig() {
        System.out.println("step1.Servlet01 getservletconfig() 호출됨!");
        return this.config;
    }
    
    @Override
    public String getServletInfo() {
        System.out.println("step1.Servlet01 getservletinfo() 호출됨!");
        return "Servlet01 - 서블릿 인터페이스와 메서드들" ;
    }
}




