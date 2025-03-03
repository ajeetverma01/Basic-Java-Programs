package Pallindrome_Finder;
import java.util.Scanner;

public class Palindrome3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str =sc.nextLine();

        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();

        if (str.equals(str1.toString())) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a palindrome String");
        }
    }
}
