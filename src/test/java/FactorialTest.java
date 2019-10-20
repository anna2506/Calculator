
import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {


  @Test
  public void getNum() {
    Number num = 10;
    Factorial factorial = new Factorial();
    factorial.setNum(num);
    Assert.assertEquals(factorial.getNum(), num);
  }

  @Test
  public void setNum() {
    Factorial factorial = new Factorial();
    Number expNum = 10;
    factorial.setNum(10);
    Number num = factorial.getNum();
    Assert.assertEquals(expNum, num);
  }

  @Test
  public void calc() {
    Factorial factorial = new Factorial();
    int num = 5;
    factorial.setNum(num);
    Assert.assertEquals(factorial.calc(num), 120);
  }
}
