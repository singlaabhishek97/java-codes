import java.util.ArrayList;
import java.util.HashSet;

public class GenerateAllPermutationsDuplicateChars {
    // Duplicate strings will be automaticallry removed as we are using HashSet
    public static HashSet<String> getPerms(String str) {
        if(str == null) {
            return null;
        }
        HashSet<String> permutations = new HashSet<>();
        if(str == "") {
            permutations.add("");
            return permutations;
        }
        String remainingStr = str.substring(1);
        HashSet<String> words = getPerms(remainingStr);
        for(String word : words) {
            for(int i = 0; i <= word.length(); i++) {
                String s = word.substring(0, i) + str.charAt(0) + word.substring(i);
                permutations.add(s);
            }
        }
        return permutations;
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> permutations = getPerms(str);
        System.out.println(permutations);
    }
}
