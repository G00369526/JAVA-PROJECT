import java.util.Scanner;

public class NameAge{
  public static void main(String[] args){

  Scanner s = new Scanner(System.in);

  String name;
  int age;

  System.out.print("Enter your name: ");
  name = s.nextLine();

  System.out.print("Enter your age: ");
  age = s.nextInt();


  for(int counter = 1; counter <= age; counter++){

  System.out.println(counter+". "+name+"");
  }
  Index.main(null);
  }
  }