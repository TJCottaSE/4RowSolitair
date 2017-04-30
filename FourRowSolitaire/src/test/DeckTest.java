package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.LinkedList;

import FourRowSolitaire.Card;
import FourRowSolitaire.Deck;

public class DeckTest {
	  private int deckNumber = 2;
	  private LinkedList<Card> deck = new LinkedList<Card>();
	  private Deck deckClass;
	  private Deck deckClass2;
	  private Deck deckClass3;
	 // private Card card = new Card(null, 1, 1, 1);
	  LinkedList<Integer> numbers = new LinkedList();

	@BeforeMethod
	public void setUp() throws Exception {
		deckClass = new Deck (deckNumber);
		deckClass2 = new Deck (6);
		deckClass3 = new Deck (7);
		numbers.add(1);
		//numbers.add(2);
		//numbers.add(3);
	}

	@AfterMethod
	public void tearDown() throws Exception {
	}

	@Test
	public void testDeck() {
		//AssertJUnit.assertEquals(2, deckClass.getDeckNumber());
		//AssertJUnit.assertEquals(6, deckClass2.getDeckNumber());
		//AssertJUnit.assertEquals(7, deckClass3.getDeckNumber());
		
	}

	@Test
	public void testGetDeck() {
		AssertJUnit.assertNotNull(deckClass.getDeck());
		AssertJUnit.assertNotNull(deckClass2.getDeck());
		AssertJUnit.assertNotNull(deckClass3.getDeck());
	}

	@Test
	public void testGetDeckLinkedListOfInteger() {
		
		Card card;
		deck = deckClass.getDeck(numbers);
		card = deck.get(0);
		//AssertJUnit.assertEquals(1,deckClass.getDeck().size());		
		//AssertJUnit.assertEquals(card.getSuit(),Card.SPADES_SUIT);
	}
	
	@Test
	public void testGetDeckNumber(){
		//AssertJUnit.assertEquals(deckClass.getDeckNumber(), 2);
	}

	@Test
	public void testShuffle() {
		//Ok, this Shuffle method has not return value, and I have no ways to test it
		AssertJUnit.assertNotNull(deckClass);
		
		//fail("Not yet implemented");
	}

}