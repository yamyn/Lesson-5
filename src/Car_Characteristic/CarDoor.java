package Car_Characteristic;

public class CarDoor {
    public String door;
    public String window;

    /*public CarDoor(){
        this("closed", "closed" );
    }


    public CarDoor(String door, String window){
        this.door = door;
        this.window = window;
    }*/


    public CarDoor (){
        this("cloased", "cloased");
    }
    public CarDoor (String door, String window){
        this.door = door;
        this.window = window;
    }


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

    public void show(){
        System.out.println("The door was " + door + " and window is " + window);
    }
}
