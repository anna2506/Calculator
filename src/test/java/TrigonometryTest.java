import org.junit.Assert;
import org.junit.Test;



public class TrigonometryTest {
  @Test
  public void setNum1() {
    Number num1 = 10;
    Trigonometry trigonometry = new Trigonometry();
    trigonometry.setNum(num1);
    Assert.assertEquals(trigonometry.getNum(), num1);
  }
  @Test
  public void getNum1() {
    Trigonometry trigonometry = new Trigonometry();
    Number expNum1 = 10;
    trigonometry.setNum(10);
    Number num1 = trigonometry.getNum();
    Assert.assertEquals(expNum1, num1);
  }
  @Test
  public void calc(){
    Trigonometry trigonometry = new Trigonometry();
    Number num = 45;
    String trigFunc = "sin";
    Assert.assertEquals(trigonometry.calc(num, trigFunc), Math.sin(45));
  }

}