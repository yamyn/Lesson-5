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
        int repeattask = 1;
        while (repeattask ==1) {
            System.out.println("what do you want to do? \n" +
                    "1 - Change current speed \n" +
                    "(60km/h is default) \n" +
                    "2 - To put a passenger in the car \n" +
                    "3 - Disembark a passenger from the car \n" +
                    "4 - Disembark all passengers from the car \n" +
                    "5 - Calculate the current possible maximum speed \n" +
                    "6 - Choose door and act with it \n" +
                    "7 - Choose window and act with it");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            switch (choose) {//switch, that choose task
                case 1:
                    car.speedask();
                    break;
                case 2:
                    car.changepeoplle(1);
                    break;
                case 3:
                    car.changepeoplle(-1);
                    break;
                case 4:
                    car.changepeoplle(-car.getNowpeoplle());
                    break;
                case 5:
                    car.maxpossiblespeed();
                    break;
                case 6:
                    System.out.println("Please, choose door \n" +
                            "(To write number door from 1 to 5, where 5 is trunk lid)");
                    int doorchoose = scanner.nextInt();
                    car.doors(doorchoose);
                    break;
                case 7:
                    System.out.println("Please, choose door \n" +
                            "(Window is index 1 is windshield, window is index 6 is rear window. \n" +
                            "They're closed always, so write a window number from 2 to 5)");
                    int windowchoose = scanner.nextInt();
                    car.windows(windowchoose);
                    break;
            }
            System.out.println("Continue acts in this car? \n" +
                    "1 - Yes \n" +
                    "2 - No");
            repeattask = scanner.nextInt();
        }





    }
}
