// 스레드 만들고 사용하기
package bitcamp.java100.ch16.ex1;

public class Test5 {

    static class Result {
        int sum;
    }

    static Result result = new Result();

    static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            synchronized (result) {
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%s(%d)\n", this.getName(), i);
                    result.sum += i;
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {};
                }

                result.notify();
            }

        }

        public static void main(String[] args) throws Exception {

            MyThread t = new MyThread("꽃님이");
            t.start();

            synchronized (result) {
                result.wait();
                System.out.println("합계=" + result.sum);
            }
        }
    }
}