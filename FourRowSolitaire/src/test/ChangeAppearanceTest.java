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
	
	JFrame parent = null;

	int deckNumber1 = 1;
	int deckNumber2 = 2;
	int deckNumber3 = 2;

	int backgroundNumber1 = 1;
	int backgroundNumber2 = 2;
	int backgroundNumber3 = 3;
	
	ChangeAppearance target1 = new ChangeAppearance(parent, deckNumber1, backgroundNumber1);
	ChangeAppearance target2 = new ChangeAppearance(parent, deckNumber1, backgroundNumber2);
	ChangeAppearance target3 = new ChangeAppearance(parent, deckNumber1, backgroundNumber3);
	ChangeAppearance target4 = new ChangeAppearance(parent, deckNumber2, backgroundNumber1);
	ChangeAppearance target5 = new ChangeAppearance(parent, deckNumber2, backgroundNumber2);
	ChangeAppearance target6 = new ChangeAppearance(parent, deckNumber2, backgroundNumber3);
	ChangeAppearance target7 = new ChangeAppearance(parent, deckNumber3, backgroundNumber1);
	ChangeAppearance target8 = new ChangeAppearance(parent, deckNumber3, backgroundNumber2);
	ChangeAppearance target9 = new ChangeAppearance(parent, deckNumber3, backgroundNumber3);

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @Test
  public void ChangeAppearance() {
	  
	  	assertNotNull(ChangeAppearance.class);

		assertNotNull(target1);
		assertNotNull(target2);
		assertNotNull(target3);
		assertNotNull(target4);
		assertNotNull(target5);
		assertNotNull(target6);
		assertNotNull(target7);
		assertNotNull(target8);
		assertNotNull(target9);

	}

  @Test
  public void actionPerformed() throws Exception {
	  
		ActionEvent e = null;
		
		target1.actionPerformed(e);
		target2.actionPerformed(e);
		target3.actionPerformed(e);
		target4.actionPerformed(e);
		target5.actionPerformed(e);
		target6.actionPerformed(e);
		target7.actionPerformed(e);
		target8.actionPerformed(e);
		target9.actionPerformed(e);
		
  }

  @Test
  public void getBackgroundNumber() throws Exception {

		int actual1 = target1.getBackgroundNumber();
		int actual2 = target2.getBackgroundNumber();
		int actual3 = target3.getBackgroundNumber();
		int actual4 = target4.getBackgroundNumber();
		int actual5 = target5.getBackgroundNumber();
		int actual6 = target6.getBackgroundNumber();
		int actual7 = target7.getBackgroundNumber();
		int actual8 = target8.getBackgroundNumber();
		int actual9 = target9.getBackgroundNumber();
		
		int expected1 = 1;
		int expected2 = 2;
		int expected3 = 3;

		assertEquals(expected1, actual1);
		assertEquals(expected2, actual2);
		assertEquals(expected3, actual3);
		assertEquals(expected1, actual4);
		assertEquals(expected2, actual5);
		assertEquals(expected3, actual6);
		assertEquals(expected1, actual7);
		assertEquals(expected2, actual8);
		assertEquals(expected3, actual9);
  }

  @Test
  public void getDeckNumber() throws Exception {
	  
		int actual1 = target1.getDeckNumber();
		int actual2 = target2.getDeckNumber();
		int actual3 = target3.getDeckNumber();
		int actual4 = target4.getDeckNumber();
		int actual5 = target5.getDeckNumber();
		int actual6 = target6.getDeckNumber();
		int actual7 = target7.getDeckNumber();
		int actual8 = target8.getDeckNumber();
		int actual9 = target9.getDeckNumber();
		
		int expected1 = 1;
		int expected2 = 2;
		int expected3 = 3;

		assertEquals(expected1, actual1);
		assertEquals(expected1, actual2);
		assertEquals(expected1, actual3);
		assertEquals(expected2, actual4);
		assertEquals(expected2, actual5);
		assertEquals(expected2, actual6);
		assertEquals(expected3, actual7);
		assertEquals(expected3, actual8);
		assertEquals(expected3, actual9);

  }

  @Test
  public void setup() {
    throw new RuntimeException("Test not implemented");
  }

}