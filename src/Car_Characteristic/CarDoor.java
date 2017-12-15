package Car_Characteristic;

public class CarDoor {//This class control door and window
    private String door;
    private String window;
//.................................................Constructor
    public CarDoor (){
        this("cloased", "cloased");
    }

    public CarDoor (String door, String window){
        this.door = door;
        this.window = window;
    }
//................................................Control door

    public void opendoor(){
        this.door ="open";
        show();
    }
    public void closeddoor(){
        this.door = "closed";
        show();
    }

    public void positiondoor(){
        if (door == "closed"){
            this.door = "open";
            show();
        }else if (door == "open"){
            this.door = "closed";
            show();
        }
    }
//...................................................Control window
    public void openwindow(){
        this.window ="open";
        show();
    }
    public void closewindow(){
        this.window = "closed";
        show();
    }

    public void positionwindow(){
        if (window == "closed"){
            this.window = "open";
            show();
        }else if (window == "open"){
            this.window = "closed";
            show();
        }
    }
//.....................................................Show to consol configurations
    public void show(){
        System.out.println("The door is " + door + " and window is " + window);
    }
}
