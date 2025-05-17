class RemoveDuplicatesFromSortedArrayII {
    public int rmdii( int nums[]){
        if(nums.length <= 2){
            return nums.length;
        }
        int count = 2;
        for(int i=2; i<nums.length; i++){
            if(nums[i] != nums[count-2]){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,2,2,4,4};
        System.out.print("The Array after remove duplicates while keeping occurance at most two : [ ");
        RemoveDuplicatesFromSortedArrayII rmdiiObj = new RemoveDuplicatesFromSortedArrayII();
        int newLength = rmdiiObj.rmdii(nums);
        for(int i=0; i<newLength; i++){
            System.out.print(nums[i]);
            if(i < newLength-1){
                System.out.print(" , ");
            }
        }
        System.out.print(" ]");
    }
}