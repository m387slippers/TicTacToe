/**
 * must have 3 classes, use a generic collection, and read/write to a file. Plus must use a gui. 
 */
package teamProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class View extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		System.out.println("Testing the gitHub comit feature.");
	}

	/**
	 * Create the frame.
	 */
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		//create the grid layout.
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3, 0, 0));
		
		
		//extract the  method that creates all of the buttons. 
		// 
		createBoardButtons();
		
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
	private void createBoardButtons() {
		TicTacToeButton r1c1 = new TicTacToeButton(1,1);
		r1c1.setText("Row 1 Col 1");
		contentPane.add(r1c1);
		
		TicTacToeButton r1c2 = new TicTacToeButton(1,2);
		r1c2.setText("Row 1 col 2");
		contentPane.add(r1c2);
		
		TicTacToeButton r1c3 = new TicTacToeButton(1,3);
		r1c3.setText("row 1 col 3");
		contentPane.add(r1c3);
		
		TicTacToeButton r2c1 = new TicTacToeButton(2,1);
		r2c1.setText("row 2 col 1");
		contentPane.add(r2c1);
		
		TicTacToeButton r2c2 = new TicTacToeButton(2,2);
		r2c2.setText("row 2 col 2");
		contentPane.add(r2c2);
				
		TicTacToeButton r2c3 = new TicTacToeButton(2,3);
		r2c3.setText("row 2 col 3");
		contentPane.add(r2c3);
		
		TicTacToeButton r3c1 = new TicTacToeButton(3,1);
		r3c1.setText("row 3 col 1");
		contentPane.add(r3c1);
		
		TicTacToeButton r3c2 = new TicTacToeButton(3,2);
		r3c2.setText("row 3 col 2");
		contentPane.add(r3c2);
			
		TicTacToeButton r3c3 = new TicTacToeButton(3,3);
		r3c3.setText("row 3 col 3");
		contentPane.add(r3c3);
	}

}
