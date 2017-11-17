package java100.app.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public abstract class GenericController<T> implements Controller {
    static Scanner keyScan = new Scanner(System.in);
    protected ArrayList<T> list = new ArrayList<>();
    
    // 추상 메서드로 선언하여 서브 클래스가 반드시 오버라이딩하도록 강요할 수 있다.
    // Controller 인터페이스로부터 execute()라는 추상 메서드를 
    // 물려 받았기 때문에 여기서 또 선언해서는 안된다.
    //public abstract void execute(); 
}
