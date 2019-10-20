import org.junit.Assert;
import org.junit.Test;

public class ExponentiationTest {


  @Test
  public void setNum1() {
    Number num1 = 10;
    Exponentiation exponentiation = new Exponentiation();
    exponentiation.setNum1(num1);
    Assert.assertEquals(exponentiation.getNum1(), num1);
  }

  @Test
  public void setNum2() {
    Number num2 = 10;
    Exponentiation exponentiation = new Exponentiation();
    exponentiation.setNum2(num2);
    Assert.assertEquals(exponentiation.getNum2(), num2);
  }

  @Test
  public void getNum1() {
    Exponentiation exponentiation = new Exponentiation();
    Number expNum1 = 10;
    exponentiation.setNum1(10);
    Number num1 = exponentiation.getNum1();
    Assert.assertEquals(expNum1, num1);
  }

  @Test
  public void getNum2() {
    Exponentiation exponentiation = new Exponentiation();
    Number expNum2 = 10;
    exponentiation.setNum2(10);
    Number num2 = exponentiation.getNum2();
    Assert.assertEquals(expNum2, num2);
  }

  @Test
  public void calc() {
    Exponentiation exponentiation = new Exponentiation();
    Number num1 = 6;
    Number num2 = 2;
    exponentiation.setNum1(num1);
    exponentiation.setNum2(num2);
    Assert.assertEquals(exponentiation.calc(num1, num2), 36.0);
  }
}
