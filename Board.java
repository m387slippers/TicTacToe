/**
 * 
 */
package teamProject;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author zachp
 *
 */
public class Board {

	/**
	 * 
	 */
	public Board() {
		// Read in save state from file when first creating game board
		
		String[][] boardArray = new String[3][3];
		
		try (Scanner input = new Scanner((Readable) new File(TicTacToeBoard.csv))) {
			if (input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
			while (input.hasNextLine()) {
				String playerTurn = input.next();
				for (int i = 1; i < 4; i++) {
					for (int j = 1; j < 4; j++) {
						
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File TicTacToeBoard.csv could not be found");
		}
	
	}

}
