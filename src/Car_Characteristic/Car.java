package Car_Characteristic;

import java.util.Scanner;

public class Car {
    Scanner scanner = new Scanner(System.in);
    private String dateMade;
    private String engine;
    private int maxspeed;
    private int timetohundred;
    private int maxpeoplle;
    private int nowpeoplle;
    private int speed = 60;
    private int removeWheel = 0;
//.................................................... for date
    public String getDateofmade (){
        return dateMade;
    }
    public void askdateofmade (){
        System.out.println("Write date of manufacture ");
        this.dateMade = scanner.nextLine();
    }
    public void dateshow (){
        System.out.println(getDateofmade() + " - date of manufacture of the car  ");
    }
//........................................................ask type engine
    public String getEngine(){
        return engine;
    }
    public void typeengine (){
        System.out.println();
        System.out.println("Write type for engine ");
        this.engine = scanner.nextLine();
    }
    public void engineshow (){
        System.out.println("Car's engine is " + getEngine());
    }
//...........................................................ask max speed

    public int getMaxspeed(){
        return maxspeed;
    }
    public void maxsp () {
        System.out.println();
        System.out.println("Write maximum speed of the car (km/h)");
        this.maxspeed = scanner.nextInt();
    }
    public void maxspeedshow (){
        System.out.println("Maximum speed is " + getMaxspeed() + "km/h ");
    }
//...............................................................ask current speed
    public int getSpeed(){
    return speed;
    }
    public void speedask () {
        System.out.println();
        System.out.println("Write current speed of the car (km/h)");
        this.speed = scanner.nextInt();
    }

    public void speedShow (){
        System.out.println("Current speed is " + getSpeed() + "km/h ");
    }
//...............................................................ask time to hundred

    public int getTimetohundred(){
        return timetohundred;
    }
    public void timeto100 () {
        System.out.println();
        System.out.println("Write acceleration time to one hundred (sec)");
        this.timetohundred = scanner.nextInt();
    }
    public void time100Show (){
        System.out.println("Acceleration time to one hundred is " + getTimetohundred() + "second ");
    }
//...............................................................ask maximum number of passengers
    public int getMaxpeoplle(){
    return maxpeoplle;
    }
    public void maxpeopl () {
        System.out.println();
        System.out.println("Write maximum number of passengers  ");
        this.maxpeoplle = scanner.nextInt();
    }
    public void maxpeoplleShow (){
        System.out.println("Maximum number of passengers is " + getMaxpeoplle());
    }
//..................................................................Number of passengers inside the car
    public int getNowpeoplle(){
    return nowpeoplle;
    }
    public void nowpeoplle () {
        System.out.println();
        System.out.println("Write number of passengers inside the car ");
        this.nowpeoplle = scanner.nextInt();
    }

    public void changepeoplle (int xpas){
        int newpas = this.nowpeoplle + xpas;
        if (newpas <= this.maxpeoplle){//Control number of passenger
            this.nowpeoplle = newpas;
            } else {
            System.out.println("There are no more seats in the car!");
            }
    }
    public void nowpeoplleShow (){
        System.out.println("Number of passengers inside the car is " + getNowpeoplle());
    }
//...............................................................The Work for array door
    public CarDoor[] door = {
        new CarDoor(),
        new CarDoor(),
        new CarDoor(),
        new CarDoor(),
        new CarDoor(),
    };
    public void doors (int doorChs){
        int doorchoose = doorChs - 1;
        int drepeat = 1;
        while (drepeat == 1) {
            System.out.println("Do you want open door? - 1 \n" +
                    "Do you want closed door? - 2 \n" +
                    "Do you want to change the position of the door? - 3 \n" +
                    "(to defeult is closed)");
            int choosedoor = scanner.nextInt();
            switch (choosedoor){
                case 1:
                    door[doorchoose].opendoor();
                    break;
                case 2:
                    door[doorchoose].closeddoor();
                    break;
                case 3:
                    door[doorchoose].positiondoor();
                    break;
                default:
                    System.out.println("Invalid number");
            }
            System.out.println("Choose the door  again \n" +
                    "1 - Yes \n" +
                    "2 - No");
            drepeat = scanner.nextInt();
        }
    }
    public void doorShow (){
        for (int i = 0; i < 5; i++){
            int e = i + 1;
            System.out.println("Door with number " + e + " is " + door[i].getDoor());
        }
    }
//.................................................................The work for array window
public CarDoor[] window = {
        new CarDoor(),
        new CarDoor(),
        new CarDoor(),
        new CarDoor(),
        new CarDoor(),
        new CarDoor(),
};
    public void windows (int windowchs){
        int windowchoose = windowchs - 1;
        if (windowchoose == 0 || windowchoose == 4 ){
            System.out.println("Frontal and rear windows do not open!");
        } else {
            int wrepeat = 1;
            while (wrepeat == 1) {
                System.out.println("Do you want open window? - 1 \n" +
                        "Do you want closed window? - 2 \n" +
                        "Do you want to change the position of the window? - 3 \n" +
                        "Car have 6 window. \n" +
                        "(to defeult all window is closed)");
                int choosewindow = scanner.nextInt();
                switch (choosewindow) {
                    case 1:
                        window[windowchoose].openwindow();
                        break;
                    case 2:
                        window[windowchoose].closewindow();
                        break;
                    case 3:
                        window[windowchoose].positionwindow();
                        break;
                    default:
                        System.out.println("Invalid number");
                }
                System.out.println("Choose the window again \n" +
                        "1 - Yes \n" +
                        "2 - No");
                wrepeat = scanner.nextInt();
            }
        }
    }
    public void windowShow (){
        for (int i = 0; i < 5; i++){
            int e = i + 1;
            System.out.println("Window with number " + e + " is " + window[i].getWindow());
        }
    }
//..................................................................
    public CarWheel[] wheels = {
            new CarWheel(),
            new CarWheel(),
            new CarWheel(),
            new CarWheel(),
    };

    public void wheels (){
        System.out.println("Please, choose wheel \n" +
                "(To write number wheel from 1 to the total number of wheels)");
        int wchoose = scanner.nextInt();
        System.out.println("Write the condition of the tire: \n" +
                "(from 0,1 to 1)");
        float statusk = scanner.nextFloat();
        tire(wchoose, statusk);
    }

    public void tire (int numbertire, float status){
        int tireinarray = numbertire - 1;
            int reapetin = 1;
            while (reapetin == 1) {
                wheels[tireinarray].setCondition(status);
                System.out.println("Do you want to replace the tire to a new one? - 1 \n" +
                        "Erase the tire by? - 2\n" +
                        "(write the level of erase in percent) \n" +
                        "To show object parametres? - 3");
                int choosewheel = scanner.nextInt();
                switch (choosewheel) {
                    case 1:
                        wheels[tireinarray].newWheel();
                        wheels[tireinarray].askshow();
                        break;
                    case 2:
                        System.out.println("Please, write percent of erase: ");
                        int percent = scanner.nextInt();
                        wheels[tireinarray].usewheel(percent);
                        wheels[tireinarray].askshow();
                        break;
                    case 3:
                        wheels[tireinarray].show();
                        break;
                    default:
                        System.out.println("Invalid number");
                }
                System.out.println();
                System.out.println("Choose the wheel again? \n" +
                        "1 - Yes \n" +
                        "2 - No");
                reapetin = scanner.nextInt();
            }
        allwheelsshow();

    }

    public void wheelRemove (){
        this.removeWheel = 1;
        System.out.println("The wheel was removed");
    }
    public void allwheelsshow() {//
        System.out.println("To show information for all wheels: \n" +
                "1 - Yes \n" +
                "2 - No");
        int allinfo = scanner.nextInt();
        if (allinfo == 1) {
            tireshow();
        } else {
            System.out.println("ok");
        }
        System.out.println("To select other wheels?\n" +
                "1 - Yes \n" +
                "2 - No");
        int otherwheel = scanner.nextInt();
        if (otherwheel == 1) {
            wheels();
        } else if (otherwheel != 1) {
            System.out.println("Okay");
        }
    }

    public void tireshow () {
        if (this.removeWheel == 0) {
            for (int i = 0; i < 4; i++) {
                int iplus = i + 1;
                System.out.println("Condition of " + iplus + " tire - " + wheels[i].getCondition());
            }
        } else if (this.removeWheel == 1){
                System.out.println("The wheels is absent");
        }

    }
    public void maxpossiblespeed (){
        int possibSpeed;
        if (this.nowpeoplle == 0){
            possibSpeed = 0;
        } else {
            float min = Float.MIN_VALUE;
            for (int i = 0; i < wheels.length; i++){
                min = Math.min(min, this.wheels[i].getCondition());
            }
            System.out.println("min " + min);
        }

    }
    //..............................................................Calculate the current possible maximum speed

//.........................................................


}
