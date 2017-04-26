package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.*;

import FourRowSolitaire.AcePile;
import FourRowSolitaire.Card;
import FourRowSolitaire.CardStack;

import java.awt.Point;

public class AcePileTest {
	
	AcePile aceSpadesPile = null;
	AcePile aceClubsPile = null;
	AcePile aceDiamondsPile = null;
	AcePile aceHeartsPile = null;
	

	
	@BeforeClass
	public void setUp() throws Exception {
	}

	@AfterClass
	public void tearDown() throws Exception {
	}

	/**
	 * Test the constructor
	 */
	@Test
	public void AcePile() {
		aceSpadesPile = new AcePile(Card.SPADES_SUIT);
		aceClubsPile = new AcePile(Card.CLUBS_SUIT);
		aceDiamondsPile = new AcePile(Card.DIAMONDS_SUIT);
		aceHeartsPile = new AcePile(Card.HEARTS_SUIT);
		
		assertTrue(aceSpadesPile.getSuit() == Card.SPADES_SUIT);
		assertFalse(aceSpadesPile.getSuit() == Card.CLUBS_SUIT);
		
		assertTrue(aceClubsPile.getSuit() == Card.CLUBS_SUIT);
		assertFalse(aceClubsPile.getSuit() == Card.DIAMONDS_SUIT);
		
		assertTrue(aceDiamondsPile.getSuit() == Card.DIAMONDS_SUIT);
		assertFalse(aceDiamondsPile.getSuit() == Card.HEARTS_SUIT);
		
		assertTrue(aceHeartsPile.getSuit() == Card.HEARTS_SUIT);
		assertFalse(aceHeartsPile.getSuit() == Card.SPADES_SUIT);	
	}
	
	@Test
	public void testPushCard() {
		aceSpadesPile = new AcePile(Card.SPADES_SUIT);
		// Ace of Spades
		Card card = new Card("Spades", 1, 1, 1);
		Card card2 = new Card("Spades", 2, 1, 2);
		Card card3 = new Card("Clubs", 2, 1, 15);
		
		assertEquals(card, aceSpadesPile.push(card));
		assertEquals(card2, aceSpadesPile.push(card2));
		assertEquals(aceSpadesPile.pop(), card2);
		assertEquals(aceSpadesPile.pop(), card);
		assertNull(aceSpadesPile.push(card3));
	}

	@Test
	public void testGetCardAtLocationPoint() {
		aceSpadesPile = new AcePile(Card.SPADES_SUIT);
		
		Card card = new Card("Spades", 1, 1, 1);
		aceSpadesPile.push(card);
		Point p = new Point();
		Card newCard = aceSpadesPile.getCardAtLocation(p);
		assertEquals(card, newCard);
	}

	@Test
	public void testIsValidMoveCard() {
		aceSpadesPile = new AcePile(Card.SPADES_SUIT);
		// Ace of Spades
		Card card = new Card("Spades", 1, 1, 1);
		Card card2 = new Card("Spades", 2, 1, 2);
		Card card3 = new Card("Clubs", 2, 1, 15);
		
		assertFalse(aceSpadesPile.isValidMove(card3));
		assertTrue(aceSpadesPile.isValidMove(card));
		aceSpadesPile.push(card);
		assertTrue(aceSpadesPile.isValidMove(card2));
		aceSpadesPile.pop();
		assertFalse(aceSpadesPile.isValidMove(card3));
	}

	@Test
	public void testIsValidMoveCardStack() {
		aceSpadesPile = new AcePile(Card.SPADES_SUIT);
		CardStack cs = new CardStack();
		assertFalse(aceSpadesPile.isValidMove(cs));
	}

}
