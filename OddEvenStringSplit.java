import java.util.Scanner;
public class OddEvenStringSplit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for(int i = 0; i < S.length();i++){
        if((i + 1) % 2 == 1){
            odd.append (S.charAt(i));
        }
        else{
            even.append(S.charAt(i));
        }
    }
    System.out.print(odd.toString() +" ");
    System.out.print(even.toString());
    }
}
