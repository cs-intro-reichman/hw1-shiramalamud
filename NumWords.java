// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		int one=num%10;
		int ten=num/10%10;
		int hundred=num/100;
		System.out.println(hundred+" hundreds, "+ten+" tens, and "+one+" ones.");

	   
	}
}
