package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import FourRowSolitaire.ChangeAppearance;

public class ChangeAppearanceTest {
  @Test(dataProvider = "dp")

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @Test
  public void ChangeAppearance() {
    throw new RuntimeException("Test not implemented");
  }
  
  @Test
	public void test_type() throws Exception {

		assertNotNull(ChangeAppearance.class);
	}

  @Test
	public void test_instantiation() throws Exception {

		JFrame parent = null;
		int deckNumber = 0;
		int backgroundNumber = 0;
		ChangeAppearance target = new ChangeAppearance(parent, deckNumber, backgroundNumber);
		assertNotNull(target);
	}

  @Test
  public void actionPerformed() throws Exception {

		JFrame parent = null;
		int deckNumber = 0;
		int backgroundNumber = 0;
		ChangeAppearance target = new ChangeAppearance(parent, deckNumber, backgroundNumber);
		ActionEvent e = null;
		target.actionPerformed(e);
  }

  @Test
  public void getBackgroundNumber() throws Exception {

		JFrame parent = new JFrame();
		int deckNumber = 1;
		int backgroundNumber = 1;
		
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

  @Test
  public void setup() {
    throw new RuntimeException("Test not implemented");
  }

}