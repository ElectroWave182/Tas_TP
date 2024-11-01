package tp9;

import java.util.PriorityQueue;

public class TourDeControle extends PriorityQueue<Vol>
{

	PriorityQueue<Vol> file;
	
	public TourDeControle ()
	{
		file = new PriorityQueue<>();
		
		for (int i = 0; i < 7; i ++)
		{
			Vol avion = new Vol();
			file.add(avion);
		}
	}
	
	public String toString()
	{
		String sortie = "";
		
		for (Vol cours: file)
		{
			sortie += cours;
		}
		
		return sortie;
	}
	
	public static void main (String[] args)
	{
		
		TourDeControle pize = new TourDeControle();
		@SuppressWarnings("unused")
		Vol first, retirer;
		
		while (! pize.file.isEmpty())
		{
			System.out.print(pize);
			first = pize.file.peek();
			first.atterrir();
			retirer = pize.file.poll();
			
			for (Vol restant: pize.file)
			{
				restant.attendre();
			}
		}
		
	}
	
}
