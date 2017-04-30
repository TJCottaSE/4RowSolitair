package test;

import static org.testng.Assert.assertNotNull;

import java.awt.event.ActionEvent;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import FourRowSolitaire.FourRowSolitaire;

public class FourRowSolitaireTest {

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @Test
  public void FourRowSolitaire() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void actionPerformed() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void checkForUpdate() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void loadData() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void main() {
    throw new RuntimeException("Test not implemented");
  }
  
  @Test
	public void test_type() throws Exception {
		
		assertNotNull(FourRowSolitaire.class);
	}
  
  @Test
	public void test_instantiation() throws Exception {
		
		FourRowSolitaire target = new FourRowSolitaire();
		assertNotNull(target);
	}
  @Test
	public void test_main_A$StringArray() throws Exception {
		
		String[] args = new String[] {};
		FourRowSolitaire.main(args);
	}
  @Test
	public void test_actionPerformed_A$ActionEvent() throws Exception {
		
		FourRowSolitaire target = new FourRowSolitaire();
		ActionEvent e = null;
		target.actionPerformed(e);
	}
}

