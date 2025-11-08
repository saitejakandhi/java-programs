import java.util.Scanner;
public class AddFirstAndLastDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers:");
        String num = sc.next();
        int Firstdigit = num.charAt(0) - '0';
        int lastdigit = num.charAt(num.length()  - 1) - '0';
        int sum = Firstdigit + lastdigit ;
        System.out.println(sum);


    }
}