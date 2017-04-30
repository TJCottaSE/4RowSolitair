	 package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;	 

import org.testng.annotations.Test;

import FourRowSolitaire.ChangeAppearance;

public class ChangeAppearanceTest {
	


  @Test
  public void ChangeAppearance() throws Exception {
	  assertNotNull(ChangeAppearance.class);

  }

  @Test
  public void getBackgroundNumber() throws Exception {

		final JFrame parent = new JFrame();
		final int deckNumber = 1;
		final int backgroundNumber = 1;
		
		Robot bot = new Robot();
		
		class UI implements Runnable {
			int actual = -1;
			public void run() {
				ChangeAppearance target = new ChangeAppearance(parent, deckNumber, backgroundNumber);
				actual = target.getBackgroundNumber();
			}
			public int getActual(){
				return actual;
			}
		}
		UI ui = new UI();
		ui.run();
		
		
		bot.keyPress(KeyEvent.VK_TAB);
		bot.keyPress(KeyEvent.VK_TAB);
		bot.keyPress(KeyEvent.VK_SPACE);
		int actual = ui.getActual();
		int expected = 1;
		assertEquals(expected, actual);
  }

  @Test
  public void getDeckNumber() throws Exception {

		JFrame parent = new JFrame();
		int deckNumber = 1;
		int backgroundNumber = 1;
		ChangeAppearance target = new ChangeAppearance(parent, deckNumber, backgroundNumber);
		int actual = target.getDeckNumber();
		int expected = 1;
		assertEquals(expected, actual);
  }
   
}