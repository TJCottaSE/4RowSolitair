package test;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.lang.reflect.Method;
import java.net.URL;
import javax.swing.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import FourRowSolitaire.SolitairePanel;

public class SolitairePanelTest extends JPanel {


  @BeforeClass
  public void beforeClass() {

  }

  @AfterClass
  public void afterClass() {
  }

  @Test
  public void SolitairePanel() throws Exception {

	  assertNotNull(SolitairePanel.class);
	  SolitairePanel target = new SolitairePanel();
	  assertNotNull(target);

  }

  @Test
  public void changeBackground() throws Exception 
  {
	  SolitairePanel target = new SolitairePanel();
	  int back = 0;
	  target.changeBackground(back);
	  int back1 = 1;
	  target.changeBackground(back1);
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

