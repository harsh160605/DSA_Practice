class concepts{
    public void rightShift(int[] arr,int k){
        int[] temp = new int[arr.length];
        int n =arr.length;
        k = k % n;

//        copy last k elements which want to move to the first
        for(int i = n - k;i<=n;i++){
            temp[i] = arr[i];
        }
        for(int i = n-k-1;i>=0;i--){
//            here +K is used just becoz we want to move towards right i.e we need to shift by k steps so acutal position is i + no of steps we want to move from i
            arr[i + k] = arr[i];

        }

    }

    public void leftShift(int[] arr,int k){
        int[] temp = new int[arr.length];
        int n =arr.length;
        k = k % n;
        //        copy first k elements which want to move to the first
        for(int i = 0;i<k;i++){
            temp[i] = arr[i];
            //            here -K is used just becoz we want to move towards left i.e we need to shift by k steps so acutal position is i - no of steps we want to move from i

            for(int j = k;j<=n;j++){
            arr[j-k] = arr[j];
        }

//            add first temp elemt stored in last from actual arr length - how much steps + i
        for(int l = 0; l < k;l++){
            arr[n-k+i] =temp[i];
        }
    }
}

public class dsa_concepts {
}
