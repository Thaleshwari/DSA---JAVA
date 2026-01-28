
import java.util.*;

public class LetterCasePermutation {

    static List<String> result = new ArrayList<>();


    static void backtrack(String s, int index, StringBuilder path) {

        // Goal
        if (index == s.length()) {
            result.add(path.toString());
            return;
        }

        char ch = s.charAt(index);

        // Digit 
        if (Character.isDigit(ch)) {
            path.append(ch);
            backtrack(s, index + 1, path);
            path.deleteCharAt(path.length() - 1); // backtrack
        }
        // Letter
        else {
            // lowercase
            path.append(Character.toLowerCase(ch));
            backtrack(s, index + 1, path);
            path.deleteCharAt(path.length() - 1);

            // uppercase
            path.append(Character.toUpperCase(ch));
            backtrack(s, index + 1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }

    
    public static void main(String[] args) {

        String s = "a1b2";

        backtrack(s, 0, new StringBuilder());

        // Print result
        for (String str : result) {
            System.out.println(str);
        }
    }


}

