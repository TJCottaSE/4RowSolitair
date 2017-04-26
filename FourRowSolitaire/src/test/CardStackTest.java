package test;

import static org.junit.Assert.*;
import static org.testng.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import FourRowSolitaire.Card;
import FourRowSolitaire.CardStack;

public class CardStackTest {
	
	CardStack stack = null;
	
	@Before
	public void setUp() throws Exception {
		stack = new CardStack();
	}

	@After
	public void tearDown() throws Exception {
		stack = null;
	}

	@Test
	public void testAddCard() {
		Card card1 = new Card("Spades", 1, 1, 1);
		stack.addCard(card1);
		assertEquals(card1, stack.pop());
	}

	@Test
	public void testAddStack() {
		fail("Not yet implemented");
	}

	@Test
	public void testPushCard() {
		Card card1 = new Card("Spades", 1, 1, 1);
		assertEquals(card1, stack.push(card1));
		assertEquals(card1, stack.pop());
	}

	@Test
	public void testPushCardStack() {
		CardStack cs = new CardStack();
		Card card1 = new Card("Spades", 1, 1, 1);
		Card card2 = new Card("Spades", 13, 1, 13);
		cs.push(card1);
		cs.push(card2);
		assertTrue(stack.push(cs).isEmpty());
	}

	@Test
	public void testPop() {
		Card card1 = new Card("Spades", 1, 1, 1);
		stack.push(card1);
		assertEquals(card1, stack.pop());
	}

	@Test
	public void testPopCardStack() {
		fail("Not yet implemented");
	}

	@Test
	public void testPeek() {
		Card card1 = new Card("Spades", 1, 1, 1);
		Card card2 = new Card("Spades", 13, 1, 13);
		stack.push(card1);
		assertEquals(card1, stack.peek());
		assertNotEquals(card2, stack.peek());
	}

	@Test
	public void testIsEmpty() {
		assertTrue(stack.isEmpty());
		Card card1 = new Card("Spades", 1, 1, 1);
		stack.push(card1);
		assertFalse(stack.isEmpty());
	}

	@Test
	public void testLength() {
		assertEquals(stack.length(), 0);
		Card card1 = new Card("Spades", 1, 1, 1);
		stack.push(card1);
		assertEquals(stack.length(), 1);
		stack.pop();
		assertEquals(stack.length(), 0);
	}

	@Test
	public void testSearch() {
		Card card1 = new Card("Spades", 1, 1, 1);
		Card card2 = new Card("Spades", 2, 1, 2);
		Card card3 = new Card("Spades", 3, 1, 3);
		Card card4 = new Card("Hearts", 10, 1, 40);
		stack.push(card1);
		stack.push(card2);
		stack.push(card3);
		assertEquals(stack.search(card4), -1);
		assertEquals(stack.search(card1), 3);
		stack.pop();
		assertEquals(stack.search(card1), 2);
	}

	@Test
	public void testGetCardAtLocationIntIndex() {
		Card card1 = new Card("Spades", 1, 1, 1);
		Card card2 = new Card("Spades", 2, 1, 2);
		Card card3 = new Card("Spades", 3, 1, 3);

		stack.push(card1);
		stack.push(card2);
		stack.push(card3);
		assertEquals(stack.getCardAtLocation(0), card1);
		stack.pop();
		assertNull(stack.getCardAtLocation(3));
	}

	@Test
	public void testGetCardAtLocationPoint() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStackCard() {
		Card card1 = new Card("Spades", 1, 1, 1);
		Card card2 = new Card("Spades", 2, 1, 2);
		Card card3 = new Card("Spades", 3, 1, 3);
		Card card4 = new Card("Hearts", 10, 1, 40);
		stack.push(card1);
		stack.push(card2);
		stack.push(card3);
		stack.push(card4);
		CardStack newStack = stack.getStack(card2);
		Card c = newStack.peek();
		assertEquals(newStack.pop().getFullNumber(), card2.getFullNumber());
		assertEquals(newStack.pop().getFullNumber(), card3.getFullNumber());
		assertEquals(newStack.pop().getFullNumber(), card4.getFullNumber());
	}

	@Test
	public void testGetStackInt() {												/* Needs Work */
		Card card1 = new Card("Spades", 1, 1, 1);
		Card card2 = new Card("Spades", 2, 1, 2);
		Card card3 = new Card("Spades", 3, 1, 3);
		Card card4 = new Card("Hearts", 10, 1, 40);
		stack.push(card1);
		stack.push(card2);
		stack.push(card3);
		stack.push(card4);
		CardStack newStack = stack.getStack(0);
		Card c = newStack.peek();
		assertEquals(newStack.pop().getFullNumber(), card2.getFullNumber());
		assertEquals(newStack.pop().getFullNumber(), card3.getFullNumber());
		assertEquals(newStack.pop().getFullNumber(), card4.getFullNumber());
	}

	@Test
	public void testUndoStack() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsValidMoveCard() {
		Card card1 = new Card("Spades", 1, 1, 1);
		assertFalse(stack.isValidMove(card1));
	}

	@Test
	public void testIsValidMoveCardStack() {
		CardStack newStack = new CardStack();
		assertFalse(stack.isValidMove(newStack));
	}

	@Test
	public void testGetBottom() {
		Card card1 = new Card("Spades", 1, 1, 1);
		Card card2 = new Card("Spades", 2, 1, 2);
		Card card3 = new Card("Spades", 3, 1, 3);
		Card card4 = new Card("Hearts", 10, 1, 40);
		stack.push(card1);
		stack.push(card2);
		stack.push(card3);
		stack.push(card4);
		assertEquals(stack.getBottom(), card1);
		assertNotEquals(stack.getBottom(), card4);
	}

	@Test
	public void testGetAvailableCards() {
		fail("Not yet implemented");
	}

}
