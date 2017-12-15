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
               car.wheels();
            case 3:

        }

    }
}
