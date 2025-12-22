import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        int digit = 0;

        int temp = num;
        while(temp > 0){
            digit++;
            temp = temp / 10;
        }

        temp = num;

        while(temp > 0){
        int digits = temp % 10;
        sum += Math.pow(digits,digit);
        temp = temp / 10;
        }


        if(original == sum){
            System.out.println("it is a armstrong");
        }
        else{
            System.out.println("it is not a armstrong");
        }
    }
    
}
