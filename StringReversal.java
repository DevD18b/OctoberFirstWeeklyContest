
public class StringReversal {
    public static String reverse(String str) {
        String ans = " ";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String reverse = " ";
            String currentWord = arr[i];
            char[] revArray = currentWord.toCharArray();
            for (int j = revArray.length - 1; j >= 0; j--) {
                reverse += revArray[i];
            }
            ans += reverse;
        }
        return ans.trim();
    }
}