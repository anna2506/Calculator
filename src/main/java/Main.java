public class Main{
  public static void main(String[] args){
    Calculator calculator = new Calculator();
    Input input = new Input();
    Number num1 = input.enterNum1();
    Number num2 = input.enterNum2();
    char operation = input.enterOperation();
    System.out.println(calculator.calc(num1, num2, operation));

  }
}