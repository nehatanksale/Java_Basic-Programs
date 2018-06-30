interface Drawable
{
    public void Draw();
}

class LambdaExpression
{

    public static void main(String[] args) {
        int width=10;
        Drawable d2=()->        //Lambda expression
        {
            System.out.println(width);
        };

        d2.Draw();
    }
}
