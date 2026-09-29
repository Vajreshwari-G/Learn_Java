import java.io.*;
import java.util.*;
public class Max{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
        }   
        }
        System.out.println("Maximum Element:"+ max);
    }
}