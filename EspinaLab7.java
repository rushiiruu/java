//This program reverses the inputted number of the user.

public class EspinaLab7
{
	public static void main(String args[]) 
	{
        int num;
        do 
        {
            System.out.println("Input a positive number: ");
            num = Input.readInt();

            if (num < 0 )
            {
                System.out.print("\nExiting program... ");
            }
            else if (num < 11 || num > 99999999)
            {
                System.out.println("That number is not within the range 11 - 99999999. Please try again." );
            }
            else 
            {
                System.out.println("Reverse: " + getReverse(num) );
            }
        } while (num > 0);
    }

    public static long getReverse(int num)
    {
        int reverse = 0;

        while(num != 0)
        {
            reverse = reverse * 10 + (num % 10);
            num = num / 10;
        }
        return reverse;
    }
}