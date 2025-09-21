public class IsPalindrome {
    public static void main(String[] args) {
        String originalStr = "Hannah";
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        if (originalStr.toLowerCase().equals(reversedStr.toLowerCase())) {
            System.out.print(originalStr + " is a palindrome");
        } else {
            System.out.print(originalStr + " is not a palindrome");
        }
    }
}
