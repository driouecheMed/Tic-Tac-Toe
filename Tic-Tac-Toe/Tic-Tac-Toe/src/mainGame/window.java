
/****  THIS CLASS CONTAINS THE FRAME THAT THE MAJORITY OF GUI EXTANDS FROM IT  ****/

package mainGame;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class window {

	protected JFrame frame = new JFrame();

	public window() {

		frame.setTitle("Tic-Tac-Toe (V1.5.0)");
		frame.setSize(400, 550);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		Image icon = Toolkit.getDefaultToolkit().getImage("..\\images\\icon.png");
		frame.setIconImage(icon);
		JPanel layout = new JPanel();
		layout.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
