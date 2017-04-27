package test;

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

import FourRowSolitaire.Deck;

public class DeckTest {

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @Test
  public void Deck() {
    throw new RuntimeException("Test not implemented");
  }
  
	@Test
	public void type() throws Exception {
		
		assertThat(Deck.class, notNullValue());
	}

	@Test
	public void instantiation() throws Exception {
		
		int deckNumber = 0;
		Deck target = new Deck(deckNumber);
		assertThat(target, notNullValue());
	}

  @Test
  public void createCard() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getDeck() throws Exception {
		
		int deckNumber = 0;
		Deck target = new Deck(deckNumber);
		LinkedList<Object> actual = target.getDeck();
		LinkedList<Object> expected = null;
		assertThat(actual, is(equalTo(expected)));
  }

  @Test
  public void getDeckLinkedListInteger() throws Exception {
		
		int deckNumber = 0;
		Deck target = new Deck(deckNumber);
		LinkedList<Integer> numbers = null;
		LinkedList<Object> actual = target.getDeck(numbers);
		LinkedList<Object> expected = null;
		assertThat(actual, is(equalTo(expected)));
  }

  @Test
  public void shuffle()throws Exception {
		
		int deckNumber = 0;
		Deck target = new Deck(deckNumber);
		target.shuffle();
  }
  
}