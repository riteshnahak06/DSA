package src.main.java.com.dsa.arrays.hackersrank;
import java.util.ArrayList;
import java.util.List;

public class P01FirstAndLastPositionOfSortedArrayAsList {
    public static void main(String[] args) {
        List<Integer> arr = List.of(5, 7, 7, 8, 8, 10);
        int target = 8;

        List<Integer> result = searchElement(arr, target);
        System.out.println(result);
    }

    public static List<Integer> searchElement(List<Integer> arr, int target) {
        List<Integer> ans = new ArrayList<>();
        ans.add(findFirstPosition(arr, target));
        ans.add(findLastPosition(arr, target));
        return ans;
    }

    private static int findFirstPosition(List<Integer> arr, int target) {
        int start = 0, end = arr.size() - 1;
        int position = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) == target) {
                position = mid;
                end = mid - 1; // search before mid as we need to check first index
            } else if (arr.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return position;
    }

    private static int findLastPosition(List<Integer> arr, int target) {
        int start = 0, end = arr.size() - 1;
        int position = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) == target) {
                position = mid;
                start = mid + 1;  // search after mid as we need to check last index
            } else if (arr.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return position;
    }
}
