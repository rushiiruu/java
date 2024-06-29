public class EspinaLab2
{
	public static void main(String args[]) 
	{
        double amount = 0.0, temp_amount = 0;
        int years;

        
        do{
            System.out.print("Enter an amount: ");
            amount = Input.readDouble();

            if (amount < 0)
            {
                System.out.println("You inputted negative input to the amount. Please try again. " );
            }
        } while (amount < 0);
        
        do{
            System.out.print("Enter number of years: ");
            years = Input.readInt();

            if (years < 0)
            {
                System.out.println("You inputted negative input to the years. Please try again. " );
            }
        } while (years < 0);
           
        for( int i = 1; i <= years; i++)
        { 
            temp_amount = amount * 0.10;
            amount = amount + temp_amount;
        }
            System.out.println("Compound interest: " + amount);
        }
}
