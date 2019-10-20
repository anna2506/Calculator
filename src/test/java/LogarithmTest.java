
import org.junit.Assert;
import org.junit.Test;



public class LogarithmTest {


  @Test
  public void setNum1() {
    Number num1 = 10;
    Logarithm logarithm = new Logarithm();
    logarithm.setNum1(num1);
    Assert.assertEquals(logarithm.getNum1(), num1);
  }

  @Test
  public void setNum2() {
    Number num2 = 7.0;
    Logarithm logarithm = new Logarithm();
    logarithm.setNum2(num2);
    Assert.assertEquals(logarithm.getNum2(), num2);
  }

  @Test
  public void getNum1() {
    Logarithm logarithm = new Logarithm();
    Number expNum1 = 10;
    logarithm.setNum1(10);
    Number num1 = logarithm.getNum1();
    Assert.assertEquals(expNum1, num1);

  }

  @Test
  public void getNum2() {
    Logarithm logarithm = new Logarithm();
    Number expNum2 = 10;
    logarithm.setNum2(10);
    Number num2 = logarithm.getNum2();
    Assert.assertEquals(expNum2, num2);
  }

  @Test
  public void calc() {
    Logarithm logarithm = new Logarithm();
    Number num1 = 4;
    Number num2 = 2;
    logarithm.setNum1(num1);
    logarithm.setNum2(num2);
    Assert.assertEquals(logarithm.calc(num1, num2), 2.0);
  }
}
