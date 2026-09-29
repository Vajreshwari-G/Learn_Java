import java.io.*;
import java.util.*;
public class Great{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && b>c){
            System.out.println("A is Great");
        }
        else if(b>c){
            System.out.println("B is Greater");
        }
        else{
            System.out.println("C is Greater");
        }
    }
}