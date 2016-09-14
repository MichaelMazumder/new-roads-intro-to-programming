import java.util.Scanner;

public class Average{
  
  //this is where the main method 
  //where the application starts
   public static void main(String[] args){
     /*this are examples of data types 
     int x = 3;
     double number = 3.0;
     String word = "lskjdlk!!";
     char letter = 'x';*/
     
     Scanner input = new Scanner(System.in);
     
     System.out.println("This is a Pythagorean Theorem calculator.");
     System.out.println("Enter side lengths of a and b to receive the lenth of the hypotenuse.: ");
     System.out.println("a^2+b^2=c^2");
     double num1 = input.nextDouble();
     double num2 = input.nextDouble();
     
     double multiplication = (Math.sqrt((num1) * (num1) + (num2) * (num2)));
     
     System.out.println("Side c equals: " + multiplication);

   
   }

}