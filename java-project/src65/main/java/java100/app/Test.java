package java100.app;

import org.springframework.context.annotation.Bean;

public class Test {

    @Bean
    static void sum(int...values) {
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        sum();
        sum(10);
        sum(10,20,30);
        sum(new int[] {10, 20, 30, 40, 50});
        

    }


}
