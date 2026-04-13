class Solution {
    public int[] productExceptSelf(int[] nums) {
        // TODO: Write your solution here
        int zeros = 0;
        int product = 1;
        int[] res = new int[nums.length];
        int zeroIndex =-1;
        int index1 =0;
        for (int i : nums) {
           if(i==0){
            zeros++;
            zeroIndex=index1;
           }
           else
            product= product*i;
        index1++;
        if(zeros>1)
            return res;

        }
        int index =0;
        if(zeroIndex!=-1){
            res[zeroIndex] =product;
        }
        else{
        for (int i : nums) {
            res[index] =product/i;
            index++;
        }
    }
        return res;

    }
}  
