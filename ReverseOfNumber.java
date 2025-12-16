import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Reverse of number");
        int reversed = 0;
        while( num != 10){
            int digit = num % 10 ;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println(reversed);
    }
    
}
