class SecondlargestInArray {

    public static int FindSecondLargest(int nums[]) {
        int largest = nums[0];
        int secondLargest = -1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
                
            } else if (nums[i] > secondLargest && nums[i] != largest ){
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int nums[] = {1,0,12,25,19, 40, 18, 35};
        System.out.println("the second largest number is " + FindSecondLargest(nums));
    }
}