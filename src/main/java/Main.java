import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    System.out.println("Welcome to calculator! Do you want to compute a complex function?(y/n)");
    Scanner scanner = new Scanner(System.in);
    String answer = "";
    Number num1;
    Number num2;
    Number num;
    if(scanner.hasNext()){
      answer = scanner.next();
    }
    switch (answer) {
      case "y":
        System.out.println("We have some options to calculate. Choose the one you want: \n" +
                "1 - Calculate the logarithm \n" +
                "2 - Calculate trigonometric functions \n" +
                "3 - Calculate the factorial");
        answer = scanner.next();
        switch (answer) {
          case "1":
            Logarithm logarithm = new Logarithm();
            logarithm.enterNum1();
            logarithm.enterNum2();
            num1 = logarithm.getNum1();
            num2 = logarithm.getNum2();
            System.out.print(logarithm.calc(num1, num2));
            break;
          case "2":
            Trigonometry trigonometry = new Trigonometry();
            String trigFunc = trigonometry.enterTrigonometryFunction();
            trigonometry.enterNum();
            num = trigonometry.getNum();
            System.out.println(trigonometry.calc(num, trigFunc));
            break;
          case "3":
            Factorial factorial = new Factorial();
            factorial.enterNum();
            num = factorial.getNum();
            System.out.println(factorial.calc(num));
            break;

          default:
            break;
        }
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