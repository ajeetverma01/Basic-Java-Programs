import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class PossibleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();
        ArrayList<Integer> possibleNumbers = allNumbers(inputNumber);
        System.out.println("Possible numbers using the digits of " + inputNumber + " are: " + possibleNumbers);
    }
    private static ArrayList<Integer> allNumbers(int number) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(number % 10);
            number /= 10;
        }
        Collections.reverse(digits);
        ArrayList<Integer> possibleNumbers = new ArrayList<>();
        generatePermutations(digits, 0, possibleNumbers);
        return possibleNumbers;
    }
    //    Permutations
    private static void generatePermutations(ArrayList<Integer> digits, int index, ArrayList<Integer> possibleNumbers) {
        if (index == digits.size() - 1) {
            int num = 0;
            for (int digit : digits) {
                num = num * 10 + digit;
            }
            possibleNumbers.add(num);
        } else {
            for (int i = index; i < digits.size(); i++) {
                Collections.swap(digits, index, i);
                generatePermutations(digits, index + 1, possibleNumbers);
                Collections.swap(digits, index, i); // Backtrack
            }
        }
    }
}