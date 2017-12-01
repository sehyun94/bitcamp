package bitcamp.java100.ch18;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test5 {

    public static void main(String[] args) throws Exception {

        Class<?> clazz = Z.class;

        Method[] methods = clazz.getMethods();
        
        // public 메서드만 찾기 때문에  실행오류!
        // Method m = clazz.getMethod("m3", int.class, float.class);
        
        Method m = clazz.getDeclaredMethod("m3", int.class, float.class);
        System.out.printf("메서드명: %s\n", m.getName());
        
        System.out.printf("리턴 타입 : %s\n", m.getReturnType().getName());
        
        int modifiers = m.getModifiers();
        
        if(Modifier.isPublic(modifiers)) {
            System.out.println("public이다.");
        } else if (Modifier.isProtected(modifiers)) {
            System.out.println("protected 이다");
        } else if (Modifier.isPrivate(modifiers)) {
            System.out.println("private 이다");
        } 
        
        System.out.println(Modifier.toString(modifiers));
    }
}
 