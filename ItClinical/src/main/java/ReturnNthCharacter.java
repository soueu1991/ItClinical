public class ReturnNthCharacter {


    public String getNewWord(String word, int n) {
        if (word.length() < n || n < 1) {
            return "";
        }

        StringBuilder newWord = new StringBuilder();

        for (int i = n - 1; i < word.length(); i += n) {
            char letter = word.charAt(i);

            if (Character.isUpperCase(letter) || Character.isDigit(letter)) {

                newWord.append(letter);
            }
        }

        return newWord.toString();
    }
}
