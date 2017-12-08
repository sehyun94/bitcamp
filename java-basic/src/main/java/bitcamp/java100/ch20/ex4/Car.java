package bitcamp.java100.ch20.ex4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Car {
    
    private String model;
    private String color;
    private int capacity;
    private Engine engine;
    private Tire[] tires;
    private List<Seat> seats;
    private Set<CD> jukebox;
    private Map<String,String> options;
     
    public Car() {
        System.out.println("Car()생성");
    }



    @Override
    public String toString() {
        return "Car [model=" + model + ", color=" + color + ", capacity=" + capacity + ", engine=" + engine + ", tires="
                + Arrays.toString(tires) + ", seats=" + seats + ", jukebox=" + jukebox + ", options=" + options + "]";
    }



    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }

    public Set<CD> getJukebox() {
        return jukebox;
    }


    public void setJukebox(Set<CD> jukebox) {
        this.jukebox = jukebox;
    }


    public Tire[] getTires() {
        return tires;
    }


    public void setTires(Tire[] tires) {
        this.tires = tires;
    }


    public List<Seat> getSeats() {
        return seats;
    }


    public void setSeats(List<Seat> seats) {
        this.seats = seats;
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
