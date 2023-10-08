public class RemoveSameColorsIfTheyAreOfSameColors {
    public static boolean whoWinsTheGame(String str) {

        int countA = 0;
        int countB = 0;
        int streak = 1;
        char current = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (current == str.charAt(i)) {
                streak++;
            } else {
                if (current == 'a') {
                    countA += streak > 3 ? streak - 2 : 0;
                }
                if (current == 'b') {
                    countB += streak > 3 ? streak - 2 : 0;
                }
                streak = 1;
                current = str.charAt(i);
            }
        }
        if (current == 'a') {
            countA += streak > 3 ? streak - 2 : 0;
        }
        if (current == 'b') {
            countB += streak > 3 ? streak - 2 : 0;
        }

        return countA > countB;
    }
}
