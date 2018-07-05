import java.util.Scanner;
class primeno
{
	public static void main(String[] args)
	{
		int n,check=0;
		System.out.println("Enter the number to check prime number or not : ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				check++;
			}
		}
		if(check==2)
		{
			System.out.println(n+ " is a prime number......");
		}
		else 
		{
			System.out.println(n+ " is not a prime number.....");
		}
	}
}
