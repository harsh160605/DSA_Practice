public class count_lenth {
    public int count(int n){
        int cnt = 0;

        while(n>0){
            cnt= cnt +1;

            n = n/10;
        }
        return cnt;
    }
}

class solution1{
    public static void main(String [] args){
        count_lenth obj = new count_lenth();
        System.out.println("Length Of number is " + obj.count(00000));
    }
}
