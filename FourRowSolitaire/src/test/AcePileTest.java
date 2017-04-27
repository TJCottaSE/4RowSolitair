package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
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
	

	
	@BeforeMethod
	@BeforeClass
	public void setUp() throws Exception {
	}

	@AfterMethod
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
		
		AssertJUnit.assertTrue(aceSpadesPile.getSuit() == Card.SPADES_SUIT);
		AssertJUnit.assertFalse(aceSpadesPile.getSuit() == Card.CLUBS_SUIT);
		
		AssertJUnit.assertTrue(aceClubsPile.getSuit() == Card.CLUBS_SUIT);
		AssertJUnit.assertFalse(aceClubsPile.getSuit() == Card.DIAMONDS_SUIT);
		
		AssertJUnit.assertTrue(aceDiamondsPile.getSuit() == Card.DIAMONDS_SUIT);
		AssertJUnit.assertFalse(aceDiamondsPile.getSuit() == Card.HEARTS_SUIT);
		
		AssertJUnit.assertTrue(aceHeartsPile.getSuit() == Card.HEARTS_SUIT);
		AssertJUnit.assertFalse(aceHeartsPile.getSuit() == Card.SPADES_SUIT);	
	}
	
	@Test
	public void testPushCard() {
		aceSpadesPile = new AcePile(Card.SPADES_SUIT);
		// Ace of Spades
		Card card = new Card("Spades", 1, 1, 1);
		Card card2 = new Card("Spades", 2, 1, 2);
		Card card3 = new Card("Clubs", 2, 1, 15);
		
		AssertJUnit.assertEquals(card, aceSpadesPile.push(card));
		AssertJUnit.assertEquals(card2, aceSpadesPile.push(card2));
		AssertJUnit.assertEquals(aceSpadesPile.pop(), card2);
		AssertJUnit.assertEquals(aceSpadesPile.pop(), card);
		AssertJUnit.assertNull(aceSpadesPile.push(card3));
	}

	@Test
	public void testGetCardAtLocationPoint() {
		aceSpadesPile = new AcePile(Card.SPADES_SUIT);
		
		Card card = new Card("Spades", 1, 1, 1);
		aceSpadesPile.push(card);
		Point p = new Point();
		Card newCard = aceSpadesPile.getCardAtLocation(p);
		AssertJUnit.assertEquals(card, newCard);
	}

	@Test
	public void testIsValidMoveCard() {
		aceSpadesPile = new AcePile(Card.SPADES_SUIT);
		// Ace of Spades
		Card card = new Card("Spades", 1, 1, 1);
		Card card2 = new Card("Spades", 2, 1, 2);
		Card card3 = new Card("Clubs", 2, 1, 15);
		
		AssertJUnit.assertFalse(aceSpadesPile.isValidMove(card3));
		AssertJUnit.assertTrue(aceSpadesPile.isValidMove(card));
		aceSpadesPile.push(card);
		AssertJUnit.assertTrue(aceSpadesPile.isValidMove(card2));
		aceSpadesPile.pop();
		AssertJUnit.assertFalse(aceSpadesPile.isValidMove(card3));
	}

	@Test
	public void testIsValidMoveCardStack() {
		aceSpadesPile = new AcePile(Card.SPADES_SUIT);
		CardStack cs = new CardStack();
		AssertJUnit.assertFalse(aceSpadesPile.isValidMove(cs));
	}

}
