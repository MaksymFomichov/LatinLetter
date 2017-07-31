package latin;

/*
Write an application that reverses all the words of input text:
 E.g. "abcd efgh" => "dcba hgfe"
All non-letter symbols should stay on the same places:
 E.g. "a1bcd efg!h" => "d1cba hgf!e"
Use Latin alphabet only.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку в латинской расскладке:");
        String stringLatin = scanner.nextLine();

        for (String text : stringLatin.split(" ")) {
            System.out.print(sortArray(text));
            System.out.print(" ");
        }
    }

    // переставляем символы
    private static String sortArray(String text) {
        char[] charArray = text.toCharArray();
        char[] tempCharArray = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            tempCharArray[i] = charArray[charArray.length - i - 1];
        }
        return new String(tempCharArray);
    }


    // проверям на соответсвие латинскому алфавиту
    private static boolean isLatinLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}
