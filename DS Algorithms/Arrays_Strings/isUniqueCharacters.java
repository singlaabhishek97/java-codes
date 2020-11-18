import java.util.Scanner;
class isUniqueCharacters {
    static boolean isUniqueChars(String str) {
        //checker is a bit vector which can be used for 32 bits (size of int)
        //it works for strings having only 26 lowercase alphabet, otherwise use boolean array of size 128 (for ASCII)
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) != 0) {
                return false;
            }
            checker = checker | (1 << val);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Input string should be only having all lowercase alphabet only, not any other characters
        String str = sc.nextLine();
        System.out.println(isUniqueChars(str));
    }
}