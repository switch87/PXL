package Switch87.PXL.Essentials.Hoofdstuk6;
import java.util.*;

public class RandomApp {
	
	public static void main(String[] args)
	{
		Random Rand1 = new Random(), Rand2 = new Random();
		Rand1.setSeed(55);
		Rand2.setSeed(55);
		for (int i = 0; i < 10; i++)
		{
			System.out.println(Rand1.nextInt()+"\t"+Rand2.nextInt());
		}
	}

}
