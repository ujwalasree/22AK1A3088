public class ReverseWords {
    public static void main(String[] args) {
        String input = "my name is Raja";
        String result = reverseWords(input);
        System.out.println(result);
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse().toString()).apgitpend(" ");
        }

        return reversedString.toString().trim();
    }
}