public class d2compression {
    public static String compress(String str) {
        String newStr = ""; // To store the compressed string
        for (int i = 0; i < str.length(); i++) {
            int count = 1; // Start count as 1 for the current character

            // Count consecutive characters
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Add the character to the compressed string
            newStr += str.charAt(i);

            // Add the count only if it is greater than 1
            if (count > 1) {
                newStr += count;
            }
        }
        return newStr; // Return the compressed string
    }

    public static void main(String[] args) {
        String str = "abcccd";
        System.out.println("Original String: " + str);
        System.out.println("Compressed String: " + compress(str));
    }
}
