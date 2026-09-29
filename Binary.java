import java.io.*;
import java.util.*;
public class Binary{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int l=0,h=n-1;
        while(l<=h){
           int m = l+h/2;
           if(k == a[n]){
            System.out.println("Element Found");
            return;
           }
           else if(k > a[n]){
                l = m+1;
           }
           else{
            h = m-1;
           }
        }
        System.out.println("Element Not Found");
    }
}