class SortingExamples {
    public static void main(String[] args) {
        int[]nums = {4, 0, 1, 2};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i]  = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                i++;
            }
        }
        for(int ind = 0 ; ind < nums.length ; ind++){
            if(nums[ind] != ind){
                return ind;
            }
        }
        return nums.length;
    }
}