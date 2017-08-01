package latin;

import java.util.ArrayList;

public class ReverseLatin {
    private String enterText;

    public ReverseLatin(String text) {
        this.enterText = text;
    }

    public String getText() {
        String temp = "";
        for (String text1 : enterText.split(" ")) {
            temp += sortArray(text1.trim());
            temp += " ";
        }
        return temp;
    }

    // переставляем символы
    private String sortArray(String text) {
        char[] charArray = text.toCharArray();
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
    private boolean isLatinLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}
