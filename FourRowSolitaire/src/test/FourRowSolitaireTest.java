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
  public void FourRowSolitaire() throws Exception {
	  assertNotNull(FourRowSolitaire.class);
	  FourRowSolitaire target = new FourRowSolitaire();
	  assertNotNull(target);
		
  }

  @Test
  public void actionPerformed() throws Exception {	
		FourRowSolitaire target = new FourRowSolitaire();
		ActionEvent e = null;
		target.actionPerformed(e);
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
  public void main() throws Exception {
		
		String[] args = new String[] {};
		FourRowSolitaire.main(args); 
  }
  
}
