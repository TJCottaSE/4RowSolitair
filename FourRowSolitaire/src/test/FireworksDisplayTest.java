package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import FourRowSolitaire.FireworksDisplay;

public class FireworksDisplayTest {

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @Test
  public void FireworksDisplay() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void actionPerformed() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void paint() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void randomColor() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void restartDisplay() {
    throw new RuntimeException("Test not implemented");
  }
  
  @Test
	public void test_type() throws Exception {
		
		assertNotNull(FireworksDisplay.class);
	}
  @Test
	public void test_instantiation() throws Exception {
		
		int num = 0;
		int size = 0;
		FireworksDisplay target = new FireworksDisplay(num, size);
		assertNotNull(target);
	}
  @Test
	public void test_restartDisplay_A$() throws Exception {
		
		int num = 0;
		int size = 0;
		FireworksDisplay target = new FireworksDisplay(num, size);
		target.restartDisplay();
	}
  @Test
	public void test_randomColor_A$() throws Exception {
		
		int num = 0;
		int size = 0;
		FireworksDisplay target = new FireworksDisplay(num, size);
		Color actual = target.randomColor();
		Color expected = null;
		assertEquals(expected, actual);
	}
  @Test
	public void test_paint_A$Graphics() throws Exception {
		
		int num = 0;
		int size = 0;
		FireworksDisplay target = new FireworksDisplay(num, size);
		Graphics g = null;
		target.paint(g);
	}
  @Test
	public void test_actionPerformed_A$ActionEvent() throws Exception {
		
		int num = 0;
		int size = 0;
		FireworksDisplay target = new FireworksDisplay(num, size);
		ActionEvent e = null;
		target.actionPerformed(e);
	}

}
