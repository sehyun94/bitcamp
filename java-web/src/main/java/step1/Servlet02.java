package step1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet({"/step1/servlet02/*","/servlet02","/ohora"})

public class Servlet02 implements javax.servlet.Servlet {
    
    ServletConfig config;
        
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }
    
    @Override
    public void destroy() {}
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("step1.Servlet02 service() 호출됨!");
    }
    
    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }
    
    @Override
    public String getServletInfo() {
        return "Servlet02 -  서블릿 배치 정보 등록" ;
    }
}