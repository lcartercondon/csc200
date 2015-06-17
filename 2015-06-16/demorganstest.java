import java.util.Scanner;

public class demorganstest{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int score = in.nextInt();
    String grade = "";
    if(score >= 90)
      grade = "A";
    else if( !(score < 80) )
      grade = "B";
    else if( !(score < 70) ) 
      grade = "C";
    else if( !(score < 60) )
      grade = "D";
    else 
      grade = "F";
    System.out.println("Your grade is: " + grade );

  }
}

