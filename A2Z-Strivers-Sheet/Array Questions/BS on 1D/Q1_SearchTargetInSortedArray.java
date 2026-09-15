public class Q1_SearchTargetInSortedArray{
    public static int findTarget(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while (start<=end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int result = findTarget(nums, target);
        if (result == -1) {
            System.out.println("The target is not found");
        }else{
            System.out.println("The target at index : " + result);
        }
    }
}