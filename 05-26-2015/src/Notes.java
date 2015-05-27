import java.util.Scanner;

/**
 * 
 */

/**
 * @author Liam Carter-Condon
 *
 */
public class Notes {

	/**
	 * @category parsing strings
	 */
	public static void main(String[] args) {
		String str = "I have finished program #1, and I will finish program #2 tonight!";
		System.out.println("Please type in a string with a comma in it!");
		Scanner s1 = new Scanner(System.in);
		str = s1.nextLine();
		String first = str.substring(0, str.indexOf(",")).replace(",", "");
		System.out.println(first);
		String second = str.substring(str.indexOf(",")+2);
		System.out.println(second);		
	}

}
