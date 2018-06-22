import java.util.Scanner;

public class SwitchCases
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,ch;
        System.out.println("Enter number1:");
        a=sc.nextInt();
        System.out.println("Enter number2");
        b=sc.nextInt();

        System.out.println("Enter your choice:1.add 2.sub");
        ch=sc.nextInt();

        switch(ch)
        {
            case 1: System.out.println("addition is") ;
                    System.out.println(a+b);
                    break;
            case 2:
                System.out.println("Subtraction is:");
                System.out.println(a-b);
                break;
        }





    }

}
