import java.util.ArrayList;

/**
 * 
 */

/**
 * @author lcartercondon
 *
 */
public class DayTwo {

	/**
	 * @param none
	 * Day two of class
	 * Talking about basic types, casting, basic operators
	 */
	public static void main(String[] args) {
		Integer change = 99;
		ArrayList<Integer> coins = new ArrayList<Integer>();
		coins.add(25);
		coins.add(10);
		coins.add(5);
		coins.add(1);
		
		ArrayList<Integer> handover = greedy(change, coins);
		System.out.println("Change for " + change + " cents is " 
							+ handover.get(0) + " quarters, " 
							+ handover.get(1) + " dimes, " 
							+ handover.get(2) + " nickels, and "
							+ handover.get(3) + " pennies."
							);		
	}

	private static ArrayList<Integer> greedy(Integer a, ArrayList<Integer> b){
		ArrayList<Integer> retval = new ArrayList<Integer>();
		for(int i = 0; i < b.size(); i++){
			retval.add(a/b.get(i));
			a %= b.get(i);
		}
		return retval;
	}
}
