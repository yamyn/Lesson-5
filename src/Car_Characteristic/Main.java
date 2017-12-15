package Car_Characteristic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi!");
        System.out.println("what do you want to do? \n" +
                "1 - Choose a door and window \n" +
                "2 - Choose a wheel \n" +
                "3 - Information about car");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose){//switch, that choose task
            case 1:
//................................................................A call Cardoor
                CarDoor cardoor1 = new CarDoor();
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
                break;
//............................................................................The call CarWheel
            case 2:
                Car car = new Car();
                int reapetw = 1;
                while (reapetw ==1){
                    System.out.println("Write the condition of the tire: \n" +
                            "(from 0,1 to 1)");
                    float status = scanner.nextFloat();
                    carwheel1.setCondition(status);
                    int reapetin = 1;
                    while (reapetin == 1) {
                            System.out.println("Do you want to replace the tire to a new one? - 1 \n" +
                                    "Erase the tire by? - 2\n" +
                                    "(write the level of erase in percent) \n" +
                                    "To show object parametres? - 3");
                            int choosewheel = scanner.nextInt();
                            switch (choosewheel) {
                                case 1:
                                    carwheel1.newWheel();
                                    carwheel1.askshow();
                                    break;
                                case 2:
                                    System.out.println("Please, write percent of erase: ");
                                    int percent = scanner.nextInt();
                                    carwheel1.usewheel(percent);
                                    carwheel1.askshow();
                                    break;
                                case 3:
                                    carwheel1.show();
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
                        System.out.println("Choose other wheel? \n" +
                            "1 - Yes \n" +
                            "2 - No");
                        reapetw = scanner.nextInt();
                    }
            case 3:

        }

    }
}
