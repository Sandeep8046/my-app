package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;

public class AppTest{
	
	@Test
	public void shouldAnswerWithTrue() {
		assertTrue( true );
    
  }
    
	@Test
	public void add_TwoPlusTwo_ReturnsFour() {
		final int expected = 4;
		final int actual = App.add(2, 2);
		Assert.assertEquals(expected, actual);
		
  }
  
  @Test
  public void subtract_FourMinusTwo_ReturnsTwo() {
    final int expected = 2;
    final int actual = App.subtract(4, 2);
    Assert.assertEquals(expected, actual);
    	
  }
  
  @Test
  public void multiply_FourTimesTwo_ReturnsEight() {
    final int expected = 8;
    final int actual = App.multiply(4, 2);
    Assert.assertEquals(expected, actual);
  
  }
  
  @Test
  public void multiply_FiftyTimesTwo_ReturnsOneHundred() {
    final int expected = 100;
    final int actual = App.multiply(50, 2);
    Assert.assertEquals(actual, expected);
  }
  
  @Test
  public void divide_TenDividedTwo_ReturnsFive() {
    final int expected = 5;
    final int actual = App.divide(10, 2);
    Assert.assertEquals(expected, actual);
  }
}