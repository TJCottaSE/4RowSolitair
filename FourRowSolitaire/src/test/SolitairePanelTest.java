package test;
/**
 * Test methods for Solitaire Panel.
 * @author Tony Cotta
 */
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import javax.swing.*;

import org.testng.annotations.Test;

import FourRowSolitaire.SolitairePanel;

public class SolitairePanelTest extends JPanel {

	/**
	 * This test method ensures that a solitaire panel object
	 * can be instantiated, and that the changing of the background
	 * images works when a call to change background is made
	 * @throws Exception
	 */
	@Test
	public void SolitairePanel() throws Exception {

		SolitairePanel panel1 = new SolitairePanel();
		SolitairePanel panel2 = new SolitairePanel();
		assertEquals(panel1.getBackGroundNumber(), panel2.getBackGroundNumber());
		panel2.changeBackground(1);
		assertNotEquals(panel1.getBackGroundNumber(), panel2.getBackGroundNumber());

  }

}

