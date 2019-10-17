public class Calculator {
  Input input = new Input();
  int num1 = input.getNum1();
  int num2 = input.getNum2();
  char operation = input.getOperation();
  public int calc(int num1, int num2, char operation){
    int result = 0;
    switch (operation){
      case '+':
        result = addition(num1, num2);
        break;
      case '-':
        result =substraction(num1, num2);
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
  private int addition(int num1, int num2){
    return num1 + num2;
  }
  private int substraction(int num1, int num2){
    return num1 - num2;
  }
  private int multiplication(int num1, int num2){
    return num1 * num2;
  }
  private int division(int num1, int num2){
    if (num2 != 0){
      return num1 / num2;
    }
    else{
      System.out.println("Division by zero!");
      return num1;
    }
  }
}