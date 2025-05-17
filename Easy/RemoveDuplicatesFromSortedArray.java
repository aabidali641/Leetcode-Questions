class RemoveDuplicatesFromSortedArray {
    public int removeDuplicate(int [] nums){
        if (nums.length == 0) return 0;

        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[count - 1]){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Input must be sorted for this logic to work correctly
        int nums[] = {1, 2, 2, 3, 3, 4};

        RemoveDuplicatesFromSortedArray rmd = new RemoveDuplicatesFromSortedArray();
        int newLength = rmd.removeDuplicate(nums);

        System.out.print("Array after Removing Duplicates: [");
        for(int i = 0; i < newLength; i++){
            System.out.print(nums[i]);
            if(i < newLength - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
