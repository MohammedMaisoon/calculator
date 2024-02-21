import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1=scanner.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 =scanner.nextInt();
        int add=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int div=num1/num2;
        int mod=num1%num2;


        System.out.println("The Addition of Two Numbers is: "+add);
        System.out.println("The Subtraction of Two Numbers is: "+sub);
        System.out.println("The Multiplication of Two Numbers is: "+mul);
        System.out.println("The Division of Two Numbers is: "+div);
        System.out.println("The Modulus of Two Numbers is: "+mod);






    }
}