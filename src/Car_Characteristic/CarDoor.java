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
    public String getDoor(){
        return door;
    }
    public String getWindow(){
        return window;
    }
//................................................Control door

    public void opendoor(){
        this.door ="open";
        showdoor();
    }
    public void closeddoor(){
        this.door = "closed";
        showdoor();
    }

    public void positiondoor(){
        if (door == "closed"){
            this.door = "open";
            showdoor();
        }else if (door == "open"){
            this.door = "closed";
            showdoor();
        }
    }
//...................................................Control window
    public void openwindow(){
        this.window ="open";
        showwindow();
    }
    public void closewindow(){
        this.window = "closed";
        showwindow();
    }

    public void positionwindow(){
        if (window == "closed"){
            this.window = "open";
            showwindow();
        }else if (window == "open"){
            this.window = "closed";
            showwindow();
        }
    }
//.....................................................Show to consol configurations
    public void showdoor (){
        System.out.println("The door is " + door);
    }
    public void showwindow(){
        System.out.println("The window is " + window);
    }
}
