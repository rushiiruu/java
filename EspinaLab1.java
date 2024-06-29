public class EspinaLab1
{
	public static void main(String args[]) 
	{
		int sum = 0, largest = 0, smallest = 0, positivetotal = 0, negativetotal = 0, num, negative = 0, positive = 0, counter = 0;

		for (int i = 0; i < 10; i++)
		{
			System.out.print("Enter a number: ");
			num = Input.readInt(); 
            sum += num;
            
            if (i == 0)
            {
                largest = num;
                smallest = num;
            }
            if (largest < num)
            {
                largest = num; 
            }
            if (smallest > num)
            {
                smallest = num;
            }
            if (num < 0)
            {
                negative = negative + num;
                negativetotal++;
            }
            if (num > 0)
            {
                positive = positive + num;
                positivetotal++;
            }
            if (num >= 50 && num <= 100)
            {
                counter++;
            }
		}
		
		System.out.println("The sum of the 10 numbers is: " + sum); 
        System.out.println("The highest of the 10 numbers is: " + largest); 
        System.out.println("The smallest of the 10 numbers is: " + smallest);
        System.out.println("The total of all positive numbers are " + positive);
        System.out.println("The total of all negative numbers are " + negative);
        System.out.println("The total number of negative numbers entered is " + negativetotal);
        System.out.println("The total number between 50 and 100 entered is " + counter);
    } 
} 
		
		