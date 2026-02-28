public class palindrome_num {
    public void palindrome(int n){
        int org = n;
        int rev = 0;

        while(n>0){
            int ld = n % 10;

            rev = rev * 10 + ld;

            n = n /10;
        }
        if (rev == org ){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}

class solution2{
    public static void main(String [] args){
        palindrome_num obj = new palindrome_num();
        obj.palindrome(1000);
        obj.palindrome(1111);
    }
}
