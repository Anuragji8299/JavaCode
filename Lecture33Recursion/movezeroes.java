package Lecture33Recursion;

public class movezeroes {


        public static void moveZeroes(int[] nums) {
            for(int i=0;i<nums.length-1;i++){
                int temp=i;
                if(nums[i]==0){
                    while(temp<nums.length-1-i)
                        nums[temp]=nums[temp+1];
                    nums[temp+1]=0;
                    temp++;
                }
            }
        }
        public static void print(int []arr){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }

        }
    public static void main(String[] args) {
        int [] nums={0,1,0,3,12};

        moveZeroes(nums);

        print(nums);
    }
    }

