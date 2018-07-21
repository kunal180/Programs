//Program to find out smallest number from array
class min_array
{ 
	public void min(int arr[])
	{
		int small=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(small>arr[i])
				small=arr[i];
			
		}
		System.out.println("The smallest number is... : "+small);
	}
	
	public static void main(String args[])
	{
		min_array obj=new min_array();
		int a[]={7,3,6,95,36,74,2,56};
		obj.min(a);
	}
}
