// class Calculator{
//     int a;
//     public int add(int n1, int n2){
//         int r = n1+n2;
//         return r;
//     }
// }


// public class Objects {
//     public static void main(String[] args){
//         int num1 = 4;
//         int num2 = 5;
//         Calculator calc = new Calculator();
//         int result = calc.add(num1, num2);
//         System.out.println(result);
//     }
// }

//Methods (main-start of execution)
// class Computer{
//     public static void playMusic(){
//         System.out.println("Music Playing..");
//     }
//     public String getMeAPen(int cost){
//         if(cost>=10)
//             return "Pen";
//         return "Nothing";
//     }
//     }

// public class Demo{
//     public static void main(String[] agrs){
//         Computer com = new Computer();
//         com.playMusic();
//         String str = com.getMeAPen(2);
//         System.out.println(str);
//     }
// }

//Overloading
// class Calculator{
//     public int add(int n1, int n2){
//         return n1+n2;
//     }
//     public int add(int n1, int n2, int n3){
//         return n1+n2+n3;
//     }
//     public double add(double n1, double n2){
//         return n1+n2;
//     }
// }
// public class Demo{
//     public static void main(String[] args){
//         Calculator obj = new Calculator();
//         int r1 = obj.add(0.37,0.54);
//         System.out.println(r1);
//     }
// }

//Stack and Heap
// class Calculator{
//     int num = 5;//intense variable
//     public int add(int n1, int n2){
        
//         return n1+n2;
        
//     }
// } 
// public class Demo{
//     int data = 10;
//     public static void main(String[] args){
//         Calculator obj = new Calculator();
//         Calculator obj1 = new Calculator();
//         int r1 = obj.add(5,4);
//         System.out.println(obj1.num);
//     }
// }

//Array
public class Demo{
    public static void main(String[] args){
        int num[] = new int[4];
        // System.out.println(num[0]);//Dynamic
        num[0] = 3;
        System.out.println(num[0]);//Update new value
        for(int i=0;i<4;i++){
            System.out.print(num[i]+" ");
        }
        }
}

//Multi-Dimensional Array
public class Demo{
    public static void main(String[] args)
    {
        int nums[][] = new int[3][4];
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
             nums[i][j] = (int)(Math.random() * 10);
            }
        }
        for(int i=0;i<3;i++)
            {
            for(int j=0;j<4;j++)
                {
                System.out.print(nums[i][j] + " ");
                }
                System.out.println();
    }
}
}

//Jagged and 3D Array
public class Demo{  //jagged
    public static void main(String[] args) {
        int num [][] = new int[3][];
        num[0] = new int[3];//specifiy no.of columns
        num[1] = new int[4];
        num[2] = new int[5];

        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[i].length;j++)
            {
                num [i][j] = (int)(Math.random() * 10);
            }
        }

        for(int n[]:num)
        {
            for(int m:n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}

public class Demo {

    public static void main(String[] args) {
        int num [][][] = new int[3][4][5];

        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[i].length;j++)
            {
                for(int k=0;k<num[i][j].length;k++)
                {
                num[i][j] = (int)(Math.random() * 10);
                }
            }

        }
        for(int n[] : num)
        {
            for(int m:n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}

//Array of Objects

class Student{
    int rollno;
    String name;
    int marks;

}
public class Demo{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Leo";
        s1.marks = 56;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "john";
        s2.marks = 96;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "vic";
        s3.marks = 76;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].name + ":" + students[i].marks);
        }
    }
}

