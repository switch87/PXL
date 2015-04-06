package Switch87.PXL.Essentials.Hoofdstuk6;

public class opdracht4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder[] Teksten = new StringBuilder[2];
		Teksten[0] = new StringBuilder("Dit is een      heel mooie tekst!");
		Teksten[1] = new StringBuilder("tMaar deze tttekst is nog mooier!t");
		PrintTekst(Teksten);
		Teksten[0].append(" Dit is een toevoeging!!");
		Teksten[1].reverse();
		PrintTekst(Teksten);
		for(int i = 0; i < Teksten[0].length();i++)
		{
			while (Teksten[0].charAt(i) == ' ') Teksten[0].deleteCharAt(i); 
		}
		
		int i = 0;
		do
		{
			if(Teksten[1].charAt(i) == 't')
			{
				Teksten[1].insert(i, 't');
				i++;
			}
			i++;
		} while (i < Teksten[1].length());
		PrintTekst(Teksten);
	}
	
	public static void PrintTekst(StringBuilder[] teksten)
	{
		for(StringBuilder tekst:teksten)
		{
			System.out.println(tekst);
		}
	}

}
