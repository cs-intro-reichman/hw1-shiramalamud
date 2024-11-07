// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend 
{
	public static void main(String[] args) 
	{
		int lim=Integer.parseInt(args[0]);
		int a= (int)(lim*(Math.random()));
		int b= (int)(lim*(Math.random()));
		int c= (int)(lim*(Math.random()));
		System.out.println(a+" "+b+" "+c);
		int min=Math.min(a,b);
		int middle=Math.max(a,b);
		int max=c;
		max=Math.max(middle, c);
		middle=Math.min(middle,c);
		middle=Math.max(min,middle);
		min=Math.min(min,c);
		System.out.println(min+" "+middle+" "+max);
		

	}
}
