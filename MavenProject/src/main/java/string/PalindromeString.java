package string;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();//Malayalam,Java

        if (isPalindrome(userInput)) {//true(malayalam)
            System.out.println("the word " + userInput + " is a palindrome.");
        } else {//false(Java)
            System.out.println("the word " + userInput + " is not a palindrome.");
        }

    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();//str=malayalam,java

        String reversed = new StringBuilder(str).reverse().toString();//reversed=malayalam,avaj

        return str.equals(reversed);//(str)malayalam=(reversed)malayalam(true),java=avaj(false)
    }
}

