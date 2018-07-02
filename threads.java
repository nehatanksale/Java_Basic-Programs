public class threads {

    public static void main(String[] args) {
        Thread t1 = new Thread();
        t1.start();
        new Thread() {
            public void run() {
                System.out.println( "Hello I am in run() method");
            }
        }.start();

    }
}

