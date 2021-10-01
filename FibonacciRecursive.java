public class FibonacciRecursive 
{
  public static void main(String[] args)
  {
    
    int n=10,i,j=0;
    System.out.println("Printing first "+n+" numbers in Fibonacci Series \n");
    for(i=1;i<=n;i++)
    {
      System.out.print(fib(j)+"\t");
      j++;
    }
  }

  public static int fib(int n)
  {
    if ( n == 0 )
    return 0;
    else
    if ( n == 1 ) return 1;
    else
    return ( fib(n-1) + fib(n-2) );
  }
}
