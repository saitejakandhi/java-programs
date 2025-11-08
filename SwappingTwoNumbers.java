public class SwappingTwoNumbers {
    public static void swap(int a, int b){
        System.out.println("Before Swapping:");
        System.out.println("a:" + a);
        System.out.println("b:"+b);
         a = a + b;
         b = a - b;
         a = a -b ;
         System.out.println("after Swapping:");
         System.out.println("a:" + a);
         System.out.println("b:" + b);
    }
    public static void main(String[] args){
        int a = 10;
        int b =20;
        swap(a,b);
    }
    
}
