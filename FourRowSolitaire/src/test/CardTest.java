package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import FourRowSolitaire.Card;

public class CardTest {
	Card card1 = null;
	Card card2 = null;
	Card card3 = null;
	Card card4 = null;
	
	@BeforeMethod
	public void setUp() throws Exception {
		card1 = new Card("Spades", 1, 1, 1);
		card2 = new Card("Clubs", 1, 1, 13);
		card3 = new Card("Hearts", 1, 1, 26);
		card4 = new Card("Diamonds", 1, 1, 39);
	}

	@AfterMethod
	public void tearDown() throws Exception {
	}

	/**
	 * Test the constructor
	 */
	@Test
	public void test() {
		AssertJUnit.assertEquals(card1.getSuit(), "Spades");
		AssertJUnit.assertEquals(card1.getNumber(), 1);
		AssertJUnit.assertEquals(card1.getFullNumber(), 1);
		
		AssertJUnit.assertEquals(card2.getSuit(), "Clubs");
		AssertJUnit.assertEquals(card2.getNumber(), 1);
		AssertJUnit.assertEquals(card2.getFullNumber(), 13);
		
		AssertJUnit.assertEquals(card3.getSuit(), "Hearts"); 
		AssertJUnit.assertEquals(card3.getNumber(), 1);
		AssertJUnit.assertEquals(card3.getFullNumber(), 26);
		
		AssertJUnit.assertEquals(card4.getSuit(), "Diamonds");
		AssertJUnit.assertEquals(card4.getNumber(), 1);
		AssertJUnit.assertEquals(card4.getFullNumber(), 39);
		
		// Test invalid suit
		Card card5 = new Card("Joker", 1, 1, 1);
		AssertJUnit.assertEquals(card5.getSuit(), "Invalid Suit");
		Card card6 = new Card("Spades", 0, 1, 1);
		AssertJUnit.assertEquals(card6.getNumber(), -1);
		Card card7 = new Card("Spades", 14, 1, 1);
		AssertJUnit.assertEquals(card7.getNumber(), -1);
		Card card8 = new Card("Spades", 1, 0, 1);
		AssertJUnit.assertEquals(card8.getNumber(), 1);
		
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
			AssertJUnit.assertTrue(card1.isHighlighted());
			card1.unhighlight();
			AssertJUnit.assertFalse(card1.isHighlighted());
		}
		
		@Test
		public void faceUpTest(){
			card1.setFaceUp();
			AssertJUnit.assertTrue(card1.isFaceUp());
			card1.setFaceDown();
			AssertJUnit.assertFalse(card1.isFaceUp());
		}
		
		@Test
		public void validSuitTest(){
			AssertJUnit.assertTrue(card1.isValidSuit("Spades"));
			AssertJUnit.assertTrue(card1.isValidSuit("Clubs"));
			AssertJUnit.assertTrue(card1.isValidSuit("Hearts"));
			AssertJUnit.assertTrue(card1.isValidSuit("Diamonds"));
			AssertJUnit.assertFalse(card1.isValidSuit("Joker"));
		}
		
		@Test
		public void cardImageTest(){
			
		}
		
		@Test
		public void gettersTest(){
			AssertJUnit.assertEquals(card1.getNumber(), 1);
			AssertJUnit.assertEquals(card1.getSuit(), "Spades");
			AssertJUnit.assertEquals(card1.getColor(), 0 /* =Black */);
			AssertJUnit.assertEquals(card1.getFullNumber(), 1);
			card1.setSource("Testing");
			AssertJUnit.assertEquals(card1.getSource(), "Testing");
		}
		
		@Test
		public void cloneTest(){
			Card newCard = card1.clone();
			AssertJUnit.assertEquals(newCard.getSuit(), "Spades");
			AssertJUnit.assertEquals(newCard.getNumber(), 1);
			AssertJUnit.assertEquals(newCard.getColor(), 0);
			AssertJUnit.assertEquals(newCard.getFullNumber(), 1);
		}
}
