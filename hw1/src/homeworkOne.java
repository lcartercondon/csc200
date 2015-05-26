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
		Scanner in = new Scanner(System.in);
		String[] names = in.nextLine().split(";");
		ArrayList<Integer> heights = new ArrayList<Integer>();
		heights.add(new Integer(in.nextInt()), new Integer(in.nextInt()));
		ArrayList<ArrayList<Integer>> feetInches = new ArrayList<ArrayList<Integer>>();
		ArrayList<Double> centimeters = new ArrayList<Double>();
		for(Integer i: heights) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(i/12);
			temp.add(i%12);
			feetInches.add(temp);
			centimeters.add(i * 2.54);
		}
		for(int i = 0; i < names.length; i++){
			Integer feet = feetInches.get(i).get(0);
			Integer inches = feetInches.get(i).get(1);
			System.out.println(names[i] + " is " + 
					(feet==0?"":feet + (feet==1?" foot":" feet") + " and ") + 
					inches + (inches==1?" inch":" inches") + " tall (" +
					centimeters.get(i) + " cm).");
		}
		int difference = Math.abs(heights.get(0)-heights.get(1));
		System.out.println("The height difference between them is " + difference + " inches (" + 
				difference*2.54 + " cm).");
		in.close();
	}
}
