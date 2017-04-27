package test;

import org.testng.TestNG;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FourRowSolitaire.Column;

public class ColumnTest {
 
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @Test
  public void Column() {
    throw new RuntimeException("Test not implemented");
  }
  
  @Test
	public void test_type() throws Exception {
		
		assertNotNull(Column.class);
	}
  @Test
	public void test_instantiation() throws Exception {
		
		Column target = new Column();
		assertNotNull(target);
	}

  @Test
  public void isValidMoveCard() throws Exception {
		
		Column target = new Column();
		Object card = null;
		boolean actual = target.isValidMove(card);
		boolean expected = false;
		assertEquals(expected, actual);
  }

  @Test
  public void isValidMoveCardStack() throws Exception {
		
		Column target = new Column();
		Object stack = null;
		boolean actual = target.isValidMove(stack);
		boolean expected = false;
		assertEquals(expected, actual);
  }

  @Test
  public void push() throws Exception {
		
		Column target = new Column();
		Object card = null;
		Object actual = target.push(card);
		Object expected = null;
		assertEquals(expected, actual);
  }

}