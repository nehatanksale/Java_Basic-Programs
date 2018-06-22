public class Method_Overloading
{
    public static void main(String[] args)
    {
        Method_Overloading obj=new Method_Overloading();
        obj.show();
        obj.show(2,5);
    }

    void show()
    {
        System.out.println("Normal method");
    }
    void show(int x,int y)
    {
        System.out.println("Parameterized method" +x +y);
    }
}
