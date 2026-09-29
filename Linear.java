import java.io.*;
import java.util.*;
public class Linear{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        } 
        int k = sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i] == k){
                System.out.println("Element Found at:"+(i+1));
                return;
            }
        } 
        System.out.println("Element Not Found");
    }
}