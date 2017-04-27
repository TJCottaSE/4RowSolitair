package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import FourRowSolitaire.Card;
import FourRowSolitaire.CardStack;
import FourRowSolitaire.SingleCell;

public class SingleCellTest {

	SingleCell sc = null;
	Card card1 = null;
	Card card2 = null;
	
	@BeforeClass
	public void setUp() throws Exception {
		sc = new SingleCell();
		card1 = new Card("Spades", 1, 1, 1);
		card2 = new Card("Spades", 13, 1, 13);
	}

	@AfterClass
	public void tearDown() throws Exception {
	}

	@Test
	public void testPushCard() {
		sc.push(card1);
		assertEquals(card1, sc.peek());
		assertNull(sc.push(card2));
	}

	@Test
	public void testGetCardAtLocationPoint() {
		sc.push(card1);
		assertEquals(card1, sc.getCardAtLocation(0));
	}

	@Test
	public void testIsValidMoveCard() {
		assertTrue(sc.isValidMove(card1));
		sc.push(card2);
		assertFalse(sc.isValidMove(card1));
	}

	@Test
	public void testIsValidMoveCardStack() {
		CardStack stack = new CardStack();
		stack.push(card1);
		stack.push(card2);
		assertFalse(sc.isValidMove(stack));
	}
}
