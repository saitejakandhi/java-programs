import java.util.Scanner;
public class ReverseOfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String str = sc.nextLine();
        System.out.println("Reverse of string:");
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
    
}
