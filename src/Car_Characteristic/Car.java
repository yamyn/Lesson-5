package Car_Characteristic;

import java.util.Scanner;

public class Car {
    Scanner scanner = new Scanner(System.in);
    /*private String dateofman;
    private String engine;
    private int maxspeed;
    private int timetohundred;
    private int maxpeoplle;
    private int nowpeoplle;
    private int speed;*/
//....................................................


    /*public void numberwheel (){
        //System.out.println("Do you want to add few wheels?");
        System.out.println("How many wheels you want to add: ");
        int newWheels = scanner.nextInt();
        int x = 4 + newWheels;

    }*/
    public CarWheel[] wheels = {
            new CarWheel(),
            new CarWheel(),
            new CarWheel(),
            new CarWheel(),
    };
    public void tire (int numbertire){
        int tireinarray = numbertire - 1;
            int reapetin = 1;
            while (reapetin == 1) {
                System.out.println("Write the condition of the tire: \n" +
                        "(from 0,1 to 1)");
                float status = scanner.nextFloat();
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

    public void wheels (){
        System.out.println("Please, choose wheel \n" +
                "(To write number wheel from 1 to the total number of wheels)");
        int wchoose = scanner.nextInt();
        tire(wchoose);
        int reapetwheel = 1;
        while (reapetwheel == 1) {
            tire(wchoose);
            System.out.println("To choose other wheel? \n" +
                    "1- Yes \n" +
                    "2 - No");
            reapetwheel = scanner.nextInt();
            }

        }
        public void allwheelsshow() {
            System.out.println("To show information for other wheels: \n" +
                    "1 - Yes \n" +
                    "2 - No");
            int allinfo = scanner.nextInt();
            if (allinfo == 1) {
                for (int i = 0; i < 4; i++) {
                    int iplus = i + 1;
                    System.out.println("Condition of " + iplus + " wheel - " + wheels[i].getCondition());
                }
            }else {
                System.out.println("ok");
            }
        }

    /*public void xdoor () {
        System.out.println("Please, write number of doors:");
        int xd = scanner.nextInt();
        CarDoor[] doors = new CarDoor[xd];
        for (int n = 0; n < xd; n++) { // 2. Задає елементи масиву
           doors[n] = ;
        }
        System.out.println("Choose door: \n" +
                "To choose driver's door - 1 \n" +
                "To choose passenger front doors - 2 \n" +
                "To choose trunk lid - 3 \n" +
                "to choose other door of car \n" +
                "(Write number of door from 3 to the total number of doors)");
        int doorchoose = scanner.nextInt();
        int cordoorchoose = doorchoose - 1;
            int i = 0;
            while (i < xd){

                i++;

            }

        int repeat = 1;
        while (repeat == 1) {
            System.out.println("Do you want open door? - 1 \n" +
                    "Do you want closed door? - 2 \n" +
                    "Do you want to change the position of the door? - 3 \n" +
                    "(to defeult is closed) \n" +
                    "Do you want open window? - 4 \n" +
                    "Do you want closed window? - 5 \n" +
                    "Do you want to change the position of the wndow? - 6 \n" +
                    "(to defeult is closed)");
            int choosedoor = scanner.nextInt();
            switch (choosedoor){
                case 1:
                    cardoor1.opendoor();
                    break;
                case 2:
                    cardoor1.closeddoor();
                    break;
                case 3:
                    cardoor1.positiondoor();
                    break;
                case 4:
                    cardoor1.openwindow();
                    break;
                case 5:
                    cardoor1.closewindow();
                    break;
                case 6:
                    cardoor1.positionwindow();
                    break;
                default:
                    System.out.println("Invalid number");
            }
            System.out.println("Choose the door and window again \n" +
                    "1 - Yes \n" +
                    "2 - No");
            repeat = scanner.nextInt();
        }
    }
    public CarDoor []window ={
        new CarDoor(),
        new CarDoor(),
        new CarDoor(),
        new CarDoor(),
    };
    public Car (){

    }*/
}
