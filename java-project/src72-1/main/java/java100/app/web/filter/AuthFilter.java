package java100.app.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


// 요청 실행 전후에 공통으로 처리해야 할 작업을 수행하는 필터 
//@WebFilter("/app/*")
public class AuthFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(
            ServletRequest request, 
            ServletResponse response, 
            FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        
        String pathInfo = httpRequest.getPathInfo();
        
        if(!pathInfo.startsWith("/auth")) {
            
            HttpSession session = httpRequest.getSession();
            if (session.getAttribute("loginUser") == null) {
                httpResponse.sendRedirect(
                        request.getServletContext().getContextPath() + "/app/auth/login");
                return;
            }
        }
        
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        
    }

}
