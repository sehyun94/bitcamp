// 스레드 만들고 사용하기
package bitcamp.java100.ch16.ex1;

public class Test4 {

    static class MyThread extends Thread {
        
        public MyThread(String name) {
            super(name);
        }
        
        @Override
        public void run() {
            int count = 0;
            while (true) {
                System.out.printf("\n%s(%d)\n", this.getName(), ++count);
                
                
                if (count == 500) {
                    count = 0;
                    try {
                        Thread.sleep(5000); // 5초 동안 Not Runnable 상태가 됨.
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
       
        new MyThread("꽃님이").start();
        
        while (true) {
            System.out.println("...");
            
            double v1 = 3.141592;
            double v2 = 0.1234543;
            for (int i = 0; i < 10000000; i++) {
                v1 = Math.random() * v1;
                v2 = Math.random() / v2;
            }
        }
        
    
    }

}
