package taxibk;
import java.util.*;
public class MainClass 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		boolean loop = true;
		
		while(loop)
		{
			System.out.println("Choose any one : \n1.Book Taxi\n2.Display Details\n3.Exit");
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			switch(n)
			{
			case 1:
			{
				System.out.println("Enter Pickup Location(A-Z)");
				char pickupLocation = s.next().charAt(0);
				System.out.println("Enter Drop Location(A-Z)");
				char dropLocation = s.next().charAt(0);
				System.out.println("Enter Pickup Time");
				int pickupTime = s.nextInt();
				System.out.println(taxibooking.booking(pickupLocation, dropLocation, pickupTime));
				break;
			}
			
			case 2:
			{
				taxibooking.display();
				break;
			}
			
			case 3:
			{
				loop = false;
				System.out.println(" Thank You!!! ");
				break;
			}
			}
		}
	}
}
