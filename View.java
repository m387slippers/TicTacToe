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
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	}

	/**
	 * Create the frame.
	 */
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

	
		setContentPane(contentPane);
		
		 
		// This should set the layout to absolute layout. 
		contentPane.setLayout(null);
		
		//following 3 lines make the board.
		Controller.createBoardButtons();
		for (int i = 0; i < 9; i++) {contentPane.add(Controller.myArray[i]);}
		for(int i = 0; i < 2; i++) {contentPane.add(Controller.secondArray[i]);}
	
		
	}

}