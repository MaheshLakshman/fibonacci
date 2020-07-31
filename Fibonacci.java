class Fibonacci
{
    public static void main(String args[])
    {
        byte limit = 10;
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(" Fibonacci series ");
        System.out.println("The values are : ");
         System.out.println(a);
         System.out.println(b);
        for(int i = 0; i < limit; i++)
        {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}