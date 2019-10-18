public class Calculator {
  Input input = new Input();
  int num1;
  int num2;
  char operation;
  public int getNum1() {
    return num1;
  }

  public void setNum1(int num1) {
    this.num1 = num1;
  }

  public int getNum2() {
    return num2;
  }

  public void setNum2(int num2) {
    this.num2 = num2;
  }

  public char getOperation() {
    return operation;
  }

  public void setOperation(char operation) {
    this.operation = operation;
  }


  public Calculator()
  {
    this.num1 = input.getNum1();
    this.num2 = input.getNum2();
    this.operation = input.getOperation();
  }
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
  public int addition(int num1, int num2){
    return num1 + num2;
  }
  public int substraction(int num1, int num2){
    return num1 - num2;
  }
  public int multiplication(int num1, int num2){
    return num1 * num2;
  }
  public int division(int num1, int num2){
    if (num2 != 0){
      return num1 / num2;
    }
    else{
      System.out.println("Division by zero!");
      return num1;
    }
  }
}