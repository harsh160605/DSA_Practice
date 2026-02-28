//recursion print name
class recur{
    public void tryrecur(int N,int n, String a){
//        n = 0;
        if (n == N){
            return;
        }
        System.out.println(a);
        tryrecur(N,n +1,a);
    }

//    recursion print n number
public void recr2(int N,int target){
        if(N > target){
            return;
        }
        System.out.print(N+" ");
        recr2(N+1,target);
    }

//    Recursion print numbers in revrese till n
    public void revRec(int N,int target){
        if(N < target){
            return;
        }
        System.out.print(N+" ");
        revRec(N-1,target);
    }

//    Rercursion print sum

    public int sum(int a){
//        int sum = 0;
        if(a == 1){
//            System.out.println(sum);
            return 1;
        }
        return a = a + sum(a-1);

    }

//    Recursion Factorial
    public int factorial(int n){
        if(n == 0){
            return 1;
        }

        return n = n* factorial(n-1);

    }

//    recursion reverse array
public void reverseArray(int[] arr) {

    int p1 = 0;
    int p2 = arr.length - 1;

    while (p1 < p2) {

        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;

        p1++;

        p2--;
    }
}

//palindrome
public boolean palindrome(int i, String s) {
    if (i >= s.length() / 2) return true;
    if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
    return palindrome(i + 1, s);
}
}







public class recursion {
    public static void main(String [] args){
        recur obj = new recur();
//        obj.tryrecur(5,0,"harsh");
//        obj.recr2(8,10);
//        obj.revRec(8,1);
//        System.out.println(obj.sum(8));
//        System.out.println(obj.factorial(0));

//        int a[] = {4,3,2,1};
//        obj.reverseArray(a);
//        for(int num: a){
//            System.out.print(num);
//        }
        obj.palindrome(0,"ABB");
    }

}
