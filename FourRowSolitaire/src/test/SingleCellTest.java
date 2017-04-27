package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
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
	}

	@Test
	public void testPushCard() {
		sc.push(card1);
		AssertJUnit.assertEquals(card1, sc.peek());
		AssertJUnit.assertNull(sc.push(card2));
	}

	@Test
	public void testGetCardAtLocationPoint() {
		sc.push(card1);
		AssertJUnit.assertEquals(card1, sc.getCardAtLocation(0));
	}

	@Test
	public void testIsValidMoveCard() {
		AssertJUnit.assertTrue(sc.isValidMove(card1));
		sc.push(card2);
		AssertJUnit.assertFalse(sc.isValidMove(card1));
	}

	@Test
	public void testIsValidMoveCardStack() {
		CardStack stack = new CardStack();
		stack.push(card1);
		stack.push(card2);
		AssertJUnit.assertFalse(sc.isValidMove(stack));
	}
}
