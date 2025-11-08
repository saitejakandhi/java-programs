import java.util.Scanner;

public class DecimalToBinaryConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binaryvalue = Integer.toBinaryString(n);
        System.out.println(binaryvalue);
    }
    
}
