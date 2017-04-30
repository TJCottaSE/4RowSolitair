package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import FourRowSolitaire.FireworksDisplay;

public class FireworksDisplayTest {

	FireworksDisplay fw;
	
  @BeforeClass
  public void beforeClass() {
	  fw = new FireworksDisplay(3,2);
  }

  @AfterClass
  public void afterClass() {
  }

  @Test
  public void FireworksDisplay() {
	  
	  assertEquals(fw.getBackground(), Color.BLACK);
    
  }

  @Test
  public void randomColor() {
    assertFalse(fw.randomColor().equals(null));
  }
}
