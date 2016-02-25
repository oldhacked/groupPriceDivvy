/*   This program will divvy up utility expenses among room mates without the redundant
	 exchange of money. If each room mate has a utility bill, each individual bill will
	 be divided into the total number of attendees. That quotient will then be deducted 
	 from the other attendees. ex: If room mate one's (rm1) quotient is larger than rm2, 
	 the rm2 value will be deducted from rm1 returning a "value owed" to rm2. 

	 **only works for 3 room mates for now***
*/
	

//need to update package name

package groupPriceDivvy;

public class utilities{
	public static void main(String[] args){
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	
	String rm1Name;
	String rm2Name;
	String rm3Name;
	
	float util1 = 0;
	float util2 = 0;
	float util3 = 0;
	
	float utilQuotient1 = 0;
	float utilQuotient2 = 0;
	float utilQuotient3 = 0;
	
	float amountOwed1to2 = 0;
	float amountOwed1to3 = 0;
	float amountOwed2to1 = 0;
	float amountOwed2to3 = 0;
	float amountOwed3to1 = 0;
	float amountOwed3to2 = 0;
	
	
	
	// asks the users for their name and utility bill
	
	System.out.println("\nRoom mate 1: Please enter your name: ");
	rm1Name = scanner.next();
	
	System.out.println("Sup " + rm1Name + "! Enter your utility bill amount:");
	util1 = scanner.nextFloat();

	System.out.println("\nRoom mate 2: Please enter your name: "); 
	rm2Name = scanner.next();
	
	System.out.println("Yo " + rm2Name + "! Enter your utility bill amount:");
	util2 = scanner.nextFloat();
	
	System.out.println("\nRoom mate 3: Please enter your name: ");
	rm3Name = scanner.next();
	
	System.out.println("Well.. Hello there " + rm3Name + ". Enter your utility bill amount:");
	util3 = scanner.nextInt();
	
	scanner.close();
	
	// divide the utility bill by the number of room mates to provide an amount owed to each
	
	
	utilQuotient1 = util1 / 3;
	utilQuotient2 = util2 / 3;
	utilQuotient3 = util3 / 3;
	
	
	// 1 to 2, 2 to 1
	
	if (utilQuotient1 < utilQuotient2){
		amountOwed1to2 = utilQuotient2 - utilQuotient1;
	}
	else if (utilQuotient1 > utilQuotient2){
		amountOwed2to1 = utilQuotient1 - utilQuotient2;
	}
	else if (utilQuotient1 == utilQuotient2){
		amountOwed1to2 = 0; amountOwed2to1 = 0;
	}
	
	// 1 to 3, 3 to 1
	
	if (utilQuotient1 < utilQuotient3){
		amountOwed1to3 = utilQuotient3 - utilQuotient1;
	}
	else if (utilQuotient1 > utilQuotient3){
		amountOwed3to1 = utilQuotient1 - utilQuotient3;
	}
	else if (utilQuotient1 == utilQuotient3){
		amountOwed1to3 = 0; amountOwed3to1 = 0;
	}
	
	// 2 to 3, 3 to 2
	
	if (utilQuotient2 < utilQuotient3){
		amountOwed2to3 = utilQuotient3 - utilQuotient2;
	}
	else if (utilQuotient2 > utilQuotient3){
		amountOwed3to2 = utilQuotient2 - utilQuotient3;
	}
	else if (utilQuotient2 == utilQuotient3){
		amountOwed2to3 = 0; amountOwed3to2 = 0;
	}
	
	
	/*
	utilQuotient1 = rm1 amountOwed1to2 to rm2, rm1 amountOwed1to3 to rm3
	utilQuotient2 = rm2 amountOwed2to1 to rm1, rm2 amountOwed2to3 to rm3
	utilQuotient3 = rm3 amountOwed3to1 to rm1, rm3 amountOwed3to2 to rm2
	*/
	
	
	
	
	System.out.println("\nTime to pay up!!! \n\n" + 
	rm1Name + " owes " + rm2Name + " $" + amountOwed1to2 + " and " + rm3Name + 
	" $" + amountOwed1to3 + ". \n" + 
	
	rm2Name + " owes " + rm1Name + " $" + amountOwed2to1 + " and " + rm3Name + 
	" $" + amountOwed2to3 + ". \n" + 
	
	rm3Name + " owes " + rm1Name + " $" + amountOwed3to1 + " and " + rm2Name + 
	" $" + amountOwed3to2 + ". \n");
	
	
	
	}

}