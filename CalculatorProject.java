interface SimpleCalculator {
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    int div(int a, int b);
}

interface AdvanceCalculator extends SimpleCalculator {
    int modulus(int a, int b);
    int power(int a, int b);
}

interface ScientificCalculator extends AdvanceCalculator {
    double sin(int a);
    double cos(int a);
    double tan(int a);
    double log(int a);
    double sqrt(int a);
}

interface ProgramCalculator extends ScientificCalculator {
    String binary(int a);
    String octal(int a);
}

interface AllCalculator extends ProgramCalculator {
    int factorial(int a);
    int fibonacci(int a);
    int gcd(int a, int b);
    int lcm(int a, int b);
    int permutation(int n, int r);
    int combination(int n, int r);
    boolean prime(int a);
    boolean armstrong(int a);
    boolean palindrome(int a);
}

class MyCalculator implements AllCalculator {
    // Basic
    public int add(int a, int b) { return a + b; }
    public int sub(int a, int b) { return a - b; }
    public int mul(int a, int b) { return a * b; }
    public int div(int a, int b) { return a / b; }

    // Advanced
    public int modulus(int a, int b) { return a % b; }
    public int power(int a, int b) {
        int result = 1;
        for(int i = 1; i <= b; i++) result *= a;
        return result;
    }

    // Scientific
    public double sin(int a) { return Math.sin(Math.toRadians(a)); }
    public double cos(int a) { return Math.cos(Math.toRadians(a)); }
    public double tan(int a) { return Math.tan(Math.toRadians(a)); }
    public double log(int a) { return Math.log(a); }
    public double sqrt(int a) { return Math.sqrt(a); }

    // Programmer
    public String binary(int a) {
        return Integer.toBinaryString(a); }
    public String octal(int a) { 
        return Integer.toOctalString(a);
    }

    // Extra
    public int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) fact *= i;
        return fact;
    }
    public int fibonacci(int a) {
        if (a <= 1) return a;
        return fibonacci(a - 1) + fibonacci(a - 2);
    }
    public int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public int permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }
    public int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
    public boolean prime(int a) {
        if (a <= 1) return false;
        for (int i = 2; i <= Math.sqrt(a); i++)
            if (a % i == 0) return false;
        return true;
    }
    public boolean armstrong(int a) {
        int sum = 0, temp = a, digits = String.valueOf(a).length();
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum == a;
    }
    public boolean palindrome(int a) {
        int original = a, reversed = 0;
        while (a != 0) {
            reversed = reversed * 10 + (a % 10);
            a /= 10;
        }
        return original == reversed;
    }
}

public class CalculatorProject {
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();
        System.out.println("Add: " + calc.add(5, 3));
        System.out.println("Power: " + calc.power(2, 5));
        System.out.println("Sin 90: " + calc.sin(90));
        System.out.println("Binary of 10: " + calc.binary(10));
        System.out.println("Factorial of 5: " + calc.factorial(5));
        System.out.println("Is 153 Armstrong? " + calc.armstrong(153));
        System.out.println("Is 131 Palindrome? " + calc.palindrome(131));
        System.out.println("Prime check (17): " + calc.prime(17));
    }
}