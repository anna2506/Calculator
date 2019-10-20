import java.util.Scanner;

public class Exponentiation {
  static Scanner scanner;
  private Number num1;
  private Number num2;
  public Exponentiation(){
    scanner = new Scanner(System.in);
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
    System.out.println("Enter the number you want to exponate: ");
    if(scanner.hasNextInt()){
      num1 = scanner.nextInt();
    }
    else if(scanner.hasNextDouble()){
      num1 = scanner.nextDouble();
    }
    else if(scanner.hasNextLong()){
      num1 = scanner.nextLong();
    }
    else{
      System.out.println("Your input is incorrect. Please, try again.");
      scanner.next();
      num1 = enterNum1();
    }
    return num1;
  }
  public Number enterNum2(){
    System.out.println("Enter the degree of number: ");
    if(scanner.hasNextInt()){
      num2 = scanner.nextInt();
    }
    else if(scanner.hasNextDouble()){
      num2 = scanner.nextDouble();
    }
    else if(scanner.hasNextLong()){
      num2 = scanner.nextLong();
    }
    else{
      System.out.println("Your input is incorrect. Please, try again.");
      scanner.next();
      num2 = enterNum2();
    }
    return num2;
  }
  public Number calc(Number num1, Number num2){
    Number result = null;
    if(num1 instanceof Integer && num2 instanceof Integer){
      result = Math.pow(num1.intValue(), num2.intValue());
    }
    else if(num1 instanceof Double && num2 instanceof Double){
      result = Math.pow(num1.doubleValue(), num2.doubleValue());
    }
    else if(num1 instanceof Long && num2 instanceof Integer){
      result = Math.pow(num1.longValue(), num2.longValue());
    }
    else{
      System.out.println("The input error. Please, try again.");
    }
    System.out.print("The " + num1 + " in " + num2 + " degree is ");
    return result;
  }
}
