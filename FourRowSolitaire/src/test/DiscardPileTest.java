package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.awt.Graphics;
import java.awt.Point;

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

import FourRowSolitaire.DiscardPile;

public class DiscardPileTest {

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @Test
  public void DiscardPile() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void addCard() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void addStack() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getCardAtLocation() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getNumViewableCards() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void isValidMoveCard() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void isValidMoveCardStack() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void paint() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void pop() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void pushCard() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void pushCardStack() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void setDrawCount() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void setView() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void undoPop() {
    throw new RuntimeException("Test not implemented");
  }
  
  @Test
	public void test_type() throws Exception {
		
		assertNotNull(DiscardPile.class);
	}
  @Test
	public void test_instantiation() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		assertNotNull(target);
	}
  @Test
	public void test_getNumViewableCards_A$() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		int actual = target.getNumViewableCards();
		int expected = 0;
		assertEquals(expected, actual);
	}
  @Test
	public void test_setView_A$int() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		int numViewableCards = 0;
		target.setView(numViewableCards);
	}
  @Test
	public void test_addCard_A$Object() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Object card = null;
		target.addCard(card);
	}
  @Test
	public void test_addStack_A$Object() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Object stack = null;
		target.addStack(stack);
	}
  @Test
	public void test_push_Object() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Object card = null;
		Object actual = target.push(card);
		Object expected = null;
		assertEquals(expected, actual);
	}
  @Test
	public void test_push_A$Object() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Object stack = null;
		Object actual = target.push(stack);
		Object expected = null;
		assertEquals(expected, actual);
	}
  @Test
	public void test_pop_A$() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Object actual = target.pop();
		Object expected = null;
		assertEquals(expected, actual);
	}
  @Test
	public void test_undoPop_A$() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Object actual = target.undoPop();
		Object expected = null;
		assertEquals(expected, actual);
	}
  @Test
	public void test_getCardAtLocation_A$Point() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Point p = null;
		Object actual = target.getCardAtLocation(p);
		Object expected = null;
		assertEquals(expected, actual);
	}
  @Test
	public void test_isValidMove_Object() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Object card = null;
		boolean actual = target.isValidMove(card);
		boolean expected = false;
		assertEquals(expected, actual);
	}
  @Test
	public void test_isValidMove_A$Object() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Object stack = null;
		boolean actual = target.isValidMove(stack);
		boolean expected = false;
		assertEquals(expected, actual);
	}
  @Test
	public void test_paint_A$Graphics() throws Exception {
		
		int draw = 0;
		DiscardPile target = new DiscardPile(draw);
		Graphics g = null;
		target.paint(g);
	}
}
