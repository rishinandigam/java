
public class factorial {
    public void displayFactorial( int n)
    {
         int fact =1 ;
         for(int i=1;i<=n ;i++)
         {
            fact *= i;

         }
         System.out.println("The factorial of "+n+" is "+fact );
    }
}
