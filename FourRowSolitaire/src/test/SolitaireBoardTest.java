package test;

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
  public void getBackgroundNumber() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getDeckNumber() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getDifficulty() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getDrawCount() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getHint() throws Exception {
	  SolitaireBoard target = new SolitaireBoard();
	  target.getHint();
  }

  @Test
  public void getNewDifficulty() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getNewDrawCount() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getTimerNextGameStatus() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getTimerStatus() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getWinAnimationStatus() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getWinSoundsStatus() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void newGame() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void recordGame() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void resetStats() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void saveOptions() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void setAppearance() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void setBackgroundNumber() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void setDeckNumber() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void setDeckThroughs() throws Exception {
	  SolitaireBoard target = new SolitaireBoard();
	  int deckThroughs = 0;
	  target.setDeckThroughs(deckThroughs);
  }

  @Test
  public void setDifficulty() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void setDrawCount() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void setNewDifficulty() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void setNewDrawCount() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void setTimerStatus() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void setWinAnimationStatus() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void setWinSoundsStatus() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void undoMove() throws Exception {
	  SolitaireBoard target = new SolitaireBoard();
	  target.undoMove();
  }
  
  @Test
	public void test_createBoard_A$LinkedList() throws Exception {

		SolitaireBoard target = new SolitaireBoard();
		LinkedList<Integer> cards = null;
		target.createBoard(cards);
	}

  @Test
	public void test_newGame_A$int() throws Exception {

		SolitaireBoard target = new SolitaireBoard();
		int winOrLoss = 0;
		target.newGame(winOrLoss);
	}

  @Test
	public void test_resetStats_A$() throws Exception {

		SolitaireBoard target = new SolitaireBoard();
		target.resetStats();
	}

  @Test
	public void test_saveOptions_A$() throws Exception {

		SolitaireBoard target = new SolitaireBoard();
		target.saveOptions();
	}

  @Test
	public void test_setAppearance_A$int$int() throws Exception {

		SolitaireBoard target = new SolitaireBoard();
		int deck = 0;
		int background = 0;
		target.setAppearance(deck, background);
	}

  @Test
	public void test_getTimerNextGameStatus_A$() throws Exception {

		SolitaireBoard target = new SolitaireBoard();
		int actual = target.getTimerNextGameStatus();
		int expected = 0;
		assertEquals(expected, actual);
	}

  @Test
	public void test_getTimerStatus_A$() throws Exception {

		SolitaireBoard target = new SolitaireBoard();
		int actual = target.getTimerStatus();
		int expected = 0;
		assertEquals(expected, actual);
	}

  @Test
	public void test_setTimerStatus_A$int() throws Exception {

		SolitaireBoard target = new SolitaireBoard();
		int timerInt = 0;
		target.setTimerStatus(timerInt);
	}

  @Test
	public void test_setDeckThroughs_A$int() throws Exception {

		SolitaireBoard target = new SolitaireBoard();
		int deckThroughs = 0;
		target.setDeckThroughs(deckThroughs);
	}

  @Test
	public void test_undoMove_A$() throws Exception {

		SolitaireBoard target = new SolitaireBoard();
		target.undoMove();
	}

  @Test
	public void test_getHint_A$() throws Exception {

		SolitaireBoard target = new SolitaireBoard();
		target.getHint();
	}
}
