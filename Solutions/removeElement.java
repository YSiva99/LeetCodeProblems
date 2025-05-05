package Solutions;

public class removeElement {
    public int removeElement1(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
       return i; 
    }
      public static void main(String[] args) {
        removeElement solution = new removeElement();

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int k = solution.removeElement1(nums, val);

        System.out.println("k = " + k);
        System.out.print("Updated nums = ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
