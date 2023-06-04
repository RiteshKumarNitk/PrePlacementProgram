import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> answer = findDisjointArrays(nums1, nums2);
        System.out.println(answer);
    }

    public static List<List<Integer>> findDisjointArrays(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        for (int num : nums1) {
            if (!set2.contains(num)) {
                list1.add(num);
            }
        }

        for (int num : nums2) {
            if (!set1.contains(num)) {
                list2.add(num);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(list1);
        answer.add(list2);
        return answer;
    }
}
