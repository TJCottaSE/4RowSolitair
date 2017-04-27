package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

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
  }

  @Test
  public void layoutContainer() throws Exception 
  {
	  
	  SolitaireLayout target = new SolitaireLayout();
	  Container parent = null;
	  target.layoutContainer(parent);
  }

  @Test
  public void minimumLayoutSize() throws Exception 
  {
	  
	  SolitaireLayout target = new SolitaireLayout();
	  Container parent = null;
	  Dimension actual = target.minimumLayoutSize(parent);
	  Dimension expected = null;
	  assertEquals(expected, actual);
  }

  @Test
  public void preferredLayoutSize() throws Exception 
  {
	  
	  SolitaireLayout target = new SolitaireLayout();
	  Container parent = null;
	  Dimension actual = target.preferredLayoutSize(parent);
	  Dimension expected = null;
	  assertEquals(expected, actual);
  }

  @Test
  public void removeLayoutComponent() throws Exception 
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
	  Component comp = null;
	  target.removeLayoutComponent(comp);
	  target1.removeLayoutComponent(comp);
	  target2.removeLayoutComponent(comp);
	  target3.removeLayoutComponent(comp);
	  target4.removeLayoutComponent(comp);
	  target5.removeLayoutComponent(comp);
	  target6.removeLayoutComponent(comp);
	  target7.removeLayoutComponent(comp);
	  target8.removeLayoutComponent(comp);
	  target9.removeLayoutComponent(comp);
	  target10.removeLayoutComponent(comp);
	  target11.removeLayoutComponent(comp);
	  target12.removeLayoutComponent(comp);
	  target13.removeLayoutComponent(comp);
  }
  
  @Test
  public void test_type() throws Exception 
  {
	  assertNotNull(SolitaireLayout.class);
  }
  
  @Test
  public void test_instantiation() throws Exception 
  {
	  SolitaireLayout target = new SolitaireLayout();
	  assertNotNull(target);
  }
}

