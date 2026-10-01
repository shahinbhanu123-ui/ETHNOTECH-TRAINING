
public class StringMethod {
    public static void main(String[] args) {

        String str = "Java Programming";
        String s1 = str;

        System.out.println("Original: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("UpperCase: " + str.toUpperCase());
        System.out.println("LowerCase: " + str.toLowerCase());

        System.out.println("Equals: " + str.equals(s1));
        System.out.println("EqualsIgnoreCase: " + str.equalsIgnoreCase("java programming"));

        System.out.println("Contains: " + str.contains("Java"));
        System.out.println("StartsWith: " + str.startsWith("Java"));
        System.out.println("EndsWith: " + str.endsWith("ming"));

        System.out.println("Substring: " + str.substring(5));
        System.out.println("IndexOf: " + str.indexOf("Programming"));
        System.out.println("LastIndexOf: " + str.lastIndexOf("a"));

        System.out.println("Replace: " + str.replace("Java", "Python"));

        String str2 = "   Java Programming   ";
        System.out.println("Trim: " + str2.trim());

        String[] words = str.split(" ");
        System.out.println("Split:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

