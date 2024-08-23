package Easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 1213;
        String isPalindrome = Integer.toString(x);
        int len = isPalindrome.length();
        boolean answer = true;
        for (int i = 0; i < len / 2; i++) {
            if (isPalindrome.charAt(i) != isPalindrome.charAt(len - i - 1)) {
                answer = false;
                break;
            }
        }
        System.out.println(answer);
    }
}
