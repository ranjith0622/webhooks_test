import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  
  @Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(6, sum);
    System.out.println("------TEST Ok-------");
  }

   @Test
  public void evaluatesExpression2() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+3");
    assertEquals(4, sum);
    System.out.println("------TEST Ok-------");
  }
  @Test
  public void evaluatesExpression3() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+3");
    assertEquals(4, sum);
    System.out.println("------TEST Ok-------");
  }

}
