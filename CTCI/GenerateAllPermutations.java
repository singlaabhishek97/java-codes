import java.util.ArrayList;

public class GenerateAllPermutations {
    // Assuming all characters are distinct otherwise we will get repeated strings using this method
    public static ArrayList<String> getPerms(String str) {
        if(str == null) {
            return null;
        }
        ArrayList<String> permutations = new ArrayList<>();
        if(str == "") {
            permutations.add("");
            return permutations;
        }
        String remainingStr = str.substring(1);
        ArrayList<String> words = getPerms(remainingStr);
        for(String word : words) {
            for(int i = 0; i <= word.length(); i++) {
                String s = word.substring(0, i) + str.charAt(0) + word.substring(i);
                permutations.add(s);
            }
        }
        return permutations;
    }
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> permutations = getPerms(str); //For distinct characters only
        System.out.println(permutations);
    }
}
