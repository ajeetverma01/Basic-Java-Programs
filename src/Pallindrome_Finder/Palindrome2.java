package Pallindrome_Finder;

import java.util.Scanner;

public class Palindrome2 {
    public static void isPalindrome(String str)
    {
        String rev = "";
        boolean ans = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            ans = true;
        }
        if (ans)
            System.out.println("It is a Palindrome word.");
        else
            System.out.println("It is not a Palindrome word.");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str =sc.nextLine();

        str = str.toLowerCase();
        isPalindrome(str);
    }
}
