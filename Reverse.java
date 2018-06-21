import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);


      int[] arr=new int[5];
      System.out.println("Enter the elements:");

      for(int i=0;i<5;i++)
      {
          arr[i]=sc.nextInt();
      }

      System.out.println("Reverse is:");
      for(int i=4;i>=0;i--)                         //i-- is very important
      {
          System.out.println(arr[i]);
      }


    }
}
