import java.util.Scanner;

public class UsingLoopReverseOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println("Reverse of Number");
        for(int i = num;i >= 1;i--){
            System.out.print(i);
        }
    }
    
}
