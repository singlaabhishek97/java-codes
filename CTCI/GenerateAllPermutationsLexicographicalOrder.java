import java.util.SortedSet;
import java.util.TreeSet;

public class GenerateAllPermutationsLexicographicalOrder {
    // Strings will be automatically sorted when using SortedSet
    public static SortedSet<String> getPerms(String str) {
        if(str == null) {
            return null;
        }
        SortedSet<String> permutations = new TreeSet<>();
        if(str == "") {
            permutations.add("");
            return permutations;
        }
        String remainingStr = str.substring(1);
        SortedSet<String> words = getPerms(remainingStr);
        for(String word : words) {
            for(int i = 0; i <= word.length(); i++) {
                String s = word.substring(0, i) + str.charAt(0) + word.substring(i);
                permutations.add(s);
            }
        }
        return permutations;
    }
    public static void main(String[] args) {
        String str = "abca";
        SortedSet<String> permutations = getPerms(str);
        System.out.println(permutations);
    }
}
