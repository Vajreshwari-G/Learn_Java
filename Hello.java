class Hello
{
    public static void main(String arg[])
    {
        byte b = 127;
        int c = 256;
        byte k = (byte) c;

        float f = 5.6f;
        int t = (int) f;
        int num = 7;
         int result = num++; // fetch the value and then increment
        int result = ++num; // increment and then fetch

        //Relational Operator
        int x = 6;
        int y = 7;
        boolean result = x<=y;
        
        //Logical Operator
        int x = 7;
        int y = 6;
        int a = 1;
        int b = 9;
        boolean result = x>y || a>b;
        System.out.println(!result);

        //Conditional Statements
        int x = 18;
        if(x>5 && x<=10)
        System.out.println("Hello");
        else
        System.out.println("Byee");

        //IF ELSE Statements
        int x = 8;
        int y = 7;
        int z = 9;
        if (x>y && x>z)
            System.out.println(x);
        else if(y>z)
            System.out.println(y);
        else
            System.out.println(z);

        //Ternary Operator
        int n = 4;
        int result = 0;
        result = n%2==0 ? 10 : 20;
        System.out.println(result);

        //Switch Statement
        int n = 4;
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break; 
            default:
                System.out.println("Invalid number Entered");      
        }

        //Advanced Switch Statements
        String day = "abc";
        String result = "";
        result = switch(day)
        {
            case "Saturday", "Sunday" -> "6am";
            case "Monday" -> "8am";
            default -> "7am";
        };
        System.out.println(result);

        //While Loops
        int i = 1;
        while(i<=4)
        {
            System.out.println("Hi"+i);
            int j = 1;
            while(j<=3){
                System.out.println("hello"+j);
                j++;
            }
            i++;
        }
        System.out.println("Bye"+i);
        
        System.out.println(21 + 40);
    

    }
}