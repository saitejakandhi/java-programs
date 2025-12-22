// import java.util.Scanner;
// public class Palindrome{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the String:");
//         String str = sc.nextLine();
//         String rev = "";
//         for(int i = str.length() - 1;i >= 0;i --){
//              rev += str.charAt(i);
//         }
//         if(str.equals(rev)){
//             System.out.println("it is a palindrome");
//         }
//         else{
//             System.out.println("it is not a palindrome");
//         }
//     }
// }
import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num; 
        int reversed = 0;
        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if(original == reversed){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }
}