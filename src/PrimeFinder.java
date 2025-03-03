import java.io.*;
public class PrimeFinder {
    //    Prime checker👍
    private static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i<x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter first number: ");
            int a = Integer.parseInt(reader.readLine());
            System.out.print("Enter second number: ");
            int b = Integer.parseInt(reader.readLine());
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            System.out.println("Prime numbers between " + a + " and " + b + " are:");
            for (int i = a; i <= b; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        } catch ( NumberFormatException e) {
            System.out.println("Enter a valid number.");
        }
    }
}