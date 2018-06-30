import java.util.HashSet;
import java.util.Iterator;

class HashSet {




    public static void main(String[] args) {

        HashSet<String> h1=new HashSet<String>();
        h1.add("element1");

        System.out.println("Iterating over the list");
        Iterator<String> i=h1.iterator();
        while(i.hasNext())
        {
            System.out.println( i.next());
        }

    }
}
