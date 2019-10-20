import java.util.Scanner;
public class Input{
  static Scanner scanner;
  private Number num1;
  private Number num2;
  private char operation;
  public Input(){
    scanner = new Scanner(System.in);
  }

  /**
   * set variable operation
   * @param operation
   */
  public void setOperation(char operation) {
    this.operation = operation;
  }
  /**
   * Set the variable num1
   * @param num1
   */
  public void setNum1(Number num1) {
    this.num1 = num1;
  }

  /**
   * Set the variable num2
   * @param num2
   */
  public void setNum2(Number num2) {
    this.num2 = num2;
  }

  public Number getNum1(){
    return num1;
  }
  public Number getNum2(){
    return num2;
  }
  public Number enterNum1(){
    System.out.println("Enter the first number: ");
    if(scanner.hasNextInt()){
      num1 = scanner.nextInt();
    }
    else if(scanner.hasNextDouble()){
      num1 = scanner.nextDouble();
    }
    else{
      System.out.println("Your input is incorrect. Please, try again.");
      scanner.next();
      num1 = enterNum1();
    }
    return num1;
  }
  public Number enterNum2(){
    System.out.println("Enter the second number: ");
    if(scanner.hasNextInt()){
      num2 = scanner.nextInt();
    }
    else if(scanner.hasNextDouble()){
      num2 = scanner.nextDouble();
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