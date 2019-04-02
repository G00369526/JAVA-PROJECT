import java.util.Scanner;

public class ForLoops{
  public static void main(String[] args){

  Scanner s = new Scanner(System.in);

  int num = 0;
  int sum = 0;

  for(int counter = 1; counter <= 10; counter++){
	  System.out.print("Enter number "+counter+": ");
	  num = s.nextInt();

	  if(num % 2 != 0){
		  sum += num;
	  }}

  System.out.println("Sum of odd numbers is "+sum);

  Index.main(null);
  }
  }