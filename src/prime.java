class sol{
    public boolean isPrime(int a){
        int cnt = 0;
        for(int i = 1; i <= a; i++){
            if(a%i == 0){
                cnt++;
            }
        }
        return cnt > 2;
    }
}

public class prime {
    public static void main (String[] args){
        sol ob1 = new sol();
        System.out.println(ob1.isPrime(3));
    }
}
