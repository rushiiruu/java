public class EspinaLab4
{
	public static void main(String args[]) 
	{
        String input;
        String s = "tiuq";
        
        do{
            System.out.println("\nInput something: ");
            input = Input.readString();
            System.out.print("Text reversed: ");
            for (int i = input.length(); i > 0; i-- )
            {
                System.out.print(input.charAt(i-1));
            }
        
            if (s.equals(input) == true)
            {
                System.out.print("\nExiting program... ");
                return;
            }
          } while (s.equals(input) == false);
    }
}



