package test;
/**
 * Test the DiscardPile Class
 * @author Thongphanh Duangboudda,
 * 		   Nolan Miller
 */
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.Point;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
	 
	@BeforeClass
	public void setUp() throws Exception { 
		discardPile = new DiscardPile(drawCount);
		card = new Card(Card.HEARTS_SUIT, cardNumber, deckNumber, fullNumber );
		
	}

	@AfterClass
	public void tearDown() throws Exception {
		discardPile = null;
	}

  	/**
  	 * Test the constructor and setting the draw count
  	 */
  	@Test
 	public void DiscardPile() {
   		DiscardPile dp = new DiscardPile(1);
   		dp.setDrawCount(2);
   		assertEquals(dp.getDrawCount(), 2);
  	}

  	/**
  	 * Test method to check number of viewable cards remaining
  	 */
  	@Test
  	public void testGetNumViewableCards(){
		// discardPile called push which set number of viewable to zero
  		discardPile.setView(0);
		assertEquals(0, discardPile.getNumViewableCards());
		//add a card
		discardPile.addCard(card);
		assertEquals(1, discardPile.getNumViewableCards());
		discardPile.addCard(card);
		assertEquals(2, discardPile.getNumViewableCards());
  	}
  	
  	/**
  	 * Test method to set number of viewable cards 
  	 */
  	@Test
  	public void setView() {
		discardPile.setView(4);
		assertEquals(4, discardPile.getNumViewableCards());
  	}
  	
  	/**
  	 * Test ability to add cards to pile
  	 * and test incrementing of cardsLeftFromDraw
  	 */
  	@Test
  	public void addCard() {
		Card returnedCard;
		discardPile.addCard(card);
		returnedCard = discardPile.peek();
		assertEquals(Card.HEARTS_SUIT, returnedCard.getSuit());
		assertEquals(2, returnedCard.getFullNumber());
		assertEquals(1, returnedCard.getNumber());
		assertEquals(1, discardPile.getNumViewableCards());
  	}

  	/**
  	 * Test adding stack of cards to discard pile
  	 */
  	@Test
  	public void addStack() {
  		DiscardPile dis = new DiscardPile(1);
		
		CardStack cardStack = new CardStack();
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

  	/**
  	 * Test ability to push new cards onto stack
  	 */
  	@Test
  	public void pushCard() {
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
  	
  	/**
  	 * Test pushing stack of cards 
  	 */
  	@Test
 	public void pushCardStack() {
		DiscardPile dis = new DiscardPile(1);
		
		CardStack cardStack = new CardStack();
		Card card1 = new Card("Spades", 1, 1, 1);
		cardStack.addCard(card1);
		assertEquals(card1, cardStack.pop());
		cardStack.addCard(card1);
		
		assertEquals(cardStack, dis.push(cardStack));
  	}
  	
  	/**
  	 * Test popping card from pile
  	 */
  	@Test
  	public void pop() {
  		discardPile.addCard(card);
		Card poppedCard;
		poppedCard = discardPile.pop();
		assertEquals(Card.HEARTS_SUIT, poppedCard.getSuit());
		assertEquals(2, poppedCard.getFullNumber());
		assertEquals(1, poppedCard.getNumber());
		
		while(discardPile.length() > 0)
			discardPile.pop();
		
		assertEquals(0, discardPile.getNumViewableCards());
  	}
  	
  	/**
  	 * Test undoPop() method, compare card to previously popped card
  	 */
  	@Test
  	public void testUndoPop(){
  		discardPile.addCard(card);
  		
  		discardPile.pop();
  		assertEquals(discardPile.undoPop(), card);
  	}
  	
  	/**
  	 * Test getCardAtLocation() at a point
  	 */
  	@Test
	public void testGetCardAtLocationPoint() {
		Point point = new Point(0,0);
		discardPile.addCard(card);
		assertEquals(Card.HEARTS_SUIT, discardPile.getCardAtLocation(point).getSuit());
  	}

  	/**
  	 * Tests checking whether a card is a valid move
  	 */
  	@Test
  	public void isValidMoveCard() {
  		discardPile.addCard(card);
		assertTrue(!discardPile.isValidMove(card));
  	}

  	/**
  	 * Test checking if a stack is a valid move
  	 */
  	@Test
  	public void isValidMoveCardStack() {
  		assertFalse(discardPile.isValidMove(card));
  	}
}
