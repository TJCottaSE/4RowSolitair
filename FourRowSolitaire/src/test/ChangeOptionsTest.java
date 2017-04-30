package test;
/**
 * Test the ChangeOptions Class
 * @author Nolan Miller
 */

import static org.testng.Assert.assertEquals;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import FourRowSolitaire.ChangeOptions;

public class ChangeOptionsTest {
	
	public static final int SOUND_OFF = 0;
	public static final int SOUND_ON = 1;
	public static final int DIF_EASY = 1;
	public static final int DIF_MED = 2;
	public static final int DIF_HARD = 3;
	public static final int TIMER_OFF = 0;
	public static final int TIMER_ON = 1;
	public static final int ANIMATION_OFF = 0;
	public static final int ANIMATION_ON = 1;
	
	ChangeOptions co_1,co_2,co_3,co_4; 
	JFrame parent = null;

  @BeforeClass
  public void beforeClass() {
	  
	  co_3 = new ChangeOptions(parent, 3, TIMER_OFF, ANIMATION_OFF, SOUND_OFF, DIF_EASY);
	  co_4 = new ChangeOptions(parent, 1, TIMER_ON, ANIMATION_ON, SOUND_ON, DIF_MED);
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  co_3 = null;
	  co_4 = null;
  }

  /**
   * Test constructor
   */
  @Test
  public void ChangeOptions() {
    co_1 = new ChangeOptions(parent, 1, TIMER_OFF, ANIMATION_OFF, SOUND_OFF, DIF_MED);
    assertEquals(co_1.getTimer(), 0);
    assertEquals(co_1.getSounds(), 0);
    assertEquals(co_1.getDifficulty(), 2);
    assertEquals(co_1.getDrawCount(), 1);
    
    co_2 = new ChangeOptions(parent, 3, TIMER_ON, ANIMATION_ON, SOUND_ON, DIF_HARD);
    assertEquals(co_2.getTimer(), 1);
    assertEquals(co_2.getSounds(), 1);
    assertEquals(co_2.getDifficulty(), 3);
    assertEquals(co_2.getDrawCount(), 3);
  }

  /**
   * Test get animation
   */
  @Test
  public void getAnimation() {
	  
	  assertEquals(co_3.getAnimation(), ANIMATION_OFF);
	  assertEquals(co_4.getAnimation(), ANIMATION_ON);
	  
	  co_4.setExited(true);
	  assertEquals(co_4.getAnimation(), -1);
	  co_4.setExited(false);
  }

  /**
   * Test get difficulty
   */
  @Test
  public void getDifficulty() {
    
	  assertEquals(co_3.getDifficulty(), DIF_EASY);
	  assertEquals(co_4.getDifficulty(), DIF_MED);
	  
  }

  /**
   * Test getDrawCount
   */
  @Test
  public void getDrawCount() {
    
	  assertEquals(co_3.getDrawCount(), 3);
	  assertEquals(co_4.getDrawCount(), 1);
	  
	  co_4.setExited(true);
	  assertEquals(co_4.getDrawCount(), -1);
	  co_4.setExited(false);

  }

  /**
   * Test getSounds
   */
  @Test
  public void getSounds() {
    
	  assertEquals(co_3.getSounds(), 0);
	  assertEquals(co_4.getSounds(), 1);
	  
	  co_4.setExited(true);
	  assertEquals(co_4.getSounds(), -1);
	  co_4.setExited(false);
	  
  }

  /** 
   * Test getTimer
   */
  @Test
  public void getTimer() {
    
	  assertEquals(co_3.getTimer(), 0);
	  assertEquals(co_4.getTimer(), 1);
	  
	  co_4.setExited(true);
	  assertEquals(co_4.getTimer(), -1);
	  co_4.setExited(false);
	  
  }
  
}
