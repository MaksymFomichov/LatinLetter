package latin;

/*
Write an application that reverses all the words of input text:
 E.g. "abcd efgh" => "dcba hgfe"
All non-letter symbols should stay on the same places:
 E.g. "a1bcd efg!h" => "d1cba hgf!e"
Use Latin alphabet only.
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите строку в латинской расскладке:");
//        String stringLatin = scanner.nextLine();
        String stringLatin = "asффb jhgf jлнолгел рпаоао  лопр прa1bcd efg!h";

        // выводим через пробел все слова
        for (String text : stringLatin.split(" ")) {
            System.out.print(sortArray(text.trim()));
            System.out.print(" ");
        }
    }

    // переставляем символы
    private static String sortArray(String text) {
        char[] charArray = text.toCharArray();
        //System.out.println("charArray " + charArray.length + " " + Arrays.toString(charArray));
        ArrayList<Character> tempCharArray = new ArrayList<>();
        // меняем местами все латинские символы
        for (int i = 0; i < charArray.length; i++) {
            char temp = charArray[charArray.length - i - 1];
            if (isLatinLetter(temp)) {
                tempCharArray.add(temp);
            }
        }
        // вставляем на свои места все не латинские символы
        for (int i = 0; i < charArray.length; i++) {
            char temp = charArray[i];
            if (!isLatinLetter(temp)) {
                tempCharArray.add(i, temp);
            }
        }
        // конвертируем аррейлист чаров в стринг
        StringBuilder builder = new StringBuilder(tempCharArray.size());
        for (Character ch : tempCharArray) {
            builder.append(ch);
        }
        return builder.toString();
    }

    // проверям на соответствие латинскому алфавиту
    private static boolean isLatinLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}
