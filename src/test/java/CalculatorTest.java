import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {


  @Test
  public void getNum1() {
    Calculator calculator = new Calculator();
    int expNum1 = 10;
    calculator.setNum1(10);
    int num1 = calculator.getNum1();
    Assert.assertEquals(expNum1, num1);
  }

  @Test
  public void setNum1() {
    int num1 = 10;
    Calculator calculator = new Calculator();
    calculator.setNum1(num1);
    Assert.assertEquals(calculator.getNum1(), num1);
  }

  @Test
  public void getNum2() {
    Calculator calculator = new Calculator();
    int expNum2 = 10;
    calculator.setNum2(10);
    int num2 = calculator.getNum2();
    Assert.assertEquals(expNum2, num2);
  }

  @Test
  public void setNum2() {
    int num2 = 10;
    Calculator calculator = new Calculator();
    calculator.setNum2(num2);
    Assert.assertEquals(calculator.getNum2(), num2);
  }

  @Test
  public void getOperation() {
    Calculator calculator = new Calculator();
    char expOperation = '+';
    calculator.setOperation('+');
    char operation = calculator.getOperation();
    Assert.assertEquals(expOperation, operation);
  }

  @Test
  public void setOperation() {
    char operation = '+';
    Calculator calculator = new Calculator();
    calculator.setOperation(operation);
    Assert.assertEquals(calculator.getOperation(), operation);
  }

  @Test
  public void addition() {
    Calculator calculator = new Calculator();
    int num1 = 5;
    int num2 = 3;
    calculator.setNum1(num1);
    calculator.setNum2(num2);
    int result = calculator.addition(calculator.getNum1(), calculator.getNum2());
    Assert.assertEquals(result, num1 + num2);
  }

  @Test
  public void substraction() {
    Calculator calculator = new Calculator();
    int num1 = 5;
    int num2 = 3;
    calculator.setNum1(num1);
    calculator.setNum2(num2);
    int result = calculator.substraction(calculator.getNum1(), calculator.getNum2());
    Assert.assertEquals(result, num1 - num2);
  }

  @Test
  public void multiplication() {
    Calculator calculator = new Calculator();
    int num1 = 5;
    int num2 = 3;
    calculator.setNum1(num1);
    calculator.setNum2(num2);
    int result = calculator.multiplication(calculator.getNum1(), calculator.getNum2());
    Assert.assertEquals(result, num1 * num2);
  }

  @Test
  public void division() {
    Calculator calculator = new Calculator();
    int num1 = 5;
    int num2 = 3;
    calculator.setNum1(num1);
    calculator.setNum2(num2);
    int result = calculator.division(calculator.getNum1(), calculator.getNum2());
    Assert.assertEquals(result, num1 / num2);
  }
  @Test
  public void calc(){
    Calculator calculator = new Calculator();
    char operation = '+';
    int num1 = 2;
    int num2 = 6;
    calculator.setNum1(num1);
    calculator.setNum2(num2);
    calculator.setOperation(operation);
    int result = calculator.addition(calculator.getNum1(), calculator.getNum2());
    Assert.assertEquals(result, calculator.calc(num1, num2, operation));
  }
}
