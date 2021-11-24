import jdk.internal.icu.impl.CharacterIteratorWrapper;

import java.security.PublicKey;
        import java.util.Scanner;
public interface Calculator {
    Scanner sc = new Scanner(System.in);
    double a= sc.nextInt();
    double b= sc.nextInt();
}
class addition implements Calculator{
    public addition(){
        double c=a+b;
        System.out.println(c);
    }
}
class subtraction implements Calculator{
    public subtraction(){
        double c=a-b;
        System.out.println(c);
    }
}
class multiplication implements Calculator{
    public multiplication(){
        double c=a*b;
        System.out.println(c);
    }
}
class division implements Calculator{
    public division(){
        double c=a/b;
        System.out.println(c);
    }
}
class does {
    public static void main(String args[]) {
        System.out.println("请输入两个数字");
        double a = Calculator.a;
        double b =Calculator.b;
        System.out.println("请输入运算符");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        switch (s){
            case "+":new addition();
            break;
            case "-":new subtraction();
            break;
            case "*":new multiplication();
            break;
            case "/":new division();
            break;
        }
        }
    }
