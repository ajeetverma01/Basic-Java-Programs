import java.util.Scanner;
public class ReverseWordInLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String inpLine = sc.nextLine();
        String rev = revWord(inpLine);  //The revWord() is called
        System.out.println("\nAnswer:\n" + rev);
    }
    private static String revWord(String line) {
        String words[] = line.split(" ");
        StringBuilder revLine = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String revWord = reverseString(words[i]);
            revLine.append(revWord);
            if (i < words.length - 1) {
                revLine.append(" ");
            }
        }
        return revLine.toString();
    }
    private static String reverseString(String str) {
        StringBuilder revStr = new StringBuilder(str);
        return revStr.reverse().toString();
    }
}