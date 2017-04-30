package test;
/**
 * This Unit Test is designed to test most of the methods
 * in this class excluding any UI related components
 * @author Tony Cotta, 
 */
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import FourRowSolitaire.SolitaireBoard;

public class SolitaireBoardTest  extends TestNG {

	@BeforeClass
  	public void beforeClass() {
  	}

  	@AfterClass
  	public void afterClass() {
  	}

  	@Test
  	public void createBoard() throws Exception {
	  	SolitaireBoard target = new SolitaireBoard();
	  	LinkedList<Integer> cards = null;
	  	target.createBoard(cards);
	  	assertTrue(false);
  	}

  	@Test
  	public void dealOutCustomBoard() {
  		assertTrue(false);
  	}

  	@Test
  	public void getHint() throws Exception {
	  	SolitaireBoard target = new SolitaireBoard();
	  	target.getHint();
	  	assertTrue(false);
  	}

  	/**
  	 * Test to get the status of timer for the next game.
  	 * @throws Exception
  	 */
  	@Test
  	public void getTimerNextGameStatus() throws Exception {
		SolitaireBoard board = new SolitaireBoard();
		board.setTimerStatus(1);
		assertEquals(board.getTimerNextGameStatus(), 1);
		board.setTimerStatus(0);
		assertEquals(board.getTimerNextGameStatus(), 1);
		board.setTimerStatus(3);
		assertEquals(board.getTimerStatus(), 0);
  	}

  	/**
  	 * Test the creation of a new game
  	 * @throws Exception
  	 */
  	@Test
  	public void newGame() throws Exception {
		SolitaireBoard board = new SolitaireBoard();
		board.createBoard(null);
		board.setDeckThroughs(2);
		board.newGame(0);
		//assertEquals(board.getDeckThroughs(), 1);
  	}

  	@Test
  	public void recordGame() {
  		assertTrue(false);
  	}

  	@Test
  	public void resetStats() throws Exception {
		SolitaireBoard target = new SolitaireBoard();
		target.resetStats();
		assertTrue(false);
  	}

  	@Test
  	public void saveOptions() throws Exception {
  		SolitaireBoard board = new SolitaireBoard();
  		board.saveOptions();
  		assertTrue(false);
  	}

  	/**
  	 * Test setting the appearance, specifically
  	 * the deck, and background elements.
  	 * @throws Exception
  	 */
  	@Test
  	public void setAppearance() throws Exception {
		SolitaireBoard board = new SolitaireBoard();
		int deck = 1;
		int background = 1;
		board.createBoard(null);
		board.setAppearance(deck, background);
		assertEquals(board.getDeckNumber(), 1);
		assertEquals(board.getBackgroundNumber(), 1);
  	}

  	/**
  	 * Test setting the background number
  	 * This tests both getters and setters
  	 */
  	@Test
  	public void setBackgroundNumber() {
	  	SolitaireBoard board = new SolitaireBoard();
	  	board.setBackgroundNumber(1);
	  	assertEquals(board.getBackgroundNumber(), 1);
	  	board.setBackgroundNumber(6);
	  	assertEquals(board.getBackgroundNumber(), 2);
  	}

  	/**
  	 * Test setting the deck number
  	 * This tests both getters and setters
  	 */
  	@Test
  	public void setDeckNumber() {
  		SolitaireBoard board = new SolitaireBoard();
  		board.setDeckNumber(1);
  		assertEquals(board.getDeckNumber(), 1);
  		board.setDeckNumber(3);
  		assertEquals(board.getDeckNumber(), 3);
  		board.setDeckNumber(4);
  		assertEquals(board.getDeckNumber(), 3);
  		
  	}

  	/**
  	 * Test setting the deck through count
  	 * @throws Exception
  	 */
  	@Test
  	public void setDeckThroughs() throws Exception {
  		SolitaireBoard board = new SolitaireBoard();
  		int deckThroughs = 0;
  		board.setDeckThroughs(deckThroughs);
  		//assertEquals(board.getDeckThroughs(), 0);
  		board.setDeckThroughs(2);
  		//assertEquals(board.getDeckThroughs(), 2);
  	}

  	/**
  	 * Test setting the current difficulty
  	 * This tests both getters and setters
  	 */
  	@Test
  	public void setDifficulty() {
  		SolitaireBoard board = new SolitaireBoard();
  		board.setDifficulty(0);
  		assertEquals(board.getDifficulty(), 2);
  		board.setDifficulty(1);
  		assertEquals(board.getDifficulty(), 1);
  		board.setDifficulty(2);
  		assertEquals(board.getDifficulty(), 2);
  		board.setDifficulty(3);
  		assertEquals(board.getDifficulty(), 3);
  		board.setDifficulty(4);
  		assertEquals(board.getDifficulty(), 2);
  	}

  	/**
  	 * Test setting the current draw count
  	 * This tests both getters and setters
  	 */
  	@Test
  	public void setDrawCount() {
  		SolitaireBoard board = new SolitaireBoard();
  		board.setDrawCount(0);
  		assertEquals(board.getDrawCount(), 1);
  		board.setDrawCount(1);
  		assertEquals(board.getDrawCount(), 1);
  		board.setDrawCount(3);
  		assertEquals(board.getDrawCount(), 3);
  	}

  	/**
  	 * Test setting the new difficulty
  	 * This tests both getters and setters
  	 */
  	@Test
  	public void setNewDifficulty() {
  		SolitaireBoard board = new SolitaireBoard();
  		board.setNewDifficulty(0);
  		assertEquals(board.getNewDifficulty(), 2);
  		board.setNewDifficulty(1);
  		assertEquals(board.getNewDifficulty(), 1);
  		board.setNewDifficulty(2);
  		assertEquals(board.getNewDifficulty(), 2);
  		board.setNewDifficulty(3);
  		assertEquals(board.getNewDifficulty(), 3);
  		board.setNewDifficulty(4);
  		assertEquals(board.getNewDifficulty(), 2);
  	}

  	/**
  	 * Test setting the new draw count
  	 * This tests both getters and setters
  	 */
  	@Test
  	public void setNewDrawCount() {
  		SolitaireBoard board = new SolitaireBoard();
  		board.setNewDrawCount(1);
  		assertEquals(board.getNewDrawCount(), 1);
  		board.setNewDrawCount(2);
  		assertEquals(board.getNewDrawCount(), 1);
  		board.setNewDrawCount(3);
  		assertEquals(board.getNewDrawCount(), 3);
  	}

  	/**
  	 * Test that sets the timer status of future games
  	 * This tests both getters and setters
  	 * @throws Exception
  	 */
  	@Test
  	public void setTimerStatus() throws Exception {
		SolitaireBoard board = new SolitaireBoard();
		board.setTimerStatus(4);
		assertEquals(board.getTimerStatus(), 0);
		board.setTimerStatus(1);
		assertEquals(board.getTimerStatus(), 0);
		board.createBoard(null);
		board.newGame(0);
		board.setTimerStatus(0);
		assertEquals(board.getTimerStatus(), 0);
		board.newGame(0);
		assertEquals(board.getTimerStatus(), 0);
		
  	}

  	/**
  	 * Test setting the win animation status
  	 * This tests both getters and setters
  	 */
  	@Test
  	public void setWinAnimationStatus() {
  		SolitaireBoard board = new SolitaireBoard();
  		board.setWinAnimationStatus(0);
  		assertEquals(board.getWinAnimationStatus(), 0);
  		board.setWinAnimationStatus(1);
  		assertEquals(board.getWinAnimationStatus(), 1);
  		board.setWinAnimationStatus(3);
  		assertEquals(board.getWinAnimationStatus(), 0);
  	}

  	/**
  	 * Test setting the win sound status
  	 * This tests both getters and setters
  	 */
  	@Test
  	public void setWinSoundsStatus() {
  		SolitaireBoard board = new SolitaireBoard();
  		board.setWinSoundsStatus(0);
  		assertEquals(board.getWinSoundsStatus(), 0);
  		board.setWinSoundsStatus(1);
  		assertEquals(board.getWinSoundsStatus(), 1);
  		board.setWinSoundsStatus(3);
  		assertEquals(board.getWinSoundsStatus(), 0);
  	}

  	/**
  	 * This is a UI Bound method and as such will not 
  	 * be Unit tested, but tested in during integration
  	 * and system testing. 
  	 * @throws Exception
  	 */
  	@Test
  	public void undoMove() throws Exception {
  	}

}
