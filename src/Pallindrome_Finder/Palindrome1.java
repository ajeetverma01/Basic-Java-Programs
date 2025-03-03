package Pallindrome_Finder;

import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inp=sc.nextLine();
        String rev=new StringBuilder(inp).reverse().toString();

        if (inp.equalsIgnoreCase(rev))
            System.out.println("It is a Palindrome word.");
        else
            System.out.println("It is not a Palindrome word.");
    }
}