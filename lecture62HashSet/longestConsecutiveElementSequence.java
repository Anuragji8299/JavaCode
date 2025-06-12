package lecture62HashSet;

import java.util.HashSet;

public class longestConsecutiveElementSequence {

    public static int longestConsecutive(int[] nums) {
        // 100 101 1 2 3 4 88;
        HashSet<Integer> s=new HashSet<>();
        for(int num: nums){
            s.add(num);
        }
        int max=0;
        for(int num: s){
            if(!s.contains(num-1)){
                //num is starting point
                int currStreak=1;
                int currNum=num;
                while(s.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                max=Math.max(max,currStreak);
            }
        }
 return max;
    }
        public static void main (String[]args){
int [] arr={100,101,1,2,3,4,88};
            System.out.println("Length of longest consecutive sequence is: "+longestConsecutive(arr));
        }
    }
