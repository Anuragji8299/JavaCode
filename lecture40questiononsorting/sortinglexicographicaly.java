package lecture40questiononsorting;

public class sortinglexicographicaly {

    static void sortFruits(String arr[]){
 int n=arr.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j].compareTo(arr[min])<0){
                    min=j;
                }
            }
            String temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

    }

    static void print(String arr[]){
        for(String i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        String fruits[]={"papaya","lime","watermelon","apple","mango","kiwi"};

        sortFruits(fruits);
        print(fruits);

    }
}
