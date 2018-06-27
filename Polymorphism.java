class class1
{
    public void run()
    {
        System.out.println("Run method in class1");
    }


}

    public class Polymorphism extends class1 {

public void run()
{
    System.out.println( "Run method in Class2");
}
        public static void main(String[] args) {
    Polymorphism o=new Polymorphism();

//or class1 o=new Polymorphism();
o.run();
        }
    }
