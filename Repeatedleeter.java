import java.util.HashMap;
import java.util.Map;

public class Repeatedleeter {

    public void Repeat(String str) {
        String currentstr = str.trim();
        int n = currentstr.length();
        int i = 0;
        int j = 0;
        int maxlength = 0;
        String resultWord = "";

        while (j <= n) {
            if (j == n || currentstr.charAt(j) == ' ') {
                if (i < j) {
                    String word = currentstr.substring(i, j);
                    int value = findrepeat(word);
                    if (value > maxlength) {
                        maxlength = value;
                        resultWord = word;
                    }
                }
                i = j + 1;
            }
            j++;
        }

        if (resultWord.equals("")) {
            System.out.println("-1");
        } else {
            System.out.println("Word with most repeated letters: " + resultWord);
            System.out.println("Number of repeated letters: " + maxlength);
        }
    }

    public int findrepeat(String stf) {
        HashMap<Character, Integer> newhash = new HashMap<>();
        for (int i = 0; i < stf.length(); i++) {
            char c = Character.toLowerCase(stf.charAt(i));
            newhash.put(c, newhash.getOrDefault(c, 0) + 1);
        }

        int maxrepeat = 0;
        for (Map.Entry<Character, Integer> entry : newhash.entrySet()) {
            if (entry.getValue() > 1) {
                maxrepeat++;
            }
        }
        return maxrepeat;
    }

    public static void main(String[] args) {
        Repeatedleeter rl = new Repeatedleeter();
        rl.Repeat("apple banana mango strawberry");
    }
}
