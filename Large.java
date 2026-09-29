import java.io.*;
import java.util.*;
public class Large{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // if(a>b){
        //     System.out.println("A is Large");
        // }
        // else{
        //     System.out.println("B is Large");
        // }
        System.out.println(a>b?"A is Large":"B is Large");
    }
}
