package test;
/**
 * This test class tests the SingleCell class
 * @author Tony Cotta
 */
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import FourRowSolitaire.Card;
import FourRowSolitaire.CardStack;
import FourRowSolitaire.SingleCell;

public class SingleCellTest {

	SingleCell sc = null;
	Card card1 = null;
	Card card2 = null;

	@BeforeMethod
	public void setUp() throws Exception {
		sc = new SingleCell();
		card1 = new Card("Spades", 1, 1, 1);
		card2 = new Card("Spades", 13, 1, 13);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		sc = null;
		card1 = null;
		card2 = null;
	}

	/**
	 * Test pushing a card into a single cell.
	 */
	@Test
	public void testPushCard() {
		sc.push(card1);
		AssertJUnit.assertEquals(card1, sc.peek());
		AssertJUnit.assertNull(sc.push(card2));
	}

	/**
	 * Test getting a card at a location using a 
	 * point as the frame of reference.
	 */
	@Test
	public void testGetCardAtLocationPoint() {
		sc.push(card1);
		AssertJUnit.assertEquals(card1, sc.getCardAtLocation(0));
	}

	/**
	 * Test to see if moving to a single cell 
	 * will be a valid move or not.
	 */
	@Test
	public void testIsValidMoveCard() {
		AssertJUnit.assertTrue(sc.isValidMove(card1));
		sc.push(card2);
		AssertJUnit.assertFalse(sc.isValidMove(card1));
	}

	/**
	 * Verifies that a stack of cards cannot be moved 
	 * to a single cell.
	 */
	@Test
	public void testIsValidMoveCardStack() {
		CardStack stack = new CardStack();
		stack.push(card1);
		stack.push(card2);
		AssertJUnit.assertFalse(sc.isValidMove(stack));
	}
}
