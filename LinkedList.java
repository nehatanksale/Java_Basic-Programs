import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> li=new LinkedList<Integer>();
        li.add(5);
        li.add(10);
        li.add(15);


        Iterator<Integer> it=li.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }






    }
}
