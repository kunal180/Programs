import java.util.Scanner;
 
class palindrome
{
  public static void main(String args[])
  {
    int n,OrigNo,revno=0,mod;
	Scanner s = new Scanner(System.in);
    System.out.print("Enter the number to check palindrome or not(in numbers) : ");
    n = s.nextInt();
	System.out.println();
	OrigNo=n;
	
	while(n>0)
	{
		mod=n%10;
		revno=revno*10+mod;
		n=n/10;	
	}
	if(OrigNo==revno)
		System.out.println(OrigNo+" is palindrome number.....");
	else
		System.out.println(OrigNo+" is not palindrome number");
  }
} 
