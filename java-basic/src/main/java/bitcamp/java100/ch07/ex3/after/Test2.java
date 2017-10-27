package bitcamp.java100.ch07.ex3.after;

public class Test2 {

    public static void main(String[] args) {
        CalculatorB calc = new CalculatorB(1);

        calc.multipule(10);
        calc.multipule(17);
        calc.divide(3);
        calc.remainder(5);
        System.out.println(calc.result);
    }

}
