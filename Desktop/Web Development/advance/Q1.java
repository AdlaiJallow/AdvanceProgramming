package AdvanceProgramming;

import java.util.Scanner;

public class Q1 {
    public static String substring(String worded, int begin, int end) {
        if (begin < 0 || end > worded.length() || begin > end) {
            throw new IllegalArgumentException("Invalid indices");
        }
        return worded.substring(begin, end);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String worded = scan.nextLine();

        System.out.print("Enter the beginning number: ");
        int begin = scan.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scan.nextInt();
        String subStr = substring(worded, begin, end);
        System.out.println(subStr); // Output: llo w
    }
}
