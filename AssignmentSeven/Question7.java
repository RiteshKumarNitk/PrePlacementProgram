package AssignmentSeven;
public class Question7 {
    public static boolean backspaceCompare(String s, String t) {
        String processedS = processString(s);
        String processedT = processString(t);

        return processedS.equals(processedT);
    }

    private static String processString(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";

        boolean result = backspaceCompare(s, t);
        System.out.println(result); // Output: true
    }
}
