public class ReverseWords {
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) reversed.append(" ");
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Hello World"));  
        System.out.println(reverseWords("Java Programming"));  
    }
}
