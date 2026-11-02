class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int n = numbers.length;
        int i=0, j=n-1;
        while(i<j){
            int temp = numbers[i]+numbers[j];
            if(temp==target){
                return new int[] {i+1,j+1};
            }
            else if(temp<target) i++;
            else j--;
        }
        return new int[2];
    }
}