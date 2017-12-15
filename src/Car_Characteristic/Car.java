package Car_Characteristic;

public class Car {
    private String dateofman;
    private String engine;
    private int maxspeed;
    private int timetohundred;
    private int maxpeoplle;
    private int nowpeoplle;
    private int speed;
//....................................................
    public CarWheel[]wheels = {
        new CarWheel(),
        new CarWheel(),
        new CarWheel(),
        new CarWheel(),
    };
    public CarDoor []doors ={
        new CarDoor(),
        new CarDoor(),
        new CarDoor(),
        new CarDoor(),
        new CarDoor(),
    };
    public CarDoor []window ={
        new CarDoor(),
        new CarDoor(),
        new CarDoor(),
        new CarDoor(),
    };
    public Car (){

    }
}
