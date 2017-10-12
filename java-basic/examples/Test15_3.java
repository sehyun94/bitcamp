// ## 연산자 - 다른 타입의 변수와 연산하기

package bitcamp.java100;

public class Test15_3{

    public static void main(String[] args)  {

        byte b1 = 20, b2 =22;
        short s1 = 30, s2 = 33;
        int i1 = 40, i2= 44;
        long l1 = 50, l2 = 55;
        float f1 = 3.14f, f2 = 45.32f;
        double d1 = 4567.8988, d2 = 9876.5432;

// byte 와 short, int       
        int r1 = b1 + s1;
        r1 = b1 + i1;
        r1 = i1 + s1;

//byte, short, int 와 long 
        // r1 = i1 + l1; 계산 결과는 long 타입 이라 컴파일 오류
        //r1 = b1 + l1;
        //r1 = s1 + l1;
        long r2 = i1 + l1;
        r2 = b1 + l1;
        r2 = s2 + l1;

//byte, short, int, long vs float
//=> 정수타입과 부동소수점 타입의 계산은 정수타입이 부동소수점 임시 메모리에 저장된후에 계산을 수행한다.
        // long r3 = b1 + f1;   
        // r3 = s1 + f1;        
        // r3 = i1 + f1;

        float r4 = b1 + f1; 
        r4 = s1 + f1;
        r4 = i1 + f1;
        r4 = l1 + f1;
       //주의!
        // 계산을 수행하다보면 float의 크기를 넘어 갈 수 있다. 이경우 실행 오류가 발생하지 않고 값이 짤린다. 

// byte, short, int, long, float vs double
        //float r5 = f1 + d1;          
        double r6 = f1 + d1;
        r6 = b1 + d1;
        r6 = s1 + d1;
        r6 = i1 + d1;
        r6 = l1 + d1;
        
        
        

        



    }
}    

