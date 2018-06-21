import java.util.Scanner;

public class min_max
{
    public static void main(String[] args)
    {
        int maximum=0;
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter the elements:");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();                               //enter the elements
        }
        for(int i=0;i<5;i++)
        {
           maximum=arr[0];                          //maximum is initialised to 0th element in the array
          if(arr[i]>maximum)                        //as the for loop proceeds further,every ith element is compared with maximum
          {                                           //if greater,then that is the maximum
              maximum=arr[i];                         

          }

        }
        System.out.println(maximum);
    }
}
