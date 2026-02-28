import java.util.*;
class divisor{
    public void gcd(int a){
        ArrayList <Integer> divisors = new ArrayList<Integer>();
//        divisors.add(1);
        for(int i = 1; i<=a;i++){
            if(a%i == 0){
                divisors.add(i);
            }
        }
        System.out.println(divisors);
//        return divisor;
    }

    public void optGCD(int a){
        double c= Math.ceil(Math.sqrt(a));
        ArrayList <Integer> divisor1 = new ArrayList<Integer>();
//        divisors.add(1);
        for(int i = 1; i<=c;i++){
            if(a%i == 0){
                divisor1.add(i);
                if (i != a / i) {
                    divisor1.add(a / i);
                }
            }
        }
        System.out.println(divisor1);
    }
}

public class all_divisor {
    public static void main (String [] args){
        divisor obj = new divisor();
        obj.optGCD(108);
    }


}
