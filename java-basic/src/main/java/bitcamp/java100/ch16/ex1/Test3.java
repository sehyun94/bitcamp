// 스레드 만들고 사용하기
package bitcamp.java100.ch16.ex1;

public class Test3 {

    // 스레드 만드는 방법
    // 1) Thread 를 상속받기
    static class MyRunnable implements Runnable {
        
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                System.out.println("MyThread =>" + i);
            }
        }
    }
    public static void main(String[] args) {
        
        Thread t = new Thread(new MyRunnable());
        
        t.start(); 
        
        
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }

}
