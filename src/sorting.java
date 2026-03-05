import java.util.*;
class sorts{
    public void SelectionSort(int[] arr){
        int a = arr.length;
        for(int i = 0;i<=a-1; i++){
            int temp = i;
            for(int j=i+1;j<a;j++){

                if(arr[j]<arr[temp]){
                    temp = j;
                }
            }
            int min = arr[temp];
            arr[temp] = arr[i];
            arr[i] = min;
        }

        for (int num: arr){
            System.out.println(num);
        }
    }

    public void bubbleSor(int[] arr){
        int n= arr.length;
        for(int i = n-1;i>=0;i--){
            for(int j = 0; j<= i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] =arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i <= n-1; i++){
            for(int j = 0; j<= n-1; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    }


    public void merge(int[] arr, int low, int mid, int high) {

        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;


        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right])
                temp.add(arr[left++]);
            else
                temp.add(arr[right++]);
        }


        while (left <= mid)
            temp.add(arr[left++]);


        while (right <= high)
            temp.add(arr[right++]);

        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);
    }

    public void mergeSort(int[] arr,int low,int high ){
        if(low>=high)
            return;

        int mid = (low + high)/2;

        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr, low, mid, high);

    }


    public void recBubbleSort(int[] arr, int n){
        boolean swapped = false;
        if(n==1 || swapped)

            return;
        for(int i =0;i<= n -2; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1] = temp;
                swapped = true;
            }
        }

        recBubbleSort(arr,n-1);
    }


    public void quickSort(int[] arr, int low,int high){
        if (low < high) {
            // Find pivot index
            int pivotIndex = partition(arr, low, high);

            // Sort left subarray
            quickSort(arr, low, pivotIndex - 1);

            // Sort right subarray
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high){
        int pivot = arr[high];

        int i = low-1;

        for(int j = low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return pivot index
        return i + 1;
    }
}



public class sorting {
    public static void main(String[] args){
        int [] arr = {1,8,3,4,5};
        sorts obj = new sorts();
//        obj.bubbleSor(arr);
        int n = arr.length;
        obj.recBubbleSort(arr, arr.length );
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

    }
}





