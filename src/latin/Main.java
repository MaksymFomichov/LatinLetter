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
        System.out.println(new ReverseLatin(stringLatin).getReverseText());
    }
}
