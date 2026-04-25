import java.util.Arrays;
public class SortString {
    public static void main(String[] args) {
        String s = "dcba";

        // Step 1: convert string to char array
        char[] ch = s.toCharArray();

        // Step 2: sort the array
        Arrays.sort(ch);

        // Step 3: convert back to string
        String sorted = new String(ch);

        System.out.println(sorted);
    }
}