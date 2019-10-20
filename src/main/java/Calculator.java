import java.sql.PreparedStatement;

public class Calculator{
  Input input = new Input();
  Number num1;
  Number num2;
  char operation;
  /**
   * getting variable num1
   * @return
   */
  public Number getNum1() {
    return num1;
  }

  /**
   * set variable num1
   * @param num1
   */
  public void setNum1(Number num1) {
    this.num1 = num1;
  }

  /**
   * getting variable num2
   * @return
   */
  public Number getNum2() {
    return num2;
  }

  /**
   * set variable num2
   * @param num2
   */
  public void setNum2(Number num2) {
    this.num2 = num2;
  }

  /**
   * getting variable operation
   */
  public char getOperation() {
    return operation;
  }

  /**
   * set variable operation
   * @param operation
   */
  public void setOperation(char operation) {
    this.operation = operation;
  }

/**
 * constructor
 */
  public Calculator()
  {
    this.num1 = input.getNum1();
    this.num2 = input.getNum2();
    this.operation = input.getOperation();
  }

  /**
   * calculating num1 and num2 with an operation
   * @param num1
   * @param num2
   * @param operation
   * @return
   */
  public Number calc(Number num1, Number num2, char operation){
    Number result = null;
    switch (operation){
      case '+':
        result = addition(num1, num2);
        break;
      case '-':
        result = substraction(num1, num2);
        break;
      case '*':
        result = multiplication(num1, num2);
        break;
      case '/':
        result = division(num1, num2);
        break;
      default:
        System.out.println("Operation is not defined. Please, try again..");
        result = calc(num1, num2, input.getOperation());
    }
    System.out.print("The result of " + num1 + operation + num2 + " is ");
    return result;
  }

  public Number addition(Number num1, Number num2) {
    Number result = 0;
    if(num1 instanceof Integer && num2 instanceof Integer)
    {
      result = num1.intValue() + num2.intValue();
      return result;
    }
    else if(num1 instanceof Double && num2 instanceof Double){
     result = num1.doubleValue() + num2.doubleValue();

    }
    else{
      System.out.println("Your input is incorrect.Please, try again");
    }
    return result;
  }
  public Number substraction(Number num1, Number num2){
    Number result = 0;
    if(num1 instanceof Integer && num2 instanceof Integer)
    {
      result = num1.intValue() - num2.intValue();
      return result;
    }
    else if(num1 instanceof Double && num2 instanceof Double){
      result = num1.doubleValue() - num2.doubleValue();

    }
    else{
      System.out.println("Your input is incorrect.Please, try again");
    }
    return result;
  }
  public Number multiplication(Number num1, Number num2){
    Number result = 0;
    if(num1 instanceof Integer && num2 instanceof Integer)
    {
      result = num1.intValue() * num2.intValue();
      return result;
    }
    else if(num1 instanceof Double && num2 instanceof Double){
      result = num1.doubleValue() * num2.doubleValue();

    }
    else{
      System.out.println("Your input is incorrect.Please, try again");
    }
    return result;
  }
  public Number division(Number num1, Number num2){
    Number result = 0;
    if(num1 instanceof Integer && num2 instanceof Integer)
    {
      if(num1.intValue() != 0) {
        result = num1.intValue() / num2.intValue();
        return result;
      }
      else{
        System.out.println("Division by zero!");
        return num1.intValue();
      }
    }
    else if(num1 instanceof Double && num2 instanceof Double){
      if(num1.intValue() != 0.0) {
        result = num1.intValue() / num2.intValue();
        return result;
      }
      else{
        System.out.println("Division by zero!");
        return num1.intValue();
      }

    }
    else{
      System.out.println("Your input is incorrect.Please, try again");
    }
    return result;
  }
}