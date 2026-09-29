import java.io.*;
import java.util.*;
public class Amstrong{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int n1=n, n2=n;
        while(n!=0){
            n=n/10;
            count++;
        }
        int sum=0;
        while(n1!=0){
            int r=n1%10;
            sum += Math.pow(r, count);
            n1=n1/10;
        }
        System.out.println(n2==sum?"Amstrong":"Not Amstrong");
    }
}