public class Majority_Ele {
    public static int majorityElement(int[] nums) {

        int count=0;
        int candidate=0;

        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
            }
            if(candidate==nums[i]){
                count++;
            }
            else{
                count--;
            }
            
        }
        return candidate;
    }

    public static void main(String args[]){
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
