import java.util.*;

public class Pyramidpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int K = 1; K <= i; K++) {
                System.out.print("*");
                if (K < i) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
