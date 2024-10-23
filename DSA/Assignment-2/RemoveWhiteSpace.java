public class RemoveWhiteSpace {
    public static String removeWhiteSpaces(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("Hello World"));  
        System.out.println(removeWhiteSpaces("  Java   Programming  "));  
    }
}
