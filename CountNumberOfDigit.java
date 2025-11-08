import java.util.Scanner;

public class CountNumberOfDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of digits:");
        int num = sc.nextInt();
        System.out.println("Total number of digits:");
        int count = String.valueOf(num).length();
        System.out.println(count);

    }
    
}
