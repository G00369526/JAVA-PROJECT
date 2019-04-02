import java.util.Scanner;

public class Index{
  public static void main(String[] args){

  Scanner s = new Scanner(System.in);

  System.out.println("---------------");
  System.out.println("      MENU     ");
  System.out.println("---------------");
  System.out.println();
  System.out.println("1. Lisa.java ");
  System.out.println("2. BigNumber.java ");
  System.out.println("3. Number.java ");
  System.out.println("4. Two.java ");
  System.out.println("5. NameAge.java ");
  System.out.println("6. ForLoops.java ");
  System.out.println("7. Months.java ");
  System.out.println("8. Cards.java ");
  System.out.println("9. EXIT ");
  System.out.println("<Choose option 1-9>");
  int choice = s.nextInt();



  if(choice == 1){
	  Lisa.main(null);
  }

  else if(choice == 2){
  	  BigNumber.main(null);
  }

  else if(choice == 3){
  	  Number.main(null);
  }

  else if(choice == 4){
  	  Two.main(null);
  }

  else if(choice == 5){
  	  NameAge.main(null);
  }

  else if(choice == 6){
  	  ForLoops.main(null);
  }

  else if(choice == 7){
      Months.main(null);
  }

  else if(choice == 8){
      Cards.main(null);
  }

  else if(choice == 9)
  System.exit(0);

  else{
	  System.out.print("Incorrect Choice (1-9 ONLY)");
  }



  }
  }