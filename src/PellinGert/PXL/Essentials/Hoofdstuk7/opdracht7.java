package PellinGert.PXL.Essentials.Hoofdstuk7;

import java.util.Scanner;

public class opdracht7 {
	
	public static int[] Letterwaardes = new int[28] {1,3,5,2,1,4,3,4,1,4,3,3,3,1,1,3,10,2,2,2,4,4,5,8,8,4,0,8};

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		char[] woord = input.nextLine().toCharArray();
		

	}
	
	public static int WoordWaarde(char[] woord)
	{
		int score = 0;
		
		for(char letter:woord)
		{
			score += (int)Character.toUpperCase(letter)-65;
		}
		
		return score;
	}

}
