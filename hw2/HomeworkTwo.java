// Liam Carter-Condon
import java.util.Scanner;


public class HomeworkTwo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Where is your source directory?");
    String sourceDir = s.nextLine();
    System.out.println("How many Java files and non-Java files do you have in the above directory?");
    int numJava = s.nextInt();
    int numNonJava = s.nextInt();
    System.out.println("Now I know:");
    System.out.println("Your root-level directory is \"" + sourceDir.substring(0,sourceDir.indexOf('\\')) + "\"");
    System.out.println("Your leaf-level directory is \"..." + sourceDir.substring(sourceDir.lastIndexOf('\\')) + "\"");
    String[] folders = sourceDir.split("\\\\|/");
    if(folders[1].compareTo("Users") == 0 ) {
      System.out.println("Your login name is \"" + folders[2] +"\"");
    } else {
      System.out.println("Your login name is \"" + folders[1] + "\"");
    }
    System.out.println("Your \'.class files are in :\n " + sourceDir.substring(0,sourceDir.lastIndexOf('\\')) + "\\bin");
    System.out.println("You have a totla of " + (numJava + numNonJava) + " files in your source directory.");
    System.out.println("It's better that you move those " + numNonJava + " non-Java files to the \"" + folders[0] + "\\" + folders[1] + "\\" + folders[2] + "\\temp\" directory");
  }
}
