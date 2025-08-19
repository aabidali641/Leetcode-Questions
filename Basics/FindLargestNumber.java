public class FindLargestNumber{
    public int getLargest(int nums []){
        if(nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int largest = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        FindLargestNumber finder = new FindLargestNumber();
        int[] numbers = {3, 5, 7, 2, 8, -1, 4};
        int largest = finder.getLargest(numbers);
        System.out.println("The largest number is: " + largest);
    }
}