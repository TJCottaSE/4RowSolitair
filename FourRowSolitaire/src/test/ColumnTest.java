package test;
/**
 * Test the column class for defects
 * @author Nolan Miller, Tony Cotta
 */
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.*;

import FourRowSolitaire.Card;
import FourRowSolitaire.CardStack;
import FourRowSolitaire.Column;

public class ColumnTest{
	
	Card black_K, black_Q, red_Q, black_J, red_10;
	CardStack stack;
	Column col;
	
	@BeforeMethod
	public void setUp() throws Exception {
		black_K = new Card("Spades", 13, 1, 1);
		black_J = new Card("Spades", 11, 1, 2);
		red_Q = new Card("Hearts", 12, 1, 3);
		red_10 = new Card("Diamonds", 10, 1, 4);
		black_Q = new Card("Clubs", 12, 1, 5);
		col = new Column();
		stack = new CardStack();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		black_K = null;
		black_J = null;
		red_Q = null;
		red_10 = null;
		black_Q = null;
		col = null;
		stack = null;
	}

	/**
	 * Test whether a stack to a column is a valid move, compares top card
	 */
	@Test
	public void testStackIsValidMove(){
		
		stack.push(black_K);
		
		assertTrue(col.isValidMove(stack));
		
		stack.pop();
		stack.push(red_Q);
		assertFalse(col.isValidMove(stack));
		
		col.push(black_K);
		assertTrue(col.isValidMove(stack));
		
	}
	
	/**
	 * Tests push method, whether or not a card can go to a column
	 */
	@Test
	public void testPush(){
		
		assertEquals(col.push(black_K), black_K);
		col.push(black_K);
		assertNull(col.push(black_Q));
		assertNull(col.push(red_10));
		assertEquals(col.push(red_Q), red_Q);
	}
	
	/**
	 * Test if a card to column is a valid move
	 */
	@Test
	public void testIsValidMove(){
		
		assertTrue(col.isValidMove(black_K));
		col.push(black_K);
		assertTrue(col.isValidMove(red_Q));
		col.push(red_Q);
		assertTrue(col.isValidMove(black_J));
		col.push(black_J);
		assertTrue(col.isValidMove(red_10));
		col.push(red_10);
		
		assertFalse(col.isValidMove(black_K));
		assertFalse(col.isValidMove(red_10));	
	}
	
	/**
	 * Test getting the available cards in the column
	 */
	@Test
	public void testGetAvailableCards(){

		Card card1 = new Card("Spades", 1, 1, 1);
		Card card2 = new Card("Spades", 2, 1, 2);
		Card card3 = new Card("Spades", 3, 1, 3);
		Card card4 = new Card("Hearts", 10, 1, 40);
		col.addCard(card1);
		col.addCard(card2);
		col.addCard(card3);
		col.addCard(card4);
		
		CardStack newStack = col.getAvailableCards();
		assertEquals(newStack.pop().getFullNumber(), card4.getFullNumber());
	}
}

