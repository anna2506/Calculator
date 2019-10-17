public class Main{
  public static void main(String[] args){
    Calculator calculator = new Calculator();
    Input input = new Input();
    int num1 = input.setNum1();
    int num2 = input.setNum2();
    char operation = input.setOperation();
    System.out.println(calculator.calc(num1, num2, operation));
  }
}