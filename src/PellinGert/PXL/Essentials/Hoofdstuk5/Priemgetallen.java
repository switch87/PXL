// Hoofdstuk 5 - Opdracht 14: Priemgetallan

package PellinGert.PXL.Essentials.Hoofdstuk5;
import java.util.*;

public class Priemgetallen 
{
	public static void main(String[] args)
	{
		long start = System.currentTimeMillis();
		 int UpperLimit = 1000;
		 ArrayList<Integer> Primes =  new ArrayList<>();
		 for (int i = 2; i<=UpperLimit; i++)
		 {
			 boolean IsPrime = true;
			 for (int j : Primes)
			 {
				 if (j > i*i) break;
				 else if (i%j == 0)
				 {
					 IsPrime = false;
					 break;
				 }
			 }
			 if (IsPrime) Primes.add(i);
		 }
		 System.out.println("Priemgetallen kleiner dan "+UpperLimit+":");
		 int Tabs=0;
		 for (int j:Primes)
		 {
			 System.out.print(j+"\t");
			 Tabs++;
			 if (Tabs==15)
			 {
				 Tabs=0;
				 System.out.println();
			 }
		 }
		 
		 System.out.println("\ntijd: "+(System.currentTimeMillis()-start));
	}
}
