import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question2 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        List<List<Integer>> result = findDistinctElements(nums1, nums2);
        for (List<Integer> list : result) {
            for (int element : list) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> findDistinctElements(int[] nums1, int[] nums2) {
        List<Integer> distinct1 = new ArrayList<>();
        List<Integer> distinct2 = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                distinct2.add(num);
            }
        }

        distinct1.addAll(set);

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(distinct1);
        answer.add(distinct2);

        return answer;
    }
}
