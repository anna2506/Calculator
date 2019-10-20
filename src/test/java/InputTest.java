import org.junit.Assert;
import org.junit.Test;


public class InputTest {

  @Test
  public void getNum1() {
    Input input = new Input();
    Number expNum1 = 10;
    input.setNum1(10);
    Number num1 = input.getNum1();
    Assert.assertEquals(expNum1, num1);

  }

  @Test
  public void getNum2() {
    Input input = new Input();
    Number expNum2 = 10;
    input.setNum2(10);
    Number num2 = input.getNum2();
    Assert.assertEquals(expNum2, num2);
  }

  @Test
  public void setNum1() {
    int num1 = 10;
    Input input = new Input();
    input.setNum1(num1);
    Assert.assertEquals(input.getNum1(), num1);
  }

  @Test
  public void setNum2() {
    int num2 = 10;
    Input input = new Input();
    input.setNum2(num2);
    Assert.assertEquals(input.getNum2(), num2);
  }

  @Test
  public void setOperation() {
    char operation = '+';
    Input input = new Input();
    input.setOperation(operation);
    Assert.assertEquals(input.getOperation(), operation);
  }

  @Test
  public void getOperation() {
    Input input = new Input();
    char expOperation = '+';
    input.setOperation('+');
    char operation = input.getOperation();
    Assert.assertEquals(expOperation, operation);
  }
}
