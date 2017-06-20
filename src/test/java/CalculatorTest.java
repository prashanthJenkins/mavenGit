import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

  private MyCalculator classUnderTest;
  
  float numb1 =7;
  private static final double DELTA = 1e-15;

  @Before
  public void setUp() throws Exception {
    this.classUnderTest = new MyCalculator();
  }

  @After
  public void tearDown() throws Exception {
    classUnderTest = null;
  }

  
@Test
  public void testAdd_positiveNumbers_shouldReturnResult() {
    assertEquals(numb1, MyCalculator.add(3,4),DELTA);
  }

  @Test
  public void testAdd_negativeNumbers_shouldThrowException() {
	  assertEquals(-7, MyCalculator.add(-3,-4),DELTA);
  }

  @Test
  public void testSubstract() {
    assertEquals(2, MyCalculator.substract(5, 3),DELTA);
  }

}