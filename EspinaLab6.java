public class EspinaLab6
{
	public static void main(String args[]) 
	{
        int num; 
        do 
        {
            System.out.println("Input a positive number: ");
            num = Input.readInt();

            if (num != 555)
            {
                int factorial_result = calCulator(num);
                System.out.println("The factorial of " + num +" is "  + factorial_result);
            }
            else 
            {
                System.out.print("\nExiting program... ");
            }
        } while (num != 555);
    } 

    public static int calCulator(int number) 
    {
        int factorial = 1;
        
        for(int i = 1; i <= number; i++)
            {
                factorial = factorial * i;
            }
        return factorial;
    }
}

   