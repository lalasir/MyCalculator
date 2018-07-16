package MyCalculator;
import java.util.*;
import static java.lang.System.out;
public class MyCalculator {
	public static void main(String[]Args) {
		

		
		double result = 0;
		boolean status = true;
		while(status) {
			
			result = 0;
			out.println("\n\n\n\n\n    Welcome to MyCalculator(Second Commit)    ");
			out.println("================insert calculation====================\n");
			try {
				
			Scanner scan = new Scanner(System.in);
			
			//out.print("Insert 1st number:     ");
			String s1 = scan.nextLine();
			double d1 = Double.parseDouble(s1);
			
			//out.print("Insert operator:        ");
			String ss = scan.nextLine();	//Asking calculation operator
			
			//out.print("Insert 2nd number:     ");
			String s2 = scan.nextLine();
			double d2 = Double.parseDouble(s2);
			
			
			
		
				switch(ss) {
					case "+":
						result = d1+d2;
						break;
					
					case "-":
						result = d1-d2;
						break;
					
					case"*":
						result = d1*d2;
						break;
					
					case"/":
						result = d1/d2;
						break;
					
					
				}
			}catch(NumberFormatException e) {
				out.println(" INPUT EXCEPTION");
			}
				
			out.println("======================================================");
			out.println("=       "+result);
			out.println("======================================================");
		}
			
			
			
			

		
		


		System.exit(0);;
	}
}
