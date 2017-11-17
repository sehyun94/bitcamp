package bitcamp.java100.ch16.ex1;

public class Test1 {

    public static void main(String[] args) {
        
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());
        
        ThreadGroup g1 = t1.getThreadGroup();
        System.out.println(g1.getName());
        
        ThreadGroup g2 = g1.getParent();
        System.out.println(g2.getName());
        
        ThreadGroup g3 = g2.getParent();
        System.out.println(g3);
        
        System.out.println("------------------------------------------");
        
        ThreadGroup[] groups = new ThreadGroup[10];
        int len = g2.enumerate(groups, false);
        for (int i = 0; i < len; i++) {
            System.out.println(groups[i].getName());
        }
        
        System.out.println("------------------------------------------");
        
        len = g1.enumerate(groups, false);
        for (int i = 0; i < len; i++) {
            System.out.println(groups[i].getName());
        }
        
        System.out.println("------------------------------------------");
        
        Thread[] threads = new Thread[10];
        len = g2.enumerate(threads, false);
        for (int i = 0; i < len; i++) {
            System.out.println(threads[i].getName()); // 이값의 결과는 자바 버전과 , 운영체제에 따라 다르다.
        } 
        
        System.out.println("------------------------------------------");
        
        len = g1.enumerate(threads, false);
        for (int i = 0; i < len; i++) {
            System.out.println(threads[i].getName()); // 이값의 결과는 자바 버전과 , 운영체제에 따라 다르다.
        } 
        
        // 최종 상황
        //"system" 스레드 그룹(g2)
        //  =>"main" 스레드 그룹(g1)
        //      => "main" 스레드 : 메인 메서드 
        //  => "Reference Handler" 스레드
        //  => "Finalizer" 스레드
        //  => "Signal Dispatcher" 스레드 : 외부 신호를 담당하는 스레드
        //  => "Attach Listener" 스레드
    }

}
 