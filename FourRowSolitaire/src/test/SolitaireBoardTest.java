package test;
/**
 * This Unit Test is designed to test most of the methods
 * in this class excluding any UI related components
 * @author Tony Cotta, 
 */
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

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
  	public void SolitaireBoard(){
	  	throw new RuntimeException("Test not implemented");
  	}
  
  	@Test
	public void test_type() throws Exception {
		assertNotNull(SolitaireBoard.class);
	}
  	
  	@Test
	public void test_instantiation() throws Exception {
		SolitaireBoard target = new SolitaireBoard();
		assertNotNull(target);
	}

  	@Test
  	public void clearBoard() {
	  	throw new RuntimeException("Test not implemented");
  	}

  	@Test
  	public void createBoard() throws Exception {
	  	SolitaireBoard target = new SolitaireBoard();
	  	LinkedList<Integer> cards = null;
	  	target.createBoard(cards);
  	}

  	@Test
  	public void dealOutBoard() {
	  	throw new RuntimeException("Test not implemented");
  	}

  	@Test
  	public void dealOutCustomBoard() {
	  	throw new RuntimeException("Test not implemented");
  	}

  	@Test
  	public void getHint() throws Exception {
	  	SolitaireBoard target = new SolitaireBoard();
	  	target.getHint();
  	}

  	@Test
  	public void getTimerNextGameStatus() throws Exception {

		SolitaireBoard target = new SolitaireBoard();
		int actual = target.getTimerNextGameStatus();
		int expected = 0;
		assertEquals(expected, actual);
  	}

  	@Test
  	public void getTimerStatus() throws Exception {

		SolitaireBoard target = new SolitaireBoard();
		int actual = target.getTimerStatus();
		int expected = 0;
		assertEquals(expected, actual);
  	}

  	@Test
  	public void newGame() throws Exception {

		SolitaireBoard target = new SolitaireBoard();
		int winOrLoss = 0;
		target.newGame(winOrLoss);
  	}

  	@Test
  	public void recordGame() {
	  	throw new RuntimeException("Test not implemented");
  	}

  	@Test
  	public void resetStats() throws Exception {

		SolitaireBoard target = new SolitaireBoard();
		target.resetStats();
  	}

  	@Test
  	public void saveOptions() throws Exception {

		SolitaireBoard target = new SolitaireBoard();
		target.saveOptions();
  	}

  	@Test
  	public void setAppearance() throws Exception {

		SolitaireBoard target = new SolitaireBoard();
		int deck = 0;
		int background = 0;
		target.setAppearance(deck, background);
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

  	@Test
  	public void setDeckThroughs() throws Exception {
  		SolitaireBoard target = new SolitaireBoard();
  		int deckThroughs = 0;
  		target.setDeckThroughs(deckThroughs);
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

  	@Test
  	public void setTimerStatus() throws Exception {

		SolitaireBoard target = new SolitaireBoard();
		int timerInt = 0;
		target.setTimerStatus(timerInt);
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

  	@Test
  	public void undoMove() throws Exception {
  		SolitaireBoard target = new SolitaireBoard();
  		target.undoMove();
  	}

}
