import java.util.Scanner;

public class Two{
  public static void main(String[] args){

  int num1, num2;


  Scanner s = new Scanner(System.in);

  System.out.print("Enter first number: ");
  num1 = s.nextInt();

  System.out.print("Enter second number: ");
  num2 = s.nextInt();

  if(num1 == 2 && num2 == 2){
  System.out.println("Both numbers are equal to 2.");
  }

  else if(num1 == 2 || num2 == 2){
  System.out.println("One of the numbers is equal to 2.");
  }

  if(num1 == 2){
  System.out.println("First number is equal to 2.");
  }

  else if(num2 == 2){
  System.out.println("Second number is equal to 2.");
  }

  else{
  System.out.println("Neither number is equal to 2");
  }
  Index.main(null);
  }
  }