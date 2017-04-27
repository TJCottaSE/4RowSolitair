package test;

import static org.testng.Assert.assertNotNull;

import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import FourRowSolitaire.WinScreen;


public class WinScreenTest extends TestNG {

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @Test
  public void test_type() throws Exception 
  {
	  assertNotNull(WinScreen.class);
  }
  
  @Test
  public void test_instantiation() throws Exception 
  {
	  int animation = 0;
	  int sounds = 0;
	  WinScreen target = new WinScreen(animation, sounds);
	  assertNotNull(target);
  }

}

