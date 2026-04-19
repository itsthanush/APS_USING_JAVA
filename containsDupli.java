import java.util.*;
public class containsDupli {
    public static boolean containingDuplicate(int[] nums){
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(st.contains(nums[i])){
                return true;
            }
            else{
                st.add(nums[i]);
            }
        }
        return false;

    }
    public static void main(String[] args) {
        //int[] nums={1,2,4,5,6,7,2,1,3};
        int[] nums={1,2,3,4,5};
        System.out.print(containingDuplicate(nums));

    }
}
