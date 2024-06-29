public class EspinaLab3
{
	public static void main(String args[]) 
	{
        int num, n1 = 1, n2 = 1, n3;

        System.out.print("Enter a number: ");
		num = Input.readInt();

        System.out.print("Fibonnaci Sequence: ");
        for (int i = 1; i <= num; i++)
        {
            if (i == 1 || i == 2)
            {
                System.out.print("1 ");
            }
            else
            {
            n3 = n1 + n2;
            System.out.print(n3 +" ");
            n1 = n2;
            n2 = n3;
            }
        }
    }
}