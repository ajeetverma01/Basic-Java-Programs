import java.util.Scanner;
class StringOperations {
    public static void main(String[] args) {
        String xx = new String();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input string: ");
        xx = sc.nextLine();
        System.out.println("Uppercase:  " + xx.toUpperCase());
        System.out.println("Lowercase: " + xx.toLowerCase());
        System.out.println("Is empty: " + xx.isEmpty());
        System.out.println("Starts with  " + xx.endsWith(xx));
    }
}