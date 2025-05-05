package Solutions;

public class maxSubArray {
    public int maxSubArray(int[] nums) {
        int csum=nums[0];//-2
        int msum=nums[0];//-2
        if(csum<0){
            csum=0;
        }
        for(int i=1;i<nums.length;i++){
            csum=nums[i]+csum;//1-2=-1
            msum=Math.max(csum,msum);
            System.out.println(msum);
            if(csum<0){
                csum=0;
            }
        }
        return msum;
    }
    public static void main(String[] args){
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray solution=new maxSubArray();
        int result=solution.maxSubArray(arr);
        System.out.println(result);
    }
    
}
