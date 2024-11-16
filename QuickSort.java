import java.util.*;

public class QuickSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the numbers: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,arr.length-1);
        printarr(arr);
    }
    public static void printarr(int arr[]){
        System.out.print("Sorted array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int pivot = partitionElement(arr,si,ei);
        quickSort(arr, si, pivot-1);
        quickSort(arr, pivot+1, ei);
    }
    public static int partitionElement(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
}
