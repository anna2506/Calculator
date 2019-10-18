import java.util.Scanner;
public class Input{
  static Scanner scanner;
  private int num1;
  private int num2;
  private char operation;
  public Input(){

    scanner = new Scanner(System.in);
  }

  public void setOperation(char operation) {
    this.operation = operation;
  }

  public void setNum1(int num1) {
    this.num1 = num1;
  }

  public void setNum2(int num2) {
    this.num2 = num2;
  }

  public void enterOperation(char operation) {
    this.operation = operation;
  }

  public int getNum1(){
    return num1;
  }
  public int getNum2(){
    return num2;
  }
  public int enterNum1(){
    System.out.println("Enter the first number: ");
    if(scanner.hasNextInt()){
      num1 = scanner.nextInt();
    }
    else{
      System.out.println("Your input is incorrect. Please, try again.");
      scanner.next();
      num1 = enterNum1();
    }
    return num1;
  }
  public int enterNum2(){
    System.out.println("Enter the second number: ");
    if(scanner.hasNextInt()){
      num2 = scanner.nextInt();
    }
    else{
      System.out.println("Your input is incorrect. Please, try again.");
      scanner.next();
      num2 = enterNum2();
    }
    return num2;
  }
  public char enterOperation(){
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