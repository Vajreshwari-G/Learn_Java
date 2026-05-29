
//What is String?
public class Demo{
    public static void main(String[] args){
        String name = new String("priya");
        System.out.println(name);
        System.out.println("hello "+name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat("joy"));
    }
}

//Mutable and Immutable String
public class Demo {
    public static void main(String[] args) {
        String name = new String("priya");
        name = name + " joy";
        String name1 = "Priya";
        String name2 = "Priya";

        System.out.println(name);
    }
}

//String Buffer and String Builder
public class Demo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Priya");
        sb.append("Joy");
        sb.setLength(30);
        sb.insert(6,"java");
        System.out.println(sb);
    }
}

