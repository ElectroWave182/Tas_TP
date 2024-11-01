package tp9;

public class Tas<E extends Comparable<E>>
{
	
	E[] valeurs;
	int indiceMax;
	
	@SuppressWarnings("unchecked")
	public Tas (int hauteur)
	{
		indiceMax = -1;
		for (int i = 0; i < hauteur; i ++)
		{
			indiceMax += Math.pow(2, i);
		}
		
		valeurs = (E[]) new Object[indiceMax];
	}
	
	public void tamiser (int ind)
	{
		E pere = valeurs[ind];
		E filsG = valeurs[ind * 2 + 1];
		E filsD = valeurs[ind * 2 + 2];
		
		if (filsG > pere && filsG > filsD)
		{
			
		}
		else if (filsD > pere && filsD > filsG)
		{
			
		}
	}
	
	public void inserer (E ele)
	{
		int ind = 0;
		for (E noeud: valeurs)
		{
			if (noeud == null)
			{
				break;
			}
			ind ++;
		}
		
		valeurs[ind] = ele;
		
		tamiser(valeurs);
	}
	
	public void supprimer ()
	{
		int ind = 0;
		for (E noeud: valeurs)
		{
			if (noeud == null)
			{
				break;
			}
			ind ++;
		}
		
		valeurs[0] = valeurs[ind];
		valeurs[ind] = null;
		
		tamiser(valeurs);
	}
	
}
