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
// public class Demo{
//     public static void main(String[] args){
//         int num[] = new int[4];
//         // System.out.println(num[0]);//Dynamic
//         num[0] = 3;
//         System.out.println(num[0]);//Update new value
//         for(int i=0;i<4;i++){
//             System.out.print(num[i]+" ");
//         }
//         }
// }

// //Multi-Dimensional Array
// public class Demo{
//     public static void main(String[] args)
//     {
//         int nums[][] = new int[3][4];
        
//         for(int i=0;i<3;i++)
//         {
//             for(int j=0;j<4;j++)
//             {
//              nums[i][j] = (int)(Math.random() * 10);
//             }
//         }
//         for(int i=0;i<3;i++)
//             {
//             for(int j=0;j<4;j++)
//                 {
//                 System.out.print(nums[i][j] + " ");
//                 }
//                 System.out.println();
//     }
// }
// }

// //Jagged and 3D Array
// public class Demo{  //jagged
//     public static void main(String[] args) {
//         int num [][] = new int[3][];
//         num[0] = new int[3];//specifiy no.of columns
//         num[1] = new int[4];
//         num[2] = new int[5];

//         for(int i=0;i<num.length;i++)
//         {
//             for(int j=0;j<num[i].length;j++)
//             {
//                 num [i][j] = (int)(Math.random() * 10);
//             }
//         }

//         for(int n[]:num)
//         {
//             for(int m:n)
//             {
//                 System.out.print(m + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Demo {

//     public static void main(String[] args) {
//         int num [][][] = new int[3][4][5];

//         for(int i=0;i<num.length;i++)
//         {
//             for(int j=0;j<num[i].length;j++)
//             {
//                 for(int k=0;k<num[i][j].length;k++)
//                 {
//                 num[i][j] = (int)(Math.random() * 10);
//                 }
//             }

//         }
//         for(int n[] : num)
//         {
//             for(int m:n)
//             {
//                 System.out.print(m + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// //Array of Objects

// class Student{
//     int rollno;
//     String name;
//     int marks;

// }
// public class Demo{
//     public static void main(String[] args){
//         Student s1 = new Student();
//         s1.rollno = 1;
//         s1.name = "Leo";
//         s1.marks = 56;

//         Student s2 = new Student();
//         s2.rollno = 2;
//         s2.name = "john";
//         s2.marks = 96;

//         Student s3 = new Student();
//         s3.rollno = 3;
//         s3.name = "vic";
//         s3.marks = 76;

//         Student students[] = new Student[3];
//         students[0] = s1;
//         students[1] = s2;
//         students[2] = s3;

//         for(int i=0;i<students.length;i++)
//         {
//             System.out.println(students[i].name + ":" + students[i].marks);
//         }
//     }
// }
//What is String?
// public class Demo{
//     public static void main(String[] args){
//         String name = new String("priya");
//         System.out.println(name);
//         System.out.println("hello "+name);
//         System.out.println(name.charAt(1));
//         System.out.println(name.concat("joy"));
//     }
// }

//Mutable and Immutable String
// public class Demo {
//     public static void main(String[] args) {
//         String name = new String("priya");
//         name = name + " joy";
//         String name1 = "Priya";
//         String name2 = "Priya";

//         System.out.println(name);
//     }
// }

//String Buffer and String Builder
// public class Demo {
//     public static void main(String[] args) {
//         StringBuffer sb = new StringBuffer("Priya");
//         sb.append("Joy");
//         sb.setLength(30);
//         sb.insert(6,"java");
//         System.out.println(sb);
//     }
// }

//Static variable in Java

// class Mobile{
//     String brand;
//     int price;
//     static String name;
// }
//  public void show(){
//    System.out.println(brand + ":" + price + ":" + name);
//}
// public class Demo{
//     public static void main(String[] args){
//         Mobile obj1 = new Mobile();
//         obj1.brand = "Samsung";
//         obj1.price = 17000;
//       Mobile / obj1.name = "Smart Phone";

//         Mobile obj2 = new Mobile();
//         obj2.brand = "Apple";
//         obj2.price = 71000;
//        Mobile / obj2.name = "Smart Phone";

//         obj1.name = "Phone";
           // Mobile.name = "Phone";
//         
//      obj1.show();
//      obj2.show();
//     }
// }

//Static method in java
// class Mobile{
//     String brand;
//     int price;
//     static String name;

//     public void show(){
//         System.out.println(brand + ":" + price + ":" + name);
//     }
//     public static void show1(Mobile obj){
//         System.out.println(obj.brand + ":" + obj.price + ":" + obj.name);
//     }
// }
// public class Demo{
//     public static void main (String[] args){
//         Mobile obj1 = new Mobile();
//         obj1.brand = "Apple";
//         obj1.price = 50000;
//         obj1.name = "SmartPhone";
//         Mobile obj2 = new Mobile();
//         obj2.brand = "Samsung";
//         obj2.price = 17000;
//         obj2.name = "SmartPhone";

//         Mobile.name = "Phone";

//         obj1.show();
//         obj2.show();

//         Mobile.show1(obj2);

//     }
// }

//Static Block in Java

// class Mobile{
//     String brand;
//     int price;
//     static String name;
//     //Constructor
//     public Mobile()
//     {
//         brand = "";
//         price = 200;
//         System.out.println("in constructor");
//     }
//     static
//     {
//         name = "Phone";
//         System.out.println("in static");
//     }
//         public void show(){
//         System.out.println(brand + ":" + price + ":" + name);
//     }
//     public static void show1(Mobile obj){
//         System.out.println(obj.brand + ":" + obj.price + ":" + obj.name);
//     }
// }
// public class Demo{
//     public static void main (String[] args){
//         Mobile obj1 = new Mobile();
//         obj1.brand = "Apple";
//         obj1.price = 50000;
//         obj1.name = "SmartPhone";
//         Mobile obj2 = new Mobile();
//         obj2.brand = "Samsung";
//         obj2.price = 17000;
//         obj2.name = "SmartPhone";

//         Mobile.name = "Phone";

//         obj1.show();
//         obj2.show();

//         Mobile.show1(obj2);

//     }
// }

//Encapsulation
// class Human{
//     private int age;
//     private String name;

//     public int getAge()
//     {
//         return age;
//     }
//     public String getName()
//     {
//         return name;
//     }
//     public void setAge(int a)
//     {
//         age = a;
//     }
//     public void setName(String n)
//     {
//         name = n;
//     }
// }
// public class Demo {
//     public static void main(String[] args)
//     {
//         Human obj = new Human();
//         obj.setAge(11);
//         obj.setName("priya");

//         System.out.println(obj.getAge() + ":" + obj.getName());
//     }
    
// }

//Getters and Setters

//This Keyword in Java

//Constructor
// class Human{
//     private int age;
//     private String name;

//     public Human()//Default Constructor
//     {
//         age = 11;
//         name = "Priya";
//     }

//     public Human(int a, String n)//Parameterised Constructor
//     {
//         age = a;
//         name = n;
//     }
//     public int getAge(){
//         return age;
//     }
//     public void setAge(int age){
//         this.age = age;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setName(String name){
//         this.name = name;
//     }
// }
// public class Demo{
//     public static void main(String[] args){
//         Human obj = new Human();
//         Human obj1 = new Human(18,"drona");
//         System.out.println(obj.getName() + ":" + obj.getAge());
//         System.out.println(obj1.getName() + ":" + obj1.getAge());

//     }
// }

//Naming Convension in Java

//Anonymous object in Java

//Inheritance in Java


// public class Demo{
// public static void main(String[] args)
// {
//     VryAdvCalc obj = new VryAdvCalc();
//     int r1 = obj.add(5,8);
//     int r2 = obj.sub(9,8);
//     int r3 = obj.multi(2,3);
//     float r4 = obj.div(15,2);
//     double r5 = obj.power(7,3);
//     System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " "+ r5);
// }
// }

//This and Super Method in Java
// class A
// {
//     public A()
//     {
//         super();
//         System.out.println("in A");
//     }
//     public A(int n)
//     {
//         super();
//         System.out.println("in A int");
//     }
// }
// class B extends A
// {
//     public B()
//     {
//         super();
//         System.out.println("in B");
//     }
//     public B(int n)
//     {
//         this(); //super(n);
//         System.out.println("in B int");
//     }
// }
// public class Demo
// {
//     public static void main(String[] args)
//     {
//         B obj = new B(6);
//     }
// }

//Method Overridding
// class Calc
// {
//     public int add(int a, int b)
//     {
//         return a+b;
//     }
// }
// class AdvCalc extends Calc
// {
//     public int add(int a, int b)
//     {
//         return a+b+1;
//     }
// }
// public class Demo
// {
//     public static void main(String[] args)
//     {
//         AdvCalc obj = new AdvCalc();
//         int r1 = obj.add(3,4);
//         System.out.println(r1);
//     }
// }

//Packages
// import java.lang.*;

//Access Modifiers