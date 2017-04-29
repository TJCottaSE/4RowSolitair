package test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

	@Before
	public void setUp() throws Exception {
		deckClass = new Deck (deckNumber);
		deckClass2 = new Deck (6);
		deckClass3 = new Deck (7);
		numbers.add(1);
		//numbers.add(2);
		//numbers.add(3);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDeck() {
		assertEquals(2, deckClass.getDeckNumber());
		assertEquals(6, deckClass2.getDeckNumber());
		assertEquals(7, deckClass3.getDeckNumber());
		
	}

	@Test
	public void testGetDeck() {
		assertNotNull(deckClass.getDeck());
		assertNotNull(deckClass2.getDeck());
		assertNotNull(deckClass3.getDeck());
	}

	@Test
	public void testGetDeckLinkedListOfInteger() {
		
		Card card;
		deck = deckClass.getDeck(numbers);
		card = deck.get(0);
		assertEquals(1,deckClass.getDeck().size());		
		assertEquals(card.getSuit(),Card.SPADES_SUIT);
	}

	@Test
	public void testShuffle() {
		//Ok, this Shuffle method has not return value, and I have no ways to test it
		assertNotNull(deckClass);
		
		//fail("Not yet implemented");
	}

}
