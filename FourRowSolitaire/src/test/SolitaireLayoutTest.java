package test;

import static org.testng.Assert.assertNotNull;

import java.awt.Checkbox;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import FourRowSolitaire.SolitaireLayout;

public class SolitaireLayoutTest {
	

  @BeforeClass
  public void beforeClass() {
	 
  }

  @AfterClass
  public void afterClass() {
	  
  }

  @Test
  public void SolitaireLayout() throws Exception 
  {
	  assertNotNull(SolitaireLayout.class);
	  SolitaireLayout target = new SolitaireLayout();
	  assertNotNull(target);
  }
  
  @Test
  public void addLayoutComponent() throws Exception 
  {
	  SolitaireLayout target = new SolitaireLayout();
	  SolitaireLayout target1 = new SolitaireLayout();
	  SolitaireLayout target2 = new SolitaireLayout();
	  SolitaireLayout target3 = new SolitaireLayout();
	  SolitaireLayout target4 = new SolitaireLayout();
	  SolitaireLayout target5 = new SolitaireLayout();
	  SolitaireLayout target6 = new SolitaireLayout();
	  SolitaireLayout target7 = new SolitaireLayout();
	  SolitaireLayout target8 = new SolitaireLayout();
	  SolitaireLayout target9 = new SolitaireLayout();
	  SolitaireLayout target10 = new SolitaireLayout();
	  SolitaireLayout target11 = new SolitaireLayout();
	  SolitaireLayout target12 = new SolitaireLayout();
	  SolitaireLayout target13 = new SolitaireLayout();
	  SolitaireLayout target14 = new SolitaireLayout();
	  Component comp = null;
	  target.addLayoutComponent("Column One", comp);
	  target1.addLayoutComponent("Column Two", comp);
	  target2.addLayoutComponent("Column Three", comp);
	  target3.addLayoutComponent("Column Four", comp);
	  target4.addLayoutComponent("Spaces Ace Pile", comp);
	  target5.addLayoutComponent("Clubs Ace Pile", comp);
	  target6.addLayoutComponent("Diamonds Ace Pile", comp);
	  target7.addLayoutComponent("Hears Ace Pile", comp);
	  target8.addLayoutComponent("Discard Pile", comp);
	  target9.addLayoutComponent("Deck", comp);
	  target10.addLayoutComponent("Cell One", comp);
	  target11.addLayoutComponent("Cell Two", comp);
	  target12.addLayoutComponent("Cell Three", comp);
	  target13.addLayoutComponent("Cell Four", comp);
	  target14.addLayoutComponent("Cell Four", comp);
	  
  }

  @Test
  public void layoutContainer() throws Exception 
  {
	  Component comp = null;
	  Component cellFour = comp;
		 
	  comp = cellFour;
	  
	  SolitaireLayout target = new SolitaireLayout();
	  Container parent = null;
	  target.layoutContainer(parent);
	  
  }

  @Test (expectedExceptions = UnsupportedOperationException.class)
  public void minimumLayoutSize() throws Exception 
  {
	  Dimension actual = null;
	  SolitaireLayout target = new SolitaireLayout();
	  Container parent = null;
	  actual = target.minimumLayoutSize(parent);

  }

  @Test (expectedExceptions = UnsupportedOperationException.class)
  public void preferredLayoutSize() throws Exception 
  {
	  Dimension actual = null;
	  SolitaireLayout target = new SolitaireLayout();
	  Container parent = null;
	  actual = target.preferredLayoutSize(parent);

  }

  @Test
  public void removeLayoutComponent() throws Exception 
  {
		 Component s1 = new Checkbox("test 1");
		 Component s2 = new Checkbox("test 1");
		 Component s3 = new Checkbox("test 1");
		 Component s4 = new Checkbox("test 1");
		 Component s5 = new Checkbox("test 1");
		 Component s6 = new Checkbox("test 1");
		 Component s7 = new Checkbox("test 1");
		 Component s8 = new Checkbox("test 1");
		 Component s9 = new Checkbox("test 1");
		 Component s10 = new Checkbox("test 1");
		 Component s11 = new Checkbox("test 1");
		 Component s12 = new Checkbox("test 1");
		 Component s13 = new Checkbox("test 1");
		 Component s14 = new Checkbox("test 1");
	
	  SolitaireLayout target = new SolitaireLayout();
	  
	  target.addLayoutComponent("Column One", s1);
	  target.addLayoutComponent("Column Two", s2);
	  target.addLayoutComponent("Column Three", s3);
	  target.addLayoutComponent("Column Four", s4);
	  target.addLayoutComponent("Spaces Ace Pile", s5);
	  target.addLayoutComponent("Clubs Ace Pile", s6);
	  target.addLayoutComponent("Diamonds Ace Pile", s7);
	  target.addLayoutComponent("Hears Ace Pile", s8);
	  target.addLayoutComponent("Discard Pile", s9);
	  target.addLayoutComponent("Deck", s10);
	  target.addLayoutComponent("Cell One", s11);
	  target.addLayoutComponent("Cell Two", s12);
	  target.addLayoutComponent("Cell Three", s13);
	  target.addLayoutComponent("Cell Four", s14);

	  target.removeLayoutComponent(s1);
	  target.removeLayoutComponent(s2);
	  target.removeLayoutComponent(s3);
	  target.removeLayoutComponent(s4);
	  target.removeLayoutComponent(s5);
	  target.removeLayoutComponent(s6);
	  target.removeLayoutComponent(s7);
	  target.removeLayoutComponent(s8);
	  target.removeLayoutComponent(s9);
	  target.removeLayoutComponent(s10);
	  target.removeLayoutComponent(s11);
	  target.removeLayoutComponent(s12);
	  target.removeLayoutComponent(s13);
	  target.removeLayoutComponent(s14);
  }
}
