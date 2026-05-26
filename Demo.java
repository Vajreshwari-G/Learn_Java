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
class Computer{
    public static void playMusic(){
        System.out.println("Music Playing..");
    }
    public String getMeAPen(int cost){
        if(cost>=10)
            return "Pen";
        return "Nothing";
    }
    }

public class Demo{
    public static void main(String[] agrs){
        Computer com = new Computer();
        com.playMusic();
        String str = com.getMeAPen(2);
        System.out.println(str);
    }
}

//Overloading
class Calculator{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public double add(double n1, double n2){
        return n1+n2;
    }
}
public class Demo{
    public static void main(String[] args){
        Calculator obj = new Calculator();
        int r1 = obj.add(0.37,0.54);
        System.out.println(r1);
    }
}

