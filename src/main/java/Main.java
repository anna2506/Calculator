import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    System.out.println("Welcome to calculator! Do you want to compute a complex function?(y/n)");
    Scanner scanner = new Scanner(System.in);
    String answer = "";
    Number num1;
    Number num2;
    if(scanner.hasNext()){
      answer = scanner.next();
    }
    switch (answer){
      case "y":
        Logarithm logarithm = new Logarithm();
        logarithm.enterNum1();
        logarithm.enterNum2();
        num1 = logarithm.getNum1();
        num2 = logarithm.getNum2();
        System.out.print(logarithm.calc(num1, num2));
        break;
      case "n":
        Calculator calculator = new Calculator();
        Input input = new Input();
        num1 = input.enterNum1();
        num2 = input.enterNum2();
        char operation = input.enterOperation();
        System.out.println(calculator.calc(num1, num2, operation));
        break;
      default:
        break;
    }


  }
}