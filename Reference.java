import java.util.Arrays;

public class RefVSValue {

    public static void main(String args[])
    {
        int[] myarr=new int[5];
        int[] newarr=myarr;

        System.out.println(Arrays.toString(myarr));
        System.out.println(Arrays.toString(newarr));

    }
}
