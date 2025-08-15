
class GCDofSmallestAndLargest {
    public int findGCD(int[] nums) {
       int smallest = nums[0]; 
       int largest = nums[nums.length - 1];
       for(int num : nums){
        if(num < smallest){
            smallest = num;
        }
        if(num > largest){
            largest = num;
        }
       } 
       while(largest != 0){
        int temp = largest;
        largest = smallest % largest;
        smallest = temp;
       }
       return smallest;
    }
    public static void main(String[] args) {
        GCDofSmallestAndLargest gcdCalculator = new GCDofSmallestAndLargest();
        int[] nums = {12, 15, 9, 21, 30}; // Example input
        int gcd = gcdCalculator.findGCD(nums);
        System.out.println("GCD of smallest and largest numbers is: " + gcd);
    }
}