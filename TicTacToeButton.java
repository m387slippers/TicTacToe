/**
 * 
 */
package teamProject;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


/**
 * @author zachp
 *
 */
public class TicTacToeButton extends JButton {

	
	/**
	 * Constructor stub. Want to pass coordinate point/location in during the instantiation of the button. 
	 * On board it says something about making a call to the super constructor. 
	 */
	public TicTacToeButton(int rw, int col) {
		int row = rw;
		int column = col;
		this.setFont(new Font("Tahoma", Font.BOLD, 99));
		this.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Things that should happen when button pressed:
				 * 
				 * Turn changes.
				 * X or O appears
				 * Win is checked. 
				 * 
				 * see whose turn it is, 
				 * depending on turn, output x or o
				 * check for win condition. 
				 */
				System.out.println("X");
			}
			}
		));
	}

	
	@Override
	public String toString() {
		return "TicTacToeButton ";
	}	
	
}
