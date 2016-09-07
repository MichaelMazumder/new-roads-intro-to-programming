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
     
     System.out.println("Enter 3 Numbers: ");
     double num1 = input.nextDouble();
     double num2 = input.nextDouble();
     double num3 = input.nextDouble();
     
     double average = (num1 + num2 + num3)/3;
     
     System.out.println("This is the average " + average);
   
   }

}