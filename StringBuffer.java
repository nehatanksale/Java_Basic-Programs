class StringBuffer
{
    public static void main(String[] args) {
        String s="hello";
            StringBuffer sb=new StringBuffer(s);
        System.out.println( sb.append(2));
        System.out.println( sb.capacity());
        System.out.println( sb.charAt(3));
        System.out.println( sb.substring(0,2));
        System.out.println( sb.length());
        System.out.println( sb.indexOf(s,0));
        System.out.println( sb.insert(3,'c'));
        System.out.println( sb.insert(3,'a'));
       

    }
}
