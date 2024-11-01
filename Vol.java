package tp9;

import java.util.Random;

public class Vol implements Comparable<Object>
{

	String identifiant;
	int carburant;
	
	public Vol ()
	{
		Random gnr = new Random();
		carburant = gnr.nextInt(7) + 2;
		
		char r1 = (char) (gnr.nextInt(26) + 65);
		char r2 = (char) (gnr.nextInt(26) + 65);
		identifiant = "" + r1 + r2 + (gnr.nextInt(901) + 99);
	}
	
	@Override
	public int compareTo (Object compare)
	{
		Vol v = (Vol) compare;
		return this.carburant - v.carburant;
	}
	
	public String toString ()
	{
		return identifiant + " : " + carburant + "\n";
	}
	
	public void attendre ()
	{
		carburant --;
		
		if (carburant == 0)
		{
			crasher();
		}
	}
	
	public void crasher ()
	{
		System.out.println("On est ensemble\n");
		System.exit(0);
	}
	
	public void atterrir ()
	{
		System.out.println("J'atterris en légende\n");
	}
	
	public static void main (String[] args)
	{
	}
	
}
