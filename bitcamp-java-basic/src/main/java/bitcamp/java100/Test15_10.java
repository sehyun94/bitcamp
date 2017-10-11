package bitcamp.java100;

public class Test15_10{
    public static void main(String[] args)  {
        int v1 = 0b0101_1100;
        int v2 = 0b0110_0110;
//        &논리곱 AND 
        
        int result = v1 & v2;
        System.out.println(java.lang.Integer.toBinaryString(result));
        
//        | 논리합 or
        result = v1 | v2;
        System.out.println(java.lang.Integer.toBinaryString(result));
        
//       ^배타적 논리곱
        result = v1 ^ v2;
         System.out.println(java.lang.Integer.toBinaryString(result));
        
    }
}   




