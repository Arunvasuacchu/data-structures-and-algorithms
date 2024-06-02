package Strings;

public class Reverse {
    public static void main(String[] args) {
        String str = "Arunvasu";
        System.out.println(reverseArray(str).toLowerCase());
    }

    static String reverseArray(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char temp = charArray[start]; // Store the current character in a temporary variable
            charArray[start] = charArray[end]; // Swap characters
            charArray[end] = temp; // Assign the temporary variable to the end character
            start++;
            end--;
        }
        return new String(charArray);
    }
}
