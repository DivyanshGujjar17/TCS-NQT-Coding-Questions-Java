public class Search {
    public void searching(int[] nums, int key) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1; // -1 indicates not found

        while (left <= right) {
            int mid = left + (right - left) / 2; // Correct mid calculation

            if (nums[mid] == key) {
                result = mid;
                break;
            } else if (nums[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        Search se = new Search();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        se.searching(nums, 6); // Output: 5
    }
}
