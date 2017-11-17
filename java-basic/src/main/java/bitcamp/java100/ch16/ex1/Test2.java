// 스레드 만들고 사용하기
package bitcamp.java100.ch16.ex1;

public class Test2 {

    // 스레드 만드는 방법
    // 1) Thread 를 상속받기
    static class MyThread extends Thread {
        // Thread를 상속 받은 후 run()을 오버라이딩 하여 
        // main() 스레드와 별개로 독립적으로 실행할 코드를 둬라.
        
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                System.out.println("MyThread =>" + i);
            }
        }
    }
    public static void main(String[] args) {
        
        MyThread t = new MyThread();
        
        t.start(); 
        
        
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }

}
