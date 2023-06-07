package AssignmentSeven;
public class Question4 {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word);
            sb.append(reversed.reverse()).append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        String result = reverseWords(s);
        System.out.println(result); // Output: "s'teL ekat edoCteeL tsetnoc"
    }
}
