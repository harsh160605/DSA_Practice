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
}



public class sorting {
    public static void main(String[] args){
        int [] arr = {1,8,3,4,5};
        sorts obj = new sorts();
//        obj.bubbleSor(arr);
        obj.mergeSort(arr, 0, arr.length - 1);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

    }
}





