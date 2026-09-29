import java.io.*;
import java.util.*;
public class Odd{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        System.out.println("Enter "+ n +" Elements");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2 == 0){
                System.out.println("Even Numbers:"+ arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2 != 0){
                System.out.println("Odd Numbers:"+ arr[i]);
            }
        }
    }
}