package test;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import java.awt.Color;
import java.awt.Graphics;
import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import FourRowSolitaire.SolitairePanel;

public class SolitairePanelTest {


  @BeforeClass
  public void beforeClass() {

  }

  @AfterClass
  public void afterClass() {
  }

  @Test
  public void SolitairePanel() {
    throw new RuntimeException("Test not implemented");
  }
  
  @Test
  public void test_type() throws Exception 
  {
	  assertNotNull(SolitairePanel.class);
  }
  
  @Test
  public void test_instantiation() throws Exception 
  {
	  SolitairePanel target = new SolitairePanel();
	  assertNotNull(target);
  }

  @Test
  public void changeBackground() throws Exception 
  {
	  SolitairePanel target = new SolitairePanel();
	  int back = 0;
	  target.changeBackground(back);
  }

  
  @Test
  public void paintComponent() throws Exception 
  {
	  SolitairePanel target = new SolitairePanel();
	  Graphics g = null;
	  target.paintComponent(g);
	  assertNotNull(target);    
  }
}

