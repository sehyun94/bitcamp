package java100.app.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public abstract class GenericController<T> {
    static Scanner keyScan = new Scanner(System.in);
    protected ArrayList<T> list = new ArrayList<>();
    
    // 추상 메서드로 선언하여 서브 클래스가 반드시 오버라이딩하도록 강요할 수 있다.
    public abstract void execute(); 
}
