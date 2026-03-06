//import java.lang.classfile.constantpool.IntegerEntry;
import java.util.*;
class solutions{
    public int largestNum(int[] arr){
        int max = arr[0];
        for(int i = 0;i < arr.length; i++){
            if(arr[i]>= max)
                max = arr[i];
        }
        return max;
    }

    public void secondLargest(int [] arr){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for(int i = 0; i< arr.length;i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }

        for(int j =0;j< arr.length; j++){
            if(arr[j]>secMax && arr[j]!=max){
                secMax = arr[j];
            }

            if (arr[j]<secMin && arr[j]!= secMin){
                secMin = arr[j];
            }
        }
        System.out.println("Largest Num:"+max+"Second larget" + secMax +"Minimum"+ min + "Second min" + secMin);
    }
}


public class sorting_prblm {
    public static void main(String[] args){
        solutions obj = new solutions();
        int arr[] = {15,24,1,2,4,2,30};
        int result = obj.largestNum(arr);
        obj.secondLargest(arr);
//        System.out.print(result);
    }
}
