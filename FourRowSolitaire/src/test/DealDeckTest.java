package test;
/**
 * Test the DealDeck Class
 * @author Nolan Miller
 */

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FourRowSolitaire.Card;
import FourRowSolitaire.CardStack;
import FourRowSolitaire.DealDeck;
import FourRowSolitaire.DiscardPile;

public class DealDeckTest {
	
	DealDeck deck;
	DiscardPile discard1, discard2;
	Card card1, card2, card3, card4;
	LinkedList<Card> cardList;

  @BeforeMethod
  public void beforeClass() {
	  
	  card1 = new Card("Spades", 3, 1, 1);
	  card2 = new Card("Clubs", 1, 1, 13);
	  card3 = new Card("Hearts", 1, 1, 26);
	  card4 = new Card("Diamonds", 3, 1, 39);
	  
	  cardList = new LinkedList<Card>();
	  cardList.add(card1);
	  cardList.add(card2);
	  cardList.add(card3);
	  cardList.add(card4);
	  
	  discard1 = new DiscardPile(1);
	  discard2 = new DiscardPile(1);
	  deck = new DealDeck(discard1, 1);
  }

  @AfterMethod
  public void afterClass() {
  }

  /**
   * Test constructor
   */
  @Test
  public void DealDeck() {

    DealDeck deck1 = new DealDeck(discard1, 3);
    DealDeck deck2 = new DealDeck(discard2, 1);
    
    assertNotNull(deck1);
    assertNotNull(deck2);
    
  }

  /**
   * Test getDeckThroughs method
   * tests amount set by constructor, and amount
   * after being changed by setDeckThroughs(int)
   */
  @Test
  public void getDeckThroughs() {
	  
	  assertEquals(deck.getDeckThroughs(), 1);
	  deck.setDeckThroughs(3);
	  assertEquals(deck.getDeckThroughs(), 3);
	  
  }

  /**
   * Test hasDealsLeft 
   * compares numTimesThroughDeck to deckThroughLimit
   * runs through deals, and checks that dealsleft hits 0
   * 
   */
  @Test
  public void hasDealsLeft() throws Exception {
		deck.setDeck(cardList);
		assertEquals(deck.hasDealsLeft(), true);
		
		while(deck.hasDealsLeft())
			deck.pop();
		
		assertEquals(deck.hasDealsLeft(), false);
  }

  /**
   * Test that isValidMove(Card) returns false
   *
   */
  @Test
  public void isValidMoveCard() throws Exception {
	  
	  Card black_2, red_2;
	  black_2 = new Card("Spades", 2, 1, 2);
	  red_2 = new  Card("Diamonds", 2, 1, 3);
	  
	  deck.setDeck(cardList);
	  assertEquals(deck.isValidMove(red_2), false);	  
	  assertEquals(deck.isValidMove(black_2), false);
	  
		
  }

  /**
   * Test that isValidMove(CardStack) returns false
   * @throws Exception
   */
  @Test
  public void isValidMoveCardStack() throws Exception {	
	  
	  DealDeck testDeck = new DealDeck(discard2, 1);
	  LinkedList<Card> testList = new LinkedList<Card>();
	  CardStack stack = new CardStack();
	  
	  Card black_2, red_3, black_4, red_5;
	  
	  black_2 = new Card("Spades", 2, 1, 2);
	  red_3 = new  Card("Diamonds", 3, 1, 3);
	  black_4 = new Card("Clubs", 4, 1, 4);
	  red_5 = new Card("Hearts", 5, 1, 5);
	  
	  testList.add(red_5);
	  testList.add(black_4);
	  
	  testDeck.setDeck(testList);
	  
	  stack.push(red_3);
	  stack.push(black_2);
	  
	  assertEquals(testDeck.isValidMove(stack), false);
	  
	
  }

  /**
   * Test pop method with deckthroughs and cardlist
   *
   */
  @Test
  public void pop() throws Exception {
	  	// pop first card
		deck.setDeck(cardList);
		assertEquals(deck.pop(), card4);
		
		// change draw count and draw card
		deck.setDrawCount(2);
		assertEquals(deck.pop(), card2);
		
		// end of deck
		deck.pop();
		assertEquals(deck.pop(), null);
		
		// reach through limit
		deck.pop();
		deck.pop();
		assertEquals(deck.pop(), null);
  }

  /**
   * Tests resetting deck throughs
   * sets it at a number, calls reset, and checks that
   * it is reset to 1
   */
  @Test
  public void reset() throws Exception {
	  
	  deck.setDeckThroughs(4);
	  assertEquals(deck.getDeckThroughs(), 4);
	  deck.reset();
	  assertEquals(deck.getDeckThroughs(), 1);
		
  }

  /**
   * Tests set deck
   * Creates a linked list of cards and 
   * verifies that they are at the expected position
   *
   */
  @Test
  public void setDeck() throws Exception {
	  
	  deck.setDeck(cardList);
	  assertEquals(deck.getCardAtLocation(0), card1);
	  assertEquals(deck.getCardAtLocation(1), card2);
	  assertEquals(deck.getCardAtLocation(2), card3);
	  assertEquals(deck.getCardAtLocation(3), card4);
	  assertEquals(deck.length(), 4);
		
  }

  /**
   * Test ability to change deck throughs
   *
   */
  @Test
  public void setDeckThroughs() throws Exception {
		assertEquals(deck.getDeckThroughs(), 1);
		deck.setDeckThroughs(4);
		assertEquals(deck.getDeckThroughs(), 4);
  }
  

  @Test
  public void setDifficulty() {
	  // easy
	  deck.setDifficulty(1);
	  assertEquals(deck.getDeckThroughLimit(), 3);
	  
	  // medium
	  deck.setDifficulty(2);
	  assertEquals(deck.getDeckThroughLimit(), 2);
	  
	  // hard
	  deck.setDifficulty(3);
	  assertEquals(deck.getDeckThroughLimit(), 1);
	  
	  // increase draw count
	  deck.setDrawCount(3);
	  deck.setDifficulty(2);
	  assertEquals(deck.getDeckThroughLimit(), 3);
	  
  }

  /** 
   * Test that pop will pop number of cards indicated by draw count
   */
  @Test
  public void setDrawCount() {
	  deck.setDrawCount(1);
	  deck.setDeck(cardList);
	  
	  // pops one card
	  assertEquals(deck.pop(), card4);
	  deck.setDrawCount(3);
	  // pops 3 cards
	  assertEquals(deck.pop(), card1);
  }

  /**
   * Test undoPop
   *
   */
  @Test
  public void undoPop() throws Exception {
		deck.setDeck(cardList);
		
		// pop top card
		deck.undoPop();
		assertEquals(deck.getDeckThroughs(), 0);
		
		// use up deals
		while(deck.hasDealsLeft()){
			deck.pop();
		}
		
		assertEquals(deck.hasDealsLeft(), false);
		deck.undoPop();
		assertEquals(deck.hasDealsLeft(), true);
  }
 
}