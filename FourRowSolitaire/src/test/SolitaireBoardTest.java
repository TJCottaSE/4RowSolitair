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
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
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
		assertEquals(board.getDeckThroughs(), 1);
  	}

  	/**
  	 * Method to test that resetting statistics actually
  	 * sets the values to 0's. 
  	 * @throws Exception
  	 */
  	@Test
  	public void resetStats() throws Exception {
		SolitaireBoard target = new SolitaireBoard();
		target.resetStats();
		//assertTrue(false);
        int count = 0, temp = 1;
        int gamesPlayed1e = 1, gamesWon1e = 1, winStreak1e = 1, lossStreak1e = 1,
            currentStreak1e = 1;
        int gamesPlayed1m = 1, gamesWon1m = 1, winStreak1m = 1, lossStreak1m = 1,
            currentStreak1m = 1;
        int gamesPlayed1h = 1, gamesWon1h = 1, winStreak1h = 1, lossStreak1h = 1,
            currentStreak1h = 1;
        int gamesPlayed3e = 1, gamesWon3e = 1, winStreak3e = 1, lossStreak3e = 1,
            currentStreak3e = 1;
        int gamesPlayed3m = 1, gamesWon3m = 1, winStreak3m = 1, lossStreak3m = 1,
            currentStreak3m = 1;
        int gamesPlayed3h = 1, gamesWon3h = 1, winStreak3h = 1, lossStreak3h = 1,
            currentStreak3h = 1;

        String fileLocation = System.getProperty("user.home") + System.getProperty("file.separator");
        File file = new File(fileLocation + "frs-statistics.dat");

        try
        {
            file.createNewFile();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }

        try
        {
            DataInputStream input = new DataInputStream(new FileInputStream(file));

            if(input.available() > 0)
            {
                temp = input.readInt();
                count++;
            }

            if(temp != -1)
            {
                gamesPlayed1m = temp;

                while((input.available() > 0) && count < 5)
                {
                    temp = input.readInt();
                    switch(count)
                    {
                        //case 0 is the format checker
                        case 1: gamesWon1m = temp; break;
                        case 2: winStreak1m = temp; break;
                        case 3: lossStreak1m = temp; break;
                        case 4: currentStreak1m = temp; break;

                        default: ; break;
                    }

                    count++;
                }
            }
            else
            {
                while((input.available() > 0) && count < 31)
                {
                    temp = input.readInt();
                    switch(count)
                    {
                        //case 0 is the format checker
                        case 1: gamesPlayed1e = temp; break;
                        case 2: gamesWon1e = temp; break;
                        case 3: winStreak1e = temp; break;
                        case 4: lossStreak1e = temp; break;
                        case 5: currentStreak1e = temp; break;

                        case 6: gamesPlayed1m = temp; break;
                        case 7: gamesWon1m = temp; break;
                        case 8: winStreak1m = temp; break;
                        case 9: lossStreak1m = temp; break;
                        case 10: currentStreak1m = temp; break;

                        case 11: gamesPlayed1h = temp; break;
                        case 12: gamesWon1h = temp; break;
                        case 13: winStreak1h = temp; break;
                        case 14: lossStreak1h = temp; break;
                        case 15: currentStreak1h = temp; break;

                        case 16: gamesPlayed3e = temp; break;
                        case 17: gamesWon3e = temp; break;
                        case 18: winStreak3e = temp; break;
                        case 19: lossStreak3e = temp; break;
                        case 20: currentStreak3e = temp; break;

                        case 21: gamesPlayed3m = temp; break;
                        case 22: gamesWon3m = temp; break;
                        case 23: winStreak3m = temp; break;
                        case 24: lossStreak3m = temp; break;
                        case 25: currentStreak3m = temp; break;

                        case 26: gamesPlayed3h = temp; break;
                        case 27: gamesWon3h = temp; break;
                        case 28: winStreak3h = temp; break;
                        case 29: lossStreak3h = temp; break;
                        case 30: currentStreak3h = temp; break;

                        default: ; break;
                    }
                    count++;
                }
            }
            input.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        assertTrue(gamesWon1e == 0);
        assertTrue(gamesPlayed1e == 0);
        assertTrue(currentStreak1e == 0);
        assertTrue(winStreak1e == 0);
        assertTrue(lossStreak1e == 0);

        assertTrue(gamesWon1m == 0);
        assertTrue(gamesPlayed1m == 0);
        assertTrue(currentStreak1m == 0);
        assertTrue(winStreak1m == 0);
        assertTrue(lossStreak1m == 0);

        assertTrue(gamesWon1h == 0);
        assertTrue(gamesPlayed1h == 0);
        assertTrue(currentStreak1h == 0);
        assertTrue(winStreak1h == 0);
        assertTrue(lossStreak1h == 0);

        assertTrue(gamesWon3e == 0);
        assertTrue(gamesPlayed3e == 0);
        assertTrue(currentStreak3e == 0);
        assertTrue(winStreak3e == 0);
        assertTrue(lossStreak3e == 0);

        assertTrue(gamesWon3m == 0);
        assertTrue(gamesPlayed3m == 0);
        assertTrue(currentStreak3m == 0);
        assertTrue(winStreak3m == 0);
        assertTrue(lossStreak3m == 0);

        assertTrue(gamesWon3h == 0);
        assertTrue(gamesPlayed3h == 0);
        assertTrue(currentStreak3h == 0);
        assertTrue(winStreak3h == 0);
        assertTrue(lossStreak3h == 0);
  	}

  	/**
  	 * Test saving and retrieving saved game options.
  	 * @throws Exception
  	 */
  	@Test
  	public void saveOptions() throws Exception {
  		SolitaireBoard board = new SolitaireBoard();
  		board.setDrawCount(2);
  		board.setNewDrawCount(3);
  		board.setDeckNumber(3);
  		board.setBackgroundNumber(1);
  		board.setTimerStatus(1);
  		board.setWinAnimationStatus(1);
  		board.setWinSoundsStatus(1);
  		board.setDeckThroughs(3);
  		board.setDifficulty(3);
  		board.setNewDifficulty(1);

  		board.saveOptions();
  		
  		// Read in Stats
        int count = 0, temp = 1;
        int gamesPlayed1e = 1, gamesWon1e = 1, winStreak1e = 1, lossStreak1e = 1,
            currentStreak1e = 1;
        int gamesPlayed1m = 1, gamesWon1m = 1, winStreak1m = 1, lossStreak1m = 1,
            currentStreak1m = 1;
        int gamesPlayed1h = 1, gamesWon1h = 1, winStreak1h = 1, lossStreak1h = 1,
            currentStreak1h = 1;
        int gamesPlayed3e = 1, gamesWon3e = 1, winStreak3e = 1, lossStreak3e = 1,
            currentStreak3e = 1;
        int gamesPlayed3m = 1, gamesWon3m = 1, winStreak3m = 1, lossStreak3m = 1,
            currentStreak3m = 1;
        int gamesPlayed3h = 1, gamesWon3h = 1, winStreak3h = 1, lossStreak3h = 1,
            currentStreak3h = 1;
        // Read in Settings
        int drawCount = -1, newDrawCount = -1, deckNumber = -1, backgroundNumber = -1, timerToRunNextGame = -1, 
        	winAnimationStatus = -1, winSoundsStatus = -1, deckThroughs = -1, difficulty = -1, newDifficulty = -1;

        String fileLocation = System.getProperty("user.home") + System.getProperty("file.separator");
        File file = new File(fileLocation + "frs-statistics.dat");

        try
        {
            file.createNewFile();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }

        try
        {
            DataInputStream input = new DataInputStream(new FileInputStream(file));

            if(input.available() > 0)
            {
                temp = input.readInt();
                count++;
            }

            if(temp != -1)
            {
                gamesPlayed1m = temp;

                while((input.available() > 0) && count < 5)
                {
                    temp = input.readInt();
                    switch(count)
                    {
                        //case 0 is the format checker
                        case 1: gamesWon1m = temp; break;
                        case 2: winStreak1m = temp; break;
                        case 3: lossStreak1m = temp; break;
                        case 4: currentStreak1m = temp; break;

                        default: ; break;
                    }

                    count++;
                }
            }
            else
            {
                while((input.available() > 0) && count < 31)
                {
                    temp = input.readInt();
                    switch(count)
                    {
                        //case 0 is the format checker
                        case 1: gamesPlayed1e = temp; break;
                        case 2: gamesWon1e = temp; break;
                        case 3: winStreak1e = temp; break;
                        case 4: lossStreak1e = temp; break;
                        case 5: currentStreak1e = temp; break;

                        case 6: gamesPlayed1m = temp; break;
                        case 7: gamesWon1m = temp; break;
                        case 8: winStreak1m = temp; break;
                        case 9: lossStreak1m = temp; break;
                        case 10: currentStreak1m = temp; break;

                        case 11: gamesPlayed1h = temp; break;
                        case 12: gamesWon1h = temp; break;
                        case 13: winStreak1h = temp; break;
                        case 14: lossStreak1h = temp; break;
                        case 15: currentStreak1h = temp; break;

                        case 16: gamesPlayed3e = temp; break;
                        case 17: gamesWon3e = temp; break;
                        case 18: winStreak3e = temp; break;
                        case 19: lossStreak3e = temp; break;
                        case 20: currentStreak3e = temp; break;

                        case 21: gamesPlayed3m = temp; break;
                        case 22: gamesWon3m = temp; break;
                        case 23: winStreak3m = temp; break;
                        case 24: lossStreak3m = temp; break;
                        case 25: currentStreak3m = temp; break;

                        case 26: gamesPlayed3h = temp; break;
                        case 27: gamesWon3h = temp; break;
                        case 28: winStreak3h = temp; break;
                        case 29: lossStreak3h = temp; break;
                        case 30: currentStreak3h = temp; break;

                        default: ; break;
                    }
                    count++;
                }
                // Read Setting Input
                count = 0;
                while((input.available() > 0) && count < 20){
                	temp = input.readInt();
                    switch(count)
                    {
                    	case 0: drawCount = temp; break;
                    	case 1: newDrawCount = temp; break;
                    	case 2: deckNumber = temp; break;
                    	case 3: backgroundNumber = temp; break;
                    	case 4: timerToRunNextGame = temp; break;
                    	
                    	case 5: winAnimationStatus = temp; break;
                    	case 6: winSoundsStatus = temp; break;
                    	case 7: deckThroughs = temp; break;
                    	case 8: difficulty = temp; break;
                    	case 9: newDifficulty = temp; break;
                    	
                    }
                    count++;
                }
            }
            input.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }

  		assertEquals(drawCount, 1);
  		assertEquals(newDrawCount, 3);
  		assertEquals(deckNumber, 3);
  		assertEquals(backgroundNumber, 1);
  		assertEquals(timerToRunNextGame, 1);
  		assertEquals(winAnimationStatus, 1);
  		assertEquals(winSoundsStatus, 1);
  		assertEquals(deckThroughs, 3);
  		assertEquals(difficulty, 3);
  		assertEquals(newDifficulty, 1);

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
  		assertEquals(board.getDeckThroughs(), 0);
  		board.setDeckThroughs(2);
  		assertEquals(board.getDeckThroughs(), 2);
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
