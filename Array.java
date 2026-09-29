import java.util.Scanner;
public class Array{
    public static void main (String []args){
    //    Array arr = new Array([System.in]);
    //     int sum = 0;
    //     for(int i=0;i<arr.length;i++){
    //         sum = sum + arr[i];

    // }
    // System.out.println(sum);

    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            if(i==j|j==5|i==5)
            System.out.print("*");
        }
        System.out.println();
    }
}
        
}
