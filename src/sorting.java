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
}

public class sorting {
    public static void main(String[] args){
        int [] arr = {1,8,3,4,5};
        sorts obj = new sorts();
        obj.bubbleSor(arr);

    }
}
