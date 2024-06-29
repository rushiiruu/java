/*This program asks a user for a number and asks whether the user wants to enter a power to be raised or not. If the user enters [Y/n], 
the program will then calculate the answer. */
public class EspinaLab9
{
    public static void main(String args[])
    {
        double n;
        int p;
        char choice;
    
            System.out.println("Enter a number: ");
            n = Input.readDouble();

            do 
            {
                System.out.println("Would you like to enter power? [Y/N]: ");
                choice = Input.readChar();

                if (choice != 'Y' && choice != 'y' && choice != 'N' && choice != 'n')
                {
                    System.out.println("Invalid input. Please input [Y/N].");
                }

                if (choice == 'Y' || choice == 'y')
                {
                    System.out.println("Enter the power to be raised: ");
                    p = Input.readInt();

                    System.out.println(" " + n + " raised to the power of " + p + " is " + getPower(n, p));

                }
            } while (choice != 'Y' && choice != 'y' && choice != 'N' && choice != 'n');
            
    }
    public static double getPower(double n, int p)
    {
        double power = 1;

        if (p > 0)
        {
            for(int i = 1; i <= p; i++)
            {
                power = power * n; 
            }
        }

        if (p < 1)
        {
            n = 1/n;

            for(int i = -1; i >= p; i--)
            {
                power = power * n; 
            }
        }
        return power;
    }
}