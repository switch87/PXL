package Switch87.PXL.Essentials.Hoofdstuk6;

import java.util.GregorianCalendar;

public class opdracht6 
{
	public static void main(String[] args) 
	{
		GregorianCalendar date = new GregorianCalendar();
		GregorianCalendar geboorte = new GregorianCalendar(1987,2,5);
		System.out.format("%1$td/%1$tm/%1$ty %1$tH:%1$tM:%1$tS\n",date);
		System.out.format("%1$td/%1$tm/%1$ty %1$tH:%1$tM:%1$tS",geboorte);
	}
}
