package Lecture33Recursion;

public class linearSearch {

    public static boolean search(int[] arr, int idx, int target) {
        //base work
        if (idx == arr.length) return false;

        //self work
        if (arr[idx] == target) {
            return true;
        }
        //recursive work
        if (search(arr, idx + 1, target)) {
            return true;
        }
return false;

    }

    public static void main(String[] args) {
        int[] arr = {4, 12, 54, 14, 3, 8, 6, 1};

        if (search(arr, 0, 13)) {
            System.out.println("Yes! Target is present");
        } else {
            System.out.println("No! Target is not present");
        }
    }

}

