import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day number:");
        int number = sc. nextInt();
        System.out.print("it is");
        switch(number){
            case 1:
            System.out.println("monmday.");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("Sunday");
            break;
        }
        
    }
    
}
