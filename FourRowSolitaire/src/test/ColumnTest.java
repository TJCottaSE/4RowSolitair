package test;

import org.testng.TestNG;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.AssertJUnit;
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

import FourRowSolitaire.Card;
import FourRowSolitaire.CardStack;
import FourRowSolitaire.Column;
import FourRowSolitaire.SingleCell;

public class ColumnTest extends CardStack {
	
	
	private final ArrayList<Card> cards = new ArrayList<Card>();
	

	ColumnTest sc = null;
	Card card1 = null;
	Card card2 = null;
	CardStack stack = new CardStack();

	
	Card cardPop = stack.pop();
	Card cardPeek = stack.peek();
	Card cardPush = sc.push();
 
	@BeforeMethod
	public void setUp() throws Exception {
		sc = new ColumnTest();
		card1 = new Card("Spades", 1, 1, 1);
		card2 = new Card("Spades", 13, 1, 13);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		sc = null;
		card1 = null;
		card2 = null;
	}

  @Test
  public void Column() throws Exception {
    assertNotNull(Column.class);
    Column target = new Column();
	assertNotNull(target);
  }
  
  @Test
  public void push() throws Exception {
	  sc.isEmpty();
	  sc.KING = sc.getNumber(); 
	  sc.push(card1);
	  assertEquals(card1, sc.peek());
	  assertNull(sc.push(card2));
	
	  
		//Column target = new Column();
		//Object card = null;
		//Object actual = target.push(card);
		//Object expected = null;
		//assertEquals(expected, actual);
  }
 
  @Test
  public void isValidMoveCard() throws Exception {
	  
	  sc.push(card1);
	  sc.push(card2);
	  assertFalse(sc.isValidMove(card1));
	  sc.isEmpty();
	  //assertTrue(sc.isValidMove(card1));
	  
	  Column target = new Column();
	  card1 = KING;
	  boolean actual = target.isValidMove(card1);
	  boolean expected = false;
	  assertEquals(expected, actual);
  }

  @Test
  public void isValidMoveCardStack() throws Exception {
		
		CardStack stack = new CardStack();
		stack.push(card1);
		stack.push(card2);
		stack.peek();
		assertFalse(sc.isValidMove(stack));
		
		//@Override
	    //public boolean isValidMove(CardStack stack)
	    //{
	        //return isValidMove(stack.peek());
	    //}
	
	  
		//Column target = new Column();
		//Object stack = null;
		//boolean actual = target.isValidMove(stack);
		//boolean expected = false;
		//assertEquals(expected, actual);
  }

}