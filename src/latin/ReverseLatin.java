package latin;

import java.util.ArrayList;

public class ReverseLatin {
    private String enterText;

    public ReverseLatin(String text) {
        this.enterText = text;
    }

    public String getReverseText() {
        String resultText = "";
        for (String temp : enterText.split(" ")) {
            resultText += sortArray(temp);
            resultText += " ";
        }
        return resultText.trim();
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
        return convertCharacter(tempCharArray);
    }

    // конвертируем аррейлист чаров в стринг
    private String convertCharacter(ArrayList<Character> character){
        StringBuilder builder = new StringBuilder(character.size());
        for (Character ch : character) {
            builder.append(ch);
        }
        return builder.toString();
    }

    // проверям на соответствие латинскому алфавиту
    private boolean isLatinLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}
