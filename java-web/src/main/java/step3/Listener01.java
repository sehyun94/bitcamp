package step3;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Listener01 implements ServletContextListener {
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Listener01.contextinitialzied() 호출");
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Listener01.contextDestroyed() 호출");
        
    }
    
    
}
