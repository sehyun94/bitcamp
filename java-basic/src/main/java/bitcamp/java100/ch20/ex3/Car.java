package bitcamp.java100.ch20.ex3;

public class Car {
    
    private String model;
    private String color;
    private int capacity;
    private Engine engine;
    
    public Car() {
        System.out.println("Car()생성");
    }
    
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
        System.out.println("SetModel()생성");
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
        System.out.println("setColor() 생성");
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
        System.out.println("setCapacity() 생성");
    }
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    

}
