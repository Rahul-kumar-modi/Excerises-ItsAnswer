import java.util.Scanner;

public class kthelement {
    public static void print (int[] arr){
        for(int ele: arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
    public static void swap (int []arr, int i, int j){
        int temp =arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
    public static int partition (int [] arr, int low, int high){
        int pivot = arr[low], pivotIdx= low;
        int smallerCount = 0;
        for(int i =low+1; i<=high; i++){
            if(arr[i]<=pivot) smallerCount++;
        }
        int correctIdx = pivotIdx + smallerCount;
        swap(arr,pivotIdx, correctIdx);
        int i=low, j= high;
        while(i<correctIdx && j>correctIdx){
            if(arr[i]<= pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);
            }
        }
        return correctIdx;
    }
    public static void quicksort(int[] arr, int low, int high){
        if(low>=high) return;
        int idx = partition(arr, low, high);

        quicksort(arr, low, idx-1);
        quicksort(arr, idx+1, high);
    }
    public static void main(String[] args) {
        int []arr = {40,9,17,10,21,31,6,25,18};
        int n =arr.length;
        print(arr);
        quicksort(arr, 0,n-1);
        print(arr);

     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the index no. ");
     int k = sc.nextInt();

        int m=arr[n-k];
        System.out.println(k+ "th largest no. is: " +m);

    }
}
