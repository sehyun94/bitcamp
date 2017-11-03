package bitcamp.java100.ch08.ex7;

public class A3 extends A {
    
    // 접근 범위를 확장하기
    
    // default ===> protected 
    protected void m2() {} //"OK"

    // default ===> public
    //public void m2() {} //"OK"
    
    // protected ==> public 
    public void m3() {}  //"OK"
    // 접근 범위 축소 
    // default ===> private
    // private void m2() {} =>컴파일오류
    
    // protected === > default
    // void m3() {}
    
    // public ==> protected 
    // protected void m4() {}
}
