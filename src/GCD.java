import java.util.*;

//bruteforce
class bruteGCD{
    public int gcd(int a, int b){
        int divisor = 1;
        for(int i = 1; i<=Math.min(a,b);i++){
            if(a%i == 0 && b%i==0){
                divisor= i;
            }
        }
        return divisor;
    }
}

//better
class betterGCD{
    public int gcd(int a, int b){
        int divisor = 1;
        for(int i =Math.min(a,b); i>0;i--){
            if(a%i == 0 && b % i == 0){
                divisor = i;
                break;
            }
        }
        return divisor;
    }
}

//Optimal
class optimalGCD{
    public int gcd(int a, int b){
        if(a>b){
            a = a% b;
        }else{
            b = b%a;
        }

        if(a==0){
            return a;
        }else{
            return b;
        }
    }
}
public class GCD {
    public static void main (String[] args){
        bruteGCD obj = new bruteGCD();
        System.out.println("By bruteforce GCD is "+obj.gcd(9,12));

        betterGCD obj1 = new betterGCD();
        System.out.println("By Better GCD is "+obj1.gcd(9,12));

        optimalGCD obj2 = new optimalGCD();
        System.out.println("By Optimal GCD is "+obj2.gcd(9,12));
    }
}
