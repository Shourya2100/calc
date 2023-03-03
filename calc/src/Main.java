import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the operation");
        int ch = sc.nextInt();

        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();

        if(ch == 1)
        {
            System.out.println("Addition is :" + (num1 + num2));
        }

//        if(ch == 2)
//        {
//            System.out.println("Addition is :" + (num1 - num2));
//        }

    }
}