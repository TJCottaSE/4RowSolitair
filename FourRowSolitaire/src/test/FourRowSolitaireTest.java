package test;

import static org.testng.Assert.assertNotNull;

import java.awt.Checkbox;
import java.awt.Component;
import java.awt.GraphicsConfiguration;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import FourRowSolitaire.FourRowSolitaire;
import FourRowSolitaire.SolitaireBoard;
import FourRowSolitaire.SolitaireLayout;

public class FourRowSolitaireTest  extends TestNG {


	public static String version = ".40";
    
	FourRowSolitaire target1 = new FourRowSolitaire();

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @Test
  public void FourRowSolitaire() throws Exception 
  {
	  assertNotNull(FourRowSolitaire.class);
	  FourRowSolitaire target = new FourRowSolitaire();
	  assertNotNull(target);
  }
  
  @Test
  public void checkForUpdate() throws Exception 
  {
	  FourRowSolitaire target = new FourRowSolitaire();
	  String inputLine = "ADOCTYPE";
	  version = inputLine;
	  URL targetURL = new URL("http://example.com/");
	  assertNotNull(targetURL);
	  
	  BufferedReader in = new BufferedReader(new InputStreamReader(targetURL.openStream()));
	  
      in.close();
    	
  }


  @Test
  public void loadData() throws IOException {
	  FourRowSolitaire target = new FourRowSolitaire();
	  assertNotNull(target);
  }
  
  @Test
  public void main() throws Exception {
	  String[] args = new String[] {};
	  FourRowSolitaire.main(args);
  }
   
  @Test
  public void actionPerformed() throws Exception {
	  
	  int count = 0;
	  int deckNumber = 1;
	  int backgroundNumber = 1;
	  
	  JMenu game = new JMenu("Game");
	  JMenu helpMenu = new JMenu("Help");
	  JMenuItem newGame = new JMenuItem("New Game");
	  JMenuItem undo = new JMenuItem("Undo Last Move");
	  JMenuItem hint = new JMenuItem("Hint");
	  JMenuItem statistics = new JMenuItem("Statistics");
	  JMenuItem options = new JMenuItem("Options");
	  JMenuItem appearance = new JMenuItem("Change Appearance");
	  JMenuItem exit = new JMenuItem("Exit");
	  JMenuItem help = new JMenuItem("View Help");
	  JMenuItem about = new JMenuItem("About Game");
	  JMenuItem checkUpdate = new JMenuItem("Check for Updates");
	  
	  ActionEvent e = new ActionEvent(appearance, deckNumber, null, backgroundNumber);
	  newGame = (JMenuItem) e.getSource();
	  target1.actionPerformed(e);
	  assertNotNull(target1);

	  ActionEvent e1 = new ActionEvent(game, count, null);
	  newGame = (JMenuItem) e1.getSource();
	  target1.actionPerformed(e1);
	  assertNotNull(target1);
	  
	  ActionEvent e2 = new ActionEvent(helpMenu, count, null);
	  newGame = (JMenuItem) e2.getSource();
	  target1.actionPerformed(e2);
	  assertNotNull(target1);
	  
	  ActionEvent e3 = new ActionEvent(newGame, count, null);
	  newGame = (JMenuItem) e3.getSource();
	  target1.actionPerformed(e3);
	  assertNotNull(target1);
	  
	  ActionEvent e4 = new ActionEvent(undo, count, null);
	  newGame = (JMenuItem) e4.getSource();
	  target1.actionPerformed(e4);
	  assertNotNull(target1);
	  
	  ActionEvent e5 = new ActionEvent(hint, count, null);
	  newGame = (JMenuItem) e5.getSource();
	  target1.actionPerformed(e5);
	  assertNotNull(target1);
	  
	  ActionEvent e6 = new ActionEvent(statistics, count, null);
	  newGame = (JMenuItem) e6.getSource();
	  target1.actionPerformed(e6);
	  assertNotNull(target1);
	  ActionEvent e7 = new ActionEvent(options, count, null);
	  newGame = (JMenuItem) e7.getSource();
	  target1.actionPerformed(e7);
	  assertNotNull(target1);
	  
	  ActionEvent e8 = new ActionEvent(appearance, deckNumber, null, backgroundNumber);
	  newGame = (JMenuItem) e8.getSource();
	  target1.actionPerformed(e8);
	  assertNotNull(target1);
	  
	  ActionEvent e9 = new ActionEvent(help, count, null);
	  newGame = (JMenuItem) e9.getSource();
	  target1.actionPerformed(e9);
	  assertNotNull(target1);
	  
	  ActionEvent e10 = new ActionEvent(about, count, null);
	  newGame = (JMenuItem) e10.getSource();
	  target1.actionPerformed(e10);
	  assertNotNull(target1);
	  
	  ActionEvent e11 = new ActionEvent(checkUpdate, count, null);
	  newGame = (JMenuItem) e11.getSource();
	  target1.actionPerformed(e11);
	  assertNotNull(target1);
	  
	  ActionEvent e12 = new ActionEvent(exit, count, null);
	  newGame = (JMenuItem) e12.getSource();
	  target1.actionPerformed(e12);
	  assertNotNull(target1);
  }

}

