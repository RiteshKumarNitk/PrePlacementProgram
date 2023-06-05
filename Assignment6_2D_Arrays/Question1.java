package Assignment6_2D_Arrays;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
    public static int[] findPermutation(String s) {
        int n = s.length() + 1;
        int[] perm = new int[n];

        for (int i = 0; i < n; i++) {
            perm[i] = i + 1;
        }

        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'D') {
                indices.add(i);
            }
        }

        indices.add(n - 1);

        for (int i = 0; i < indices.size(); i++) {
            int start = i == 0 ? 0 : indices.get(i - 1) + 1;
            int end = indices.get(i);
            reverse(perm, start, end);
        }

        return perm;
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String s = "IDID";
        int[] perm = findPermutation(s);
        System.out.print("Reconstructed Permutation: ");
        for (int num : perm) {
            System.out.print(num + " ");
        }
    }
}
