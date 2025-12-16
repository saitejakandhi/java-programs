// given integer seperate even and odd number 
import java.util.Scanner;
public class EvenAndOddNumberSepLine {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String num = sc.nextLine();
    StringBuilder odd = new StringBuilder();
    StringBuilder even = new StringBuilder();
    for(char ch : num.toCharArray()){
        int digit = ch - '0';
        if(digit % 2 == 0){
            even.append(digit).append(" ");
        }
        else{
            odd.append(digit).append(" ");

        }

    }
    System.out.println(even.toString().trim());
    System.out.println(odd.toString().trim());
}
    
}
