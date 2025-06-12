package lecture35Recursion;

public class printAllSubarray {

    public static void print(int []arr,int subsetSum,int idx){

        if(idx==arr.length){
            System.out.println(subsetSum);
            return;
        }
        //{1,2}
        //{0,1,2,3}
     int currAns=arr[idx];
     print(arr,subsetSum+currAns,idx+1);
        print(arr,subsetSum,idx+1);
    }

    public static void main(String[] args) {
int [] arr={1,2,3};
print(arr,0,0);
    }
}
