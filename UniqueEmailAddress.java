import java.util.*;

public class UniqueEmailAddress {

    public static int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for (String email : emails) {
            StringBuilder address = new StringBuilder();
            for (int i = 0; i < email.length(); i++) {
                char c = email.charAt(i);
                if (c == '.') {
                    continue;
                } else if (c == '+') {
                    while (email.charAt(i) != '@') {
                        i++;
                    }
                    address.append(email.substring(i + 1));

                } else {
                    address.append(c);
                }
            }
            set.add(address.toString());
        }
        System.out.println(set);
        return set.size();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] emails = { "test.email+alex@leet.code.com", "test.email@leetcode.com" };
        System.out.println(numUniqueEmails(emails));
    }
}
