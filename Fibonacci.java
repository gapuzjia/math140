package fa23;

public class Fibonacci
{

    public static void main(String[] args)
    {
        //for (int num = 0; num < 100; num++)
        {
          //  System.out.println(num + " " + fib(num));
        }
        
        int newnum;
        int curr = 1;
        int pre = 0;
        int i = 0;
        
        while(i < 50)
        {
        	System.out.println(curr + "");
        	newnum = curr + pre;
        	pre = curr;
        	curr = newnum;
        	i++;
        }
        
        
        
        
    }

    public static long fib(int num)
    {
        if (num == 0 )
        {
            return 0;  //base case
        }
        if (num == 1)
        {
            return 1;   //base case
        }     

        //Recursive
        return fib(num - 1) + fib(num - 2);

    }

}