package bitcamp.java100.ch07.ex1;

public class Test4 {

    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        calc.result = 1;
        calc.multipule(5);
        
        calc.divide(0);
        
        calc.multipule(17);
        
        System.out.println(calc.result);
    }

}
