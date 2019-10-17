import java.util.Scanner;
public class Input{
  Scanner scanner;
  public Input(){
    scanner = new Scanner(System.in);
  }
  private  int num1;
  private int num2;
  private char operation;
  public int getNum1(){
    return num1;
  }
  public int getNum2(){
    return num2;
  }
  public int setNum1(){
    System.out.println("Enter the first number: ");
    if(scanner.hasNextInt()){
      num1 = scanner.nextInt();
    }
    else{
      System.out.println("Your input is incorrect. Please, try again.");
      scanner.next();
      num1 = setNum1();
    }
    return num1;
  }
  public int setNum2(){
    System.out.println("Enter the second number: ");
    if(scanner.hasNextInt()){
      num2 = scanner.nextInt();
    }
    else{
      System.out.println("Your input is incorrect. Please, try again.");
      scanner.next();
      num2 = setNum2();
    }
    return num2;
  }
  public char setOperation(){
    System.out.println("Enter an operation:");
    if(scanner.hasNext()){
      operation = scanner.next().charAt(0);
    }
    else {
      System.out.println("Your input is incorrect. Please, try again.");
      scanner.next();
      operation = getOperation();
    }
    return operation;
  }
  public char getOperation(){
    return operation;
  }

}