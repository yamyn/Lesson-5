package Car_Characteristic;

import java.util.Scanner;

public class CarWheel {
    Scanner scanner = new Scanner(System.in);
    private float condition;
//......................................................Constructor
    public CarWheel (){
        this.condition = 1.0f;
    }
//......................................................
    public float getCondition() {
        return condition;
    }
    public void setCondition(float condition){
        this.condition = condition;
    }
//......................................................
    public void newWheel(){
        this.condition = 1.0f;
        System.out.println("The tire was replaced.");
    }
    public void usewheel(int uses){
        float usesf = (float)uses/100;
        float erase = this.condition*usesf;
        float stat = this.condition-erase;
        this.condition = stat;
    }

//......................................................
    public void askshow (){
        System.out.println("To show object parametres? \n" +
                "1 - Yes \n" +
                "2 - No");
        int parametres = scanner.nextInt();
        if (parametres == 1){
            show();
        }else {
            System.out.println("Okay");
        }
    }
    public void show (){
        System.out.println("Condition of wheel is " + condition);
    }
}
