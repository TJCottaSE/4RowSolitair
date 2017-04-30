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
  public void ChangeOptions() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void actionPerformed() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getAnimation() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getDifficulty() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getDrawCount() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getSounds() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getTimer() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void setup() {
    throw new RuntimeException("Test not implemented");
  }
  
  @Test
	public void test_type() throws Exception {
	
		assertNotNull(ChangeOptions.class);
	}
  @Test
	public void test_instantiation() throws Exception {
		
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
	public void test_actionPerformed_A$ActionEvent() throws Exception {
		
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
}
