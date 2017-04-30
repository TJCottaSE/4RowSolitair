package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.awt.Color;

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

  @Test
  public void restartDisplay() {
    throw new RuntimeException("Test not implemented");
  }

}
