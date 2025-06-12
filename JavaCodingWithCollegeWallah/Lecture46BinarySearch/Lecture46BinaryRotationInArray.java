package JavaCodingWithCollegeWallah.Lecture46BinarySearch;

public class Lecture46BinaryRotationInArray {

    static int search(int []arr,int target){
        int st=0;
        int end= arr.length-1;
      while(st<end){
          int mid=st+(end-st)/2;
          if(arr[mid]==target){
              return mid;
          }
          else if(arr[mid]<arr[end]){
              if(target>arr[mid]&&target<=arr[end]){
                  st=mid+1;
              }
              else{
                  end=mid-1;
              }

          }
          else{//st to mid is sorted
              if(target>=arr[st]&&target<=arr[mid]){
                  end=mid-1;
              }
              else{
                 st=mid+1;
              }
          }
      }
return -1;
    }

    public static void main(String[] args) {
        int[]arr={12,13,14,15,8,9,10,11};
        //To find the index of target element in rotated array

        System.out.println("Target element is found at index: "+search(arr,9));
    }
}

