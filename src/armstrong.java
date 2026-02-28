import java.util.*;
class arm{
    public Boolean armstrong(int a){
        int temp = a;
        double sum = 0;
        int l = String.valueOf(a).length();
//        System.out.println("Length is"+l);

        while(a>0){
            int ld = a % 10;
//            System.out.println("Last Digit"+ ld);
            sum = sum + Math.pow(ld,l);
//            System.out.println("Sum is" + sum);
            a = a /10;
//            System.out.println("Remain number" + a);
        }
//        System.out.println(sum);
        return sum == temp;

    }
}
public class armstrong {
    public static void main(String[] args){
        arm obj = new arm();
        System.out.println(obj.armstrong(12));
    }
}
