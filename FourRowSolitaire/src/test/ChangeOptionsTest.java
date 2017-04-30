package test;

import static org.testng.Assert.assertNotNull;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import FourRowSolitaire.ChangeOptions;

public class ChangeOptionsTest {

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @Test
  public void ChangeOptions() throws Exception {
		
		assertNotNull(ChangeOptions.class);

		JFrame parent = null;
		int currentDraw = 0;
		int timer = 0;
		int animation = 0;
		int sounds = 0;
		int difficulty = 0;
		ChangeOptions target = new ChangeOptions(parent, currentDraw, timer, animation, sounds, difficulty);
		assertNotNull(target);
	
  }

  @Test
  public void actionPerformed() throws Exception {
		
		JFrame parent = null;
		int currentDraw = 0;
		int timer = 0;
		int animation = 0;
		int sounds = 0;
		int difficulty = 0;
		ChangeOptions target = new ChangeOptions(parent, currentDraw, timer, animation, sounds, difficulty);
		ActionEvent e = null;
		//target.actionPerformed(e);
  }

  @Test
  public void getAnimation() throws Exception {

  }

  @Test
  public void getDifficulty() throws Exception {

  }

  @Test
  public void getDrawCount() throws Exception {

  }

  @Test
  public void getSounds() throws Exception {

  }

  @Test
  public void getTimer() throws Exception {

  }

  @Test
  public void setup() throws Exception {

  }

}
