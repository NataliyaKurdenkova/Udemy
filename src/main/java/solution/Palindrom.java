package solution;
/**
 * Checks if given <code>text</code> is a palindrome.
 *
 * @param //<code>text</code> any string
 * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
 */

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }

    public static boolean isPalindrome(String text) {
        String newStr =text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb=new StringBuilder(newStr);
        return newStr.equalsIgnoreCase(sb.reverse().toString());
        //  return matcher.find(); // your implementation here
    }
}
