package lecture62HashSet;

import java.util.HashSet;

public class maxNumbers {

    public static int maxNumbersOnTable(int [] nums){
        // 1,1,2,3,4,3,2,4;
        HashSet<Integer> table=new HashSet<>();
//        for(int num:nums){
//            st.add(num);
//        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(table.contains(nums[i])){
                table.remove(nums[i]);
            }
            else{
                table.add(nums[i]);
                max=Math.max(max,table.size());
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] nums={1,1,2,3,4,3,2,4};

        System.out.println("Maximum numbers on a table at a time is: "+maxNumbersOnTable(nums));
    }
}
