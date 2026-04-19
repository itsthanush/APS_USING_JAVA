import java.util.HashMap;
import java.util.HashSet;

public class HappyNum {
    public static int numsqrsum(int num){
        int SumOfSqrs=0;
        while(num!=0){
            int digit=num%10;
            SumOfSqrs+=digit*digit;
            num=num/10;
        }
        return SumOfSqrs;
    }


    public static boolean isHappyNum(int n){
        HashSet<Integer> st=new HashSet<>();

        while(true){
            n=numsqrsum(n);
            if(n==1)
                return true;
            if(st.contains(n))
                return false;
            st.add(n);
        }
    }


    public static void main(String[] args) {
        int num=19;
        System.out.println(isHappyNum(num));
    }
}
