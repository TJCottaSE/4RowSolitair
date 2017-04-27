package test;

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
	
	@Test
	public void testPush(){
		assertEquals(col.push(black_K), black_K);
		col.push(black_K);
		assertNull(col.push(black_Q));
		assertNull(col.push(red_10));
	}
	
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
	
	@BeforeMethod
	@BeforeClass
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
	@AfterClass
	public void tearDown() throws Exception {
		
		black_K = null;
		black_J = null;
		red_Q = null;
		red_10 = null;
		black_Q = null;
		col = null;
		stack = null;
		
	}


}