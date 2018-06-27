public class Encapsulation
{
    private String name;
    private String wealth;
    public String getName(String newval)
    {
        name=newval;
        return name;
    }
    public String setName()
    {
        return name;
    }
    public static void main(String[] args) {
Encapsulation o=new Encapsulation();
o.getName("John");
System.out.println(o.setName());



            
    }
}
