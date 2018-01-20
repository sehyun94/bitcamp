package java100.app.web.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class AuthInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object handler)
                    throws Exception {

        // 세션 보관소에 "loginUser"가 저장되었는지 검사한다.
        HttpSession session = request.getSession();

        //로그인 정보가 없으면 로그인 폼으로 보낸다
        if (session.getAttribute("loginUser") == null) {
            response.sendRedirect(
                    request.getServletContext().getContextPath() + "/app/auth/login");
            return false;
        }
        return true;
    }
}

