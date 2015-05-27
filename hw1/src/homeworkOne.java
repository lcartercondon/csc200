import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Liam Carter-Condon
 *
 */
public class homeworkOne {

	/**
	 * @param args; no arguments
	 * 
	 */
	public static void main(String[] args) {
		
		//partOne();
		
		partTwo();
		
	}
	
	private static void partOne() {
		System.out.println("Part One, Homework One");
		System.out.println("-------------------------");
		// Create scanner 
		Scanner in = new Scanner(System.in);
		
		// store input as names, splitting along semicolons;
		String[] names = in.nextLine().split(";");
		
		// store height inputs in an arraylist for easier accessing
		ArrayList<Integer> heights = new ArrayList<Integer>();
		heights.add(new Integer(in.nextInt()));
		heights.add(new Integer(in.nextInt()));
		// create a 2D arraylist for feet inches [feet][inches]
		ArrayList<ArrayList<Integer>> feetInches = new ArrayList<ArrayList<Integer>>();
		// another arraylist for storing the conversion
		ArrayList<Double> centimeters = new ArrayList<Double>();
		// for each loops are easy with arraylists
		for(Integer i: heights) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(i/12);
			temp.add(i%12);
			feetInches.add(temp);
			centimeters.add(i * 2.54);
		}
		// need to be able to index into arraylists
		for(int i = 0; i < names.length; i++){
			Integer feet = feetInches.get(i).get(0);
			Integer inches = feetInches.get(i).get(1);
			System.out.println(names[i] + " is " +
					// change wording with ternary based on number (plural vs singular)
					(feet==0?"":feet + (feet==1?" foot":" feet") + " and ") + 
					// same change of wording based on number
					inches + (inches==1?" inch":" inches") + " tall (" +
					centimeters.get(i) + " cm).");
		}
		// calculate the differences
		int difference = Math.abs(heights.get(0)-heights.get(1));
		System.out.println("The height difference between them is " + difference + " inches (" + 
				difference*2.54 + " cm).");
		in.close();
	}
	
	private static void partTwo() {
		System.out.println("Part Two, Homework One");
		System.out.println("----------------------");
		
		final double APR = 7.49;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter this month's payment (dollars.cents):");
		double payment = in.nextDouble();
		
		System.out.println("Enter the principal owed (dollars.cents)");
		double owed = in.nextDouble();
		System.out.printf("Previous Balance:\t\t$" + owed + "\n");
		System.out.printf("Payment:\t\t\t$" + payment + "\n");
		System.out.printf("Interest Paid:\t\t\t$%.2f\n",(owed * APR/12.0/100.0));
		System.out.printf("Amount applied to principal:\t$%.2f\n",(payment - (owed*APR/12.0/100.0)));
		System.out.printf("New Balance:\t$%.2f\n", (owed - (payment - (owed*APR/12.0/100.0))));
		
		in.close();
		}
}
