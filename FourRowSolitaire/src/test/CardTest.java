package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import FourRowSolitaire.Card;

public class CardTest {
	Card card1 = null;
	Card card2 = null;
	Card card3 = null;
	Card card4 = null;
	
	@BeforeClass
	public void setUp() throws Exception {
		card1 = new Card("Spades", 1, 1, 1);
		card2 = new Card("Clubs", 1, 1, 13);
		card3 = new Card("Hearts", 1, 1, 26);
		card4 = new Card("Diamonds", 1, 1, 39);
	}

	@AfterClass
	public void tearDown() throws Exception {
	}

	/**
	 * Test the constructor
	 */
	@Test
	public void test() {
		assertEquals(card1.getSuit(), "Spades");
		assertEquals(card1.getNumber(), 1);
		assertEquals(card1.getFullNumber(), 1);
		
		assertEquals(card2.getSuit(), "Clubs");
		assertEquals(card2.getNumber(), 1);
		assertEquals(card2.getFullNumber(), 13);
		
		assertEquals(card3.getSuit(), "Hearts"); 
		assertEquals(card3.getNumber(), 1);
		assertEquals(card3.getFullNumber(), 26);
		
		assertEquals(card4.getSuit(), "Diamonds");
		assertEquals(card4.getNumber(), 1);
		assertEquals(card4.getFullNumber(), 39);
		
		// Test invalid suit
		Card card5 = new Card("Joker", 1, 1, 1);
		assertEquals(card5.getSuit(), "Invalid Suit");
		Card card6 = new Card("Spades", 0, 1, 1);
		assertEquals(card6.getNumber(), -1);
		Card card7 = new Card("Spades", 14, 1, 1);
		assertEquals(card7.getNumber(), -1);
		Card card8 = new Card("Spades", 1, 0, 1);
		assertEquals(card8.getNumber(), 1);
		
		// Coverage Testing
		Card card9 = new Card("Spades", 2, 1, 2);
		Card card10 = new Card("Spades", 3, 1, 3);
		Card card11 = new Card("Spades", 4, 1, 4);
		Card card12 = new Card("Spades", 5, 1, 5);
		Card card13 = new Card("Spades", 6, 1, 6);
		Card card14 = new Card("Spades", 7, 1, 7);
		Card card15 = new Card("Spades", 8, 1, 8);
		Card card16 = new Card("Spades", 9, 1, 9);
		Card card17 = new Card("Spades", 10, 1, 10);
		Card card18 = new Card("Spades", 11, 1, 11);
		Card card19 = new Card("Spades", 12, 1, 12);
		Card card20 = new Card("Spades", 13, 1, 13);
		
	}

		@Test
		public void highlightTest(){
			card1.highlight();
			assertTrue(card1.isHighlighted());
			card1.unhighlight();
			assertFalse(card1.isHighlighted());
		}
		
		@Test
		public void faceUpTest(){
			card1.setFaceUp();
			assertTrue(card1.isFaceUp());
			card1.setFaceDown();
			assertFalse(card1.isFaceUp());
		}
		
		@Test
		public void validSuitTest(){
			assertTrue(card1.isValidSuit("Spades"));
			assertTrue(card1.isValidSuit("Clubs"));
			assertTrue(card1.isValidSuit("Hearts"));
			assertTrue(card1.isValidSuit("Diamonds"));
			assertFalse(card1.isValidSuit("Joker"));
		}
		
		@Test
		public void cardImageTest(){
			
		}
		
		@Test
		public void gettersTest(){
			assertEquals(card1.getNumber(), 1);
			assertEquals(card1.getSuit(), "Spades");
			assertEquals(card1.getColor(), 0 /* =Black */);
			assertEquals(card1.getFullNumber(), 1);
			card1.setSource("Testing");
			assertEquals(card1.getSource(), "Testing");
		}
		
		@Test
		public void cloneTest(){
			Card newCard = card1.clone();
			assertEquals(newCard.getSuit(), "Spades");
			assertEquals(newCard.getNumber(), 1);
			assertEquals(newCard.getColor(), 0);
			assertEquals(newCard.getFullNumber(), 1);
		}
}
