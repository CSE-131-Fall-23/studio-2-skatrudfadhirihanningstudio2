package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//accept inputs
		System.out.println("Enter start amount: ");
		int startAmount = in.nextInt();
		System.out.println("Enter the win probability: ");
		double winChance = in.nextDouble();
		System.out.println("Enter the win limit: ");
		int winLimit = in.nextInt();
		
		System.out.println("How many days will you simulate? ");
		int totalSimulations = in.nextInt();

		
		int currentAmount = startAmount;
		for totalSimulations{		
			int totalRuins = 
			while (currentAmount > 0 && currentAmount<winLimit) {
				//simulate success (true) or failure (false)	
				double rand = Math.random();
				boolean result = (rand<winChance);
				if (result==true){ //if you won
					currentAmount=currentAmount+1;
				}else { //if you lost
					currentAmount=currentAmount-1;
				}
				System.out.println(currentAmount);
				if (currentAmount==0) {
					totalRuins = totalRuins +1
				}
			}
		}

}
}
