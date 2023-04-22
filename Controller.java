package teamProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** Currently, controller contains nothing.
 * 
 * @author zachp
 *
 */
public class Controller {
	/*
	 * Maybe try putting the buttons in an array and use a getter to make the
	 * buttons available to the View class. 
	 */
	static TicTacToeButton[] myArray = new TicTacToeButton[9];
	
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
				System.out.println("X");
			}
		});
		r1c1.setText("Row 1 Col 1");
		//contentPane.add(r1c1);
		myArray[0] = r1c1;
		
		TicTacToeButton r1c2 = new TicTacToeButton(1,2);
		r1c2.setText("Row 1 col 2");
		//contentPane.add(r1c2);
		myArray[1] = r1c2;
		
		
		TicTacToeButton r1c3 = new TicTacToeButton(1,3);
		r1c3.setText("row 1 col 3");
		//contentPane.add(r1c3);
		myArray[2] = r1c3;
		
		TicTacToeButton r2c1 = new TicTacToeButton(2,1);
		r2c1.setText("row 2 col 1");
		//contentPane.add(r2c1);
		myArray[3] = r2c1;
		
		TicTacToeButton r2c2 = new TicTacToeButton(2,2);
		r2c2.setText("row 2 col 2");
		//contentPane.add(r2c2);
		myArray[4] = r2c2;		
		
		TicTacToeButton r2c3 = new TicTacToeButton(2,3);
		r2c3.setText("row 2 col 3");
		//contentPane.add(r2c3);
		myArray[5] = r2c3;	
		
		TicTacToeButton r3c1 = new TicTacToeButton(3,1);
		r3c1.setText("row 3 col 1");
		//contentPane.add(r3c1);
		myArray[6] = r3c1;	
		
		TicTacToeButton r3c2 = new TicTacToeButton(3,2);
		r3c2.setText("row 3 col 2");
		//contentPane.add(r3c2);
		myArray[7] = r3c2;	
		
		TicTacToeButton r3c3 = new TicTacToeButton(3,3);
		r3c3.setText("row 3 col 3");
		//contentPane.add(r3c3);
		myArray[8] = r3c3;
	}


	
}
