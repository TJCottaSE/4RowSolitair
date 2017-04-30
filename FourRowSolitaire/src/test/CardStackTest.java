package test;
/**
 * Test the CardStack Class
 * @author Tony Cotta, Nolan Miller
 */
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import FourRowSolitaire.Card;
import FourRowSolitaire.CardStack;

public class CardStackTest {
	
	CardStack stack = null;
	Card black_5, red_4, black_3, red_2;
	
	@BeforeMethod
	public void setUp() throws Exception {
		stack = new CardStack();
		black_5 = new Card("Spades", 5, 1, 1);
		red_4 = new Card("Hearts", 4, 1, 2);
		black_3 = new Card("Clubs", 3, 1, 3);
		red_2 = new Card("Diamonds", 2, 1, 4);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		stack = null;
	}

	/**
	 * Test adding a card to the stack
	 */
	@Test
	public void testAddCard() {
		Card card1 = new Card("Spades", 1, 1, 1);
		stack.addCard(card1);
		AssertJUnit.assertEquals(card1, stack.pop());
	}

	/**
	 * Test adding a stack of cards to a stack
	 */
	@Test
	public void testAddStack() {
		CardStack stack1 = new CardStack();
		stack1.addCard(black_3);
		stack1.addCard(black_5);
		stack1.addCard(red_2);
		stack1.addCard(red_4);
		stack.addStack(stack1);
		AssertJUnit.assertEquals(stack.getCardAtLocation(0).getFullNumber(), red_4.getFullNumber());
		AssertJUnit.assertEquals(stack.getCardAtLocation(1).getFullNumber(), red_2.getFullNumber());
		AssertJUnit.assertEquals(stack.getCardAtLocation(2).getFullNumber(), black_5.getFullNumber());
		AssertJUnit.assertEquals(stack.getCardAtLocation(3).getFullNumber(), black_3.getFullNumber());
	}

	/**
	 * Test alternative way of adding card to stack
	 */
	@Test
	public void testPushCard() {
		Card card1 = new Card("Spades", 1, 1, 1);
		AssertJUnit.assertEquals(card1, stack.push(card1));
		AssertJUnit.assertEquals(card1, stack.pop());
	}

	/**
	 * Test alternative way of adding a stack of cards
	 * to a stack.
	 */
	@Test
	public void testPushCardStack() {
		CardStack cs = new CardStack();
		Card card1 = new Card("Spades", 1, 1, 1);
		Card card2 = new Card("Spades", 13, 1, 13);
		cs.push(card1);
		cs.push(card2);
		AssertJUnit.assertTrue(stack.push(cs).isEmpty());
	}

	/**
	 * Test removing the top card from the stack
	 */
	@Test
	public void testPop() {
		Card card1 = new Card("Spades", 1, 1, 1);
		stack.push(card1);
		AssertJUnit.assertEquals(card1, stack.pop());
	}

	/**
	 * Test removing the entire stack from the stack
	 */
	@Test
	public void testPopCardStack() {
		stack.push(black_3);
		stack.push(red_2);
		
		CardStack reverse = new CardStack();
		reverse.push(red_2);
		reverse.push(black_3);
		
		// compares top card of popped stack and expected reversal
		assertTrue(stack.pop(stack).pop().equals(reverse.pop()));
	}

	/**
	 * Test looking at the top card of the stack
	 */
	@Test
	public void testPeek() {
		Card card1 = new Card("Spades", 1, 1, 1);
		Card card2 = new Card("Spades", 13, 1, 13);
		stack.push(card1);
		AssertJUnit.assertEquals(card1, stack.peek());
		assertNotEquals(card2, stack.peek());
	}

	/**
	 * Test that the stack correctly reports that 
	 * it is empty when appropriate.
	 */
	@Test
	public void testIsEmpty() {
		AssertJUnit.assertTrue(stack.isEmpty());
		Card card1 = new Card("Spades", 1, 1, 1);
		stack.push(card1);
		AssertJUnit.assertFalse(stack.isEmpty());
	}

	/**
	 * Test that the stack will return the correct value
	 * for the number of cards in the card stack
	 */
	@Test
	public void testLength() {
		AssertJUnit.assertEquals(stack.length(), 0);
		Card card1 = new Card("Spades", 1, 1, 1);
		stack.push(card1);
		AssertJUnit.assertEquals(stack.length(), 1);
		stack.pop();
		AssertJUnit.assertEquals(stack.length(), 0);
	}

	/**
	 * Test that verifies that the searching for a 
	 * card function correctly returns the result for
	 * when the card is in the stack and when it is not.
	 */
	@Test
	public void testSearch() {
		Card card1 = new Card("Spades", 1, 1, 1);
		Card card2 = new Card("Spades", 2, 1, 2);
		Card card3 = new Card("Spades", 3, 1, 3);
		Card card4 = new Card("Hearts", 10, 1, 40);
		stack.push(card1);
		stack.push(card2);
		stack.push(card3);
		AssertJUnit.assertEquals(stack.search(card4), -1);
		AssertJUnit.assertEquals(stack.search(card1), 3);
		stack.pop();
		AssertJUnit.assertEquals(stack.search(card1), 2);
	}

	/**
	 * Test getting a card at a specified index of the stack
	 */
	@Test
	public void testGetCardAtLocationIntIndex() {
		Card card1 = new Card("Spades", 1, 1, 1);
		Card card2 = new Card("Spades", 2, 1, 2);
		Card card3 = new Card("Spades", 3, 1, 3);
		while (!stack.isEmpty()){
			//stack.pop();
		}
		stack.push(card1);
		stack.push(card2);
		stack.push(card3);
		AssertJUnit.assertEquals(stack.getCardAtLocation(0), card1);
		stack.pop();
		AssertJUnit.assertNull(stack.getCardAtLocation(3));
	}

	/**
	 * Test getting a card a specified point is a UI bound
	 * method, that requires the decks to be dealt. Since this
	 * is done automatically at the start of the program with
	 * a random shuffle, repeatable testing of this UI 
	 * component is not possible in JUnit or TestNG
	 */
	@Test
	public void testGetCardAtLocationPoint() {	
	}

	/**
	 * Test getting an entire stack of cards
	 */
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
		AssertJUnit.assertEquals(newStack.pop().getFullNumber(), card2.getFullNumber());
		AssertJUnit.assertEquals(newStack.pop().getFullNumber(), card3.getFullNumber());
		AssertJUnit.assertEquals(newStack.pop().getFullNumber(), card4.getFullNumber());
	}

	/**
	 * Test getting a stack of cards to a specified depth
	 */
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
		//CardStack newStack = stack.getStack(4);
		//Card c = newStack.peek();
		//AssertJUnit.assertEquals(newStack.pop().getFullNumber(), card2.getFullNumber());
		//AssertJUnit.assertEquals(newStack.pop().getFullNumber(), card3.getFullNumber());
		//AssertJUnit.assertEquals(newStack.pop().getFullNumber(), card4.getFullNumber());
	}

	/**
	 * Test that the moving of a card to the stack is a valid move
	 */
	@Test
	public void testIsValidMoveCard() {
		Card card1 = new Card("Spades", 1, 1, 1);
		AssertJUnit.assertFalse(stack.isValidMove(card1));
	}

	/**
	 * Test that moving a stack to this stack is a valid move
	 */
	@Test
	public void testIsValidMoveCardStack() {
		CardStack newStack = new CardStack();
		AssertJUnit.assertFalse(stack.isValidMove(newStack));
	}

	/**
	 * Test getting the bottom card of a stack
	 */
	@Test
	public void testGetBottom() {
		Card card1 = new Card("Spades", 1, 1, 1);
		Card card2 = new Card("Spades", 2, 1, 2);
		Card card3 = new Card("Spades", 3, 1, 3);
		Card card4 = new Card("Hearts", 10, 1, 40);
		while (!stack.isEmpty()){
			//stack.pop();
		}
		stack.addCard(card1);
		stack.addCard(card2);
		stack.addCard(card3);
		stack.addCard(card4);
		int w = stack.getBottom().getFullNumber();
		int z = card1.getFullNumber();
		assertEquals(stack.getBottom().getFullNumber(), card1.getFullNumber());
		assertNotEquals(stack.getBottom().getFullNumber(), card4.getFullNumber());
	}

	/**
	 * Test to get the available cards
	 */
	@Test
	public void testGetAvailableCards() {
		Card card1 = new Card("Spades", 1, 1, 1);
		Card card2 = new Card("Spades", 2, 1, 2);
		Card card3 = new Card("Spades", 3, 1, 3);
		Card card4 = new Card("Hearts", 10, 1, 40);
		stack.addCard(card1);
		stack.addCard(card2);
		stack.addCard(card3);
		stack.addCard(card4);
		
		CardStack newStack = stack.getAvailableCards();
		assertEquals(newStack.peek().getFullNumber(), card4.getFullNumber());	
	}
}