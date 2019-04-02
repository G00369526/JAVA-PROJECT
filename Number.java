import java.util.Scanner;
public class Number{
  public static void main(String[] args){


    Scanner input = new Scanner(System.in);

    int a;

    System.out.print("Enter a number: ");
    a = input.nextInt();

    if(a > 0){
    System.out.println("This number is Positive.");
    }
    if(a < 0){
    System.out.println("This number is Negative.");
    }
    if(a == 0){
    System.out.println("The number is 0.");
    }
    Index.main(null);
    }
    }