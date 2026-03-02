public class sorting {
    public static void main(String[] args){
        int [] arr = {1,8,3,4,5};
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
}
