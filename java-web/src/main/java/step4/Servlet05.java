package step4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step4/Servlet05")
public class Servlet05 extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
     
        BufferedOutputStream out = new BufferedOutputStream(res.getOutputStream());
        
        ServletContext webAppInfo = req.getServletContext();
        String filePath = webAppInfo.getRealPath("/1.jpg"); // 현재 어플리케이션 위치에 1.jpg의 위치
        System.out.println(filePath);
        
        BufferedInputStream in = new BufferedInputStream(
                                    new FileInputStream(filePath));
        
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }
        in.close();
        out.flush();
    }
}




