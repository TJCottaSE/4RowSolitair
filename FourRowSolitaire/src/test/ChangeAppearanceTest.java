package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.awt.event.ActionEvent;

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

		JFrame parent = null;
		int deckNumber = 0;
		int backgroundNumber = 0;
		ChangeAppearance target = new ChangeAppearance(parent, deckNumber, backgroundNumber);
		int actual = target.getBackgroundNumber();
		int expected = 0;
		assertEquals(expected, actual);
  }

  @Test
  public void getDeckNumber() throws Exception {

		JFrame parent = null;
		int deckNumber = 0;
		int backgroundNumber = 0;
		ChangeAppearance target = new ChangeAppearance(parent, deckNumber, backgroundNumber);
		int actual = target.getDeckNumber();
		int expected = 0;
		assertEquals(expected, actual);
  }

  @Test
  public void setup() {
    throw new RuntimeException("Test not implemented");
  }

}