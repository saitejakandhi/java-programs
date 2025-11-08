import java.util.Scanner;

public class FibonnaciSeries {
    public static int fibonnaci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonnaci(n - 1) + fibonnaci( n - 2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i <= n;i++){
        System.out.println(fibonnaci(i));
        }
    }
    
}
