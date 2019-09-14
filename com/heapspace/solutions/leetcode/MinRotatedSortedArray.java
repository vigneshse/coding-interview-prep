class MinRotatedSortedArray {
    public int findMin(int[] nums) {
        
         if (nums.length == 0)
            return -1;
         if (nums.length == 1)
             return nums[0];
        
         int pivot = searchPivot(nums);
        
         if (pivot < 0) {
            return nums[0];
         }
        else{
            return nums[pivot];
        }
    }
    
      private int searchPivot(int[] nums) {

        int begin = 0, end = nums.length - 1, mid;

        if (nums[begin] < nums[end])
            return 0;

        while (begin <= end) {
            mid = (begin + end) / 2;

            if (nums[mid] > nums[mid + 1]) {

                return mid + 1;
            } else {

                if (nums[mid] < nums[begin]) {
                    end = mid - 1;
                } else {
                    begin = mid + 1;
                }
            }
        }
        return -1;
    }
}
