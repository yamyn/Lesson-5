package Car_Characteristic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Hi!");
        car.askdateofmade();
        car.typeengine();
        car.maxsp();
        car.timeto100();
        car.maxpeopl();
        car.nowpeoplle();
        System.out.println("what do you want to do? \n" +
                "1 - Change current speed \n" +
                "(60km/h is default) \n" +
                "2 - To put a passenger in the car \n" +
                "3 - Disembark a passenger from the car \n" +
                "4 - Disembark all passengers from the car");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose){//switch, that choose task
            case 1:
                car.speedask();
                break;
            case 2:

//................................................................A call Cardoor
                /*CarDoor cardoor1 = new CarDoor();
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
                break;*/
//............................................................................The call CarWheel


        }

    }
}
