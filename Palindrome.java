import java.io.*;
import java.util.*;
public class Palindrome{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev =0, n1=n;
        while(n!=0){
            int r=n%10;
            rev = rev*10+r;
            n=n/10;
        }
        System.out.println(n1==rev?"Palindrome":"Not Palindrome");
    }
}