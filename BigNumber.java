import java.util.Scanner;

public class BigNumber{
 public static void main(String []args){

 Scanner x = new Scanner(System.in);

 int a;

 System.out.print("Enter a number: ");
 a = x.nextInt();

 if(a > 1000000){
 System.out.println("That is a big number.");
 }
 else{
	 System.out.println("There is a bigger number than that!");
 }

 Index.main(null);
 }
 }