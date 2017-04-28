package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;

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

import FourRowSolitaire.DealDeck;

public class DealDeckTest {

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @Test
  public void DealDeck() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getCardAtLocation() throws Exception {
		
		Object discard = null;
		int drawCount = 0;
		DealDeck target = new DealDeck(discard, drawCount);
		Point p = null;
		Object actual = target.getCardAtLocation(p);
		Object expected = null;
		assertEquals(expected, actual);
  }

  @Test
  public void getDeckThroughs() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void hasDealsLeft() throws Exception {
		
		Object discard = null;
		int drawCount = 0;
		DealDeck target = new DealDeck(discard, drawCount);
		boolean actual = target.hasDealsLeft();
		boolean expected = false;
		assertEquals(expected, actual);
  }

  @Test
  public void isValidMoveCard() throws Exception {
		
		Object discard = null;
		int drawCount = 0;
		DealDeck target = new DealDeck(discard, drawCount);
		Object card = null;
		boolean actual = target.isValidMove(card);
		boolean expected = false;
		assertEquals(expected, actual);
  }

  @Test
  public void isValidMoveCardStack() throws Exception {
		
		Object discard = null;
		int drawCount = 0;
		DealDeck target = new DealDeck(discard, drawCount);
		Object stack = null;
		boolean actual = target.isValidMove(stack);
		boolean expected = false;
		assertEquals(expected, actual);
  }

  @Test
  public void pop() throws Exception {
		
		Object discard = null;
		int drawCount = 0;
		DealDeck target = new DealDeck(discard, drawCount);
		Object actual = target.pop();
		Object expected = null;
		assertEquals(expected, actual);
  }

  @Test
  public void reset() throws Exception {
		
		Object discard = null;
		int drawCount = 0;
		DealDeck target = new DealDeck(discard, drawCount);
		target.reset();
	
  }

  @Test
  public void setDeck() throws Exception {
		
		Object discard = null;
		int drawCount = 0;
		DealDeck target = new DealDeck(discard, drawCount);
		LinkedList<Object> cards = null;
		target.setDeck(cards);
  }

  @Test
  public void setDeckThroughs() throws Exception {
		
		Object discard = null;
		int drawCount = 0;
		DealDeck target = new DealDeck(discard, drawCount);
		int actual = target.getDeckThroughs();
		int expected = 0;
		assertEquals(expected, actual);
  }
  

  @Test
  public void setDifficulty() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void setDrawCount() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void undoPop() throws Exception {
		
		Object discard = null;
		int drawCount = 0;
		DealDeck target = new DealDeck(discard, drawCount);
		target.undoPop();
  }

  @Test
  public void undone() {
    throw new RuntimeException("Test not implemented");
  }
 
}