import java.util.Scanner;

class hello extends Exception
{
    hello()
    {
        System.out.println("Not eligible");
    }

}

public class ArrayOfObjects
{
    Scanner sc=new Scanner(System.in);
    String name;
    int age;

    void accept()
    {
        System.out.println( "Enter name:");
        name=sc.next();

        System.out.println( "Enter age");
        age=sc.nextInt();

        try
        {
            if(age<18)
            {
                throw new hello();
            }
            else

            {
                System.out.println("Eligible");
            }
        }
        catch(hello e)
        {}

    }
    public static void main(String args[])
    {

        ArayOfObjects obj[]=new ArayOfObjects[3];
        for(int i=0;i<3;i++)
        {
            obj[i]=new ArayOfObjects();
            obj[i].accept();
        }

    }
}
