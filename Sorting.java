public class Sorting {
    public static void main(String[] args) {
        int[] nums = {2,7,4,9,10,1};
        bubbleSort(nums);
    }
    private static void bubbleSort(int[] nums){
        // using bubble sort and make it to ascending order (from lowest to highest)
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        // display the result
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
