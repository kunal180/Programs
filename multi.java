import java.util.Scanner;
public class multi
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number : ");
	int no=s.nextInt();
	
	for(int i=1;i<=10;i++)
	{
		int m=i*no;
	}
	System.out.println("Multiplication table of no : " +m);
}