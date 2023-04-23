package teamProject;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

/** Currently, controller does not contain nothing.
 * 
 * @author zachp
 *
 */
public class Controller {
	/*
	 * I think that these fields probably shouldn't be static fields, but it's working so far so...
	 */
	static TicTacToeButton[] myArray = new TicTacToeButton[9];
	static JLabel[] secondArray = new JLabel[2];
	static boolean turn = false; 
	public static String whoseTurn;
	
	
	
	
	/**Simple getter for returning turn value, haven't done anything with this yet.
	 * @return the turn
	 */
	public static boolean isTurn() {
		return turn;
	}




	/**Determines turn order, however I've been struggling to get this to affect the text contained in the JLabel.
	 * I'm sure it's simpler than I'm making it.  
	 * @param turn the turn to set
	 */
	public static void changeTurn() {
		if (turn == false)
			{
			turn = true;
			}
		else 
			{
			turn = false;
			}
		
		System.out.println(turn);
	}




	/**
	 * This creates all of the buttons. 
	 * 
	 * Probably could and should create this dynamically.
	 * I think that r#c# should contain a method call in the setText(...) method. Then text can be set
	 * by something else. Move the functionality elsewhere, preferably to board or controller.
	 * 
	 *TODO add event handler to these buttons. 
	 * 
	 */
	public static void createBoardButtons() {
		TicTacToeButton r1c1 = new TicTacToeButton(1,1);
		r1c1.addActionListener(new ActionListener() {
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
				System.out.println("");
			}
			}
		);
		r1c1.setHorizontalTextPosition(SwingConstants.CENTER);
		r1c1.setBounds(5, 117, 135, 127);
		r1c1.setFont(new Font("Tahoma", Font.BOLD, 99));
		r1c1.setText("X");
		myArray[0] = r1c1;
		
		TicTacToeButton r1c2 = new TicTacToeButton(1,2);
		r1c2.setHorizontalTextPosition(SwingConstants.CENTER);
		r1c2.setBounds(150, 117, 135, 127);
		r1c2.setText("Row 1 col 2");
		myArray[1] = r1c2;
		
		TicTacToeButton r1c3 = new TicTacToeButton(1,3);
		r1c3.setHorizontalTextPosition(SwingConstants.CENTER);
		r1c3.setBounds(295, 117, 135, 127);
		r1c3.setText("row 1 col 3");
		myArray[2] = r1c3;
		
		TicTacToeButton r2c1 = new TicTacToeButton(2,1);
		r2c1.setHorizontalTextPosition(SwingConstants.CENTER);
		r2c1.setBounds(5, 255, 135, 127);
		r2c1.setText("row 2 col 1");
		myArray[3] = r2c1;
		
		TicTacToeButton r2c2 = new TicTacToeButton(2,2);
		r2c2.setHorizontalTextPosition(SwingConstants.CENTER);
		r2c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("center");
			}
		});
		r2c2.setBounds(150, 255, 135, 127);
		r2c2.setText("row 2 col 2");
		myArray[4] = r2c2;
				
		TicTacToeButton r2c3 = new TicTacToeButton(2,3);
		r2c3.setHorizontalTextPosition(SwingConstants.CENTER);
		r2c3.setBounds(295, 255, 135, 127);
		r2c3.setText("row 2 col 3");
		myArray[5] = r2c3;
		
		TicTacToeButton r3c1 = new TicTacToeButton(3,1);
		r3c1.setHorizontalTextPosition(SwingConstants.CENTER);
		r3c1.setBounds(5, 393, 135, 127);
		r3c1.setText("row 3 col 1");
		myArray[6] = r3c1;
		
		TicTacToeButton r3c2 = new TicTacToeButton(3,2);
		r3c2.setHorizontalTextPosition(SwingConstants.CENTER);
		r3c2.setBounds(150, 393, 135, 127);
		r3c2.setText("row 3 col 2");
		myArray[7] = r3c2;	
		
		TicTacToeButton r3c3 = new TicTacToeButton(3,3);
		r3c3.setHorizontalTextPosition(SwingConstants.CENTER);
		r3c3.setBounds(295, 393, 135, 127);
		r3c3.setText("row 3 col 3");
		myArray[8] = r3c3;
		
		JLabel lblNewLabel = new JLabel("Tic Tac Toe");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(128, 11, 188, 34);
		secondArray[0] = lblNewLabel;
		
		/*
		 * None of the approaches I've tried so far to alter the text contained in JLabel have been successful.
		 * I think that the solution is simpler than I have been making it. I'll return to this later with fresh 
		 * eyes. 
		 */
		JLabel lblNewLabel_1 = new JLabel("X's Turn");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(5, 48, 425, 58);
		secondArray[1] = lblNewLabel_1;
	}
	
		
}
