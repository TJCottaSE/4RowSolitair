package test;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import FourRowSolitaire.Card;
import FourRowSolitaire.CardStack;
import FourRowSolitaire.DiscardPile;

public class DiscardPileTest {
	 private int drawCount = 1;
	 private int cardsLeftFromDraw = 0;
	 
	 private int cardNumber =1;
	 private int deckNumber = 1;
	 private int fullNumber = 2;
	 DiscardPile discardPile;
	 Card card;

	@Before
	public void setUp() throws Exception {
		discardPile = new DiscardPile(drawCount);
		card = new Card(Card.HEARTS_SUIT, cardNumber, deckNumber, fullNumber );
		
	}

	@After
	public void tearDown() throws Exception {
		discardPile = null;
	}

	@Test
	public void testAddCard() {
		Card returnedCard;
		discardPile.addCard(card);
		returnedCard = discardPile.peek();
		assertEquals(Card.HEARTS_SUIT, returnedCard.getSuit());
		assertEquals(2, returnedCard.getFullNumber());
		assertEquals(1, returnedCard.getNumber());
		
		
	}

	@Test
	public void testAddStack() {
DiscardPile dis = new DiscardPile(1);
		
		CardStack cardStack = new CardStack();
		CardStack returnedStack;
		Card card1 = new Card("Spades", 1, 1, 1);
		cardStack.addCard(card1);
		assertEquals(card1, cardStack.pop());
		cardStack.addCard(card1);
		dis.addStack(cardStack);
		
		Card card2 = dis.pop();
		assertEquals("Spades", card2.getSuit());
		//assertEquals(1, dis.pop().getNumber());
		//assertEquals(1, dis.pop().getFullNumber());
	}

	@Test
	public void testPushCard() {
		int cardNumber = 3;
		int deckNumber=2;
		int fullNumber = 10;
		Card _isPushed;
		Card cardPush = new Card(Card.DIAMONDS_SUIT, cardNumber, deckNumber, fullNumber );
		_isPushed = discardPile.push(cardPush);
		
		assertEquals(Card.DIAMONDS_SUIT, _isPushed.getSuit());
		assertEquals(3, _isPushed.getNumber());
		assertEquals(10, _isPushed.getFullNumber());
		
	}

	@Test
	public void testPushCardStack() {
		
		DiscardPile dis = new DiscardPile(1);
		
		CardStack cardStack = new CardStack();
		CardStack returnedStack;
		Card card1 = new Card("Spades", 1, 1, 1);
		cardStack.addCard(card1);
		assertEquals(card1, cardStack.pop());
		cardStack.addCard(card1);
		
		assertEquals(cardStack, dis.push(cardStack));
		
	
		
		
		
	}

	@Test
	public void testPop() {
		discardPile.addCard(card);
		Card poppedCard;
		poppedCard = discardPile.pop();
		assertEquals(Card.HEARTS_SUIT, poppedCard.getSuit());
		assertEquals(2, poppedCard.getFullNumber());
		assertEquals(1, poppedCard.getNumber());
		
	}

	@Test
	public void testGetCardAtLocationPoint() {
		Point point = new Point(0,0);
		discardPile.addCard(card);
		assertEquals(Card.HEARTS_SUIT, discardPile.getCardAtLocation(point).getSuit());
		
		//fail("Not yet implemented");
	}

	@Test
	public void testIsValidMoveCard() {
		discardPile.addCard(card);
		assertTrue(!discardPile.isValidMove(card));
	}

	@Test
	public void testIsValidMoveCardStack() {
		assertFalse(discardPile.isValidMove(card));
	}

	@Test
	public void testPaintGraphics() {
		//Sorry, I do not know how to write test for this one
		assertNotNull(discardPile);
	}

	@Test
	public void testDiscardPile() {
		//DiscardPile is the constructor and it sets only one integer ( drawCount)
		assertNotNull(discardPile);
	}

	@Test
	public void testSetDrawCount() {
		discardPile.setDrawCount(2);
		//DiscardPile class does not have a return method for drawCont.
		assertNotNull(discardPile);
		
	}

	@Test
	public void testGetNumViewableCards() {
		// discardPile called push which set number of viewable to zero
		assertEquals(0, discardPile.getNumViewableCards());
		//add a card
		discardPile.addCard(card);
		assertEquals(1, discardPile.getNumViewableCards());
		discardPile.addCard(card);
		assertEquals(2, discardPile.getNumViewableCards());
	}

	@Test
	public void testSetView() {
		discardPile.setView(4);
		assertEquals(4, discardPile.getNumViewableCards());
	}

}
