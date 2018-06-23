class ThisKeyword{
    public static void main(String args[]) {
        binary o=new binary();
        o.accept(3);
    }

    int acc_no;                           //in class,we have used a variable named acc_no
    void accept(int acc_no)                 //now,in accept function,instead of using another variable,same acc_no is used.
    {
        this.acc_no=acc_no;               //this keyword does this
        System.out.println(acc_no);

    }
}
