import java.util.*;

public class Fristuniq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int index = -1;

        int[] count = new int[26];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }

        // Find first unique
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z' && count[ch - 'a'] == 1) {
                index = i;
                break;
            }
        }

        System.out.println(index);

        if (index != -1) {
            System.out.println(s.charAt(index));
        } else {
            System.out.println("No unique character");
        }
    }
}