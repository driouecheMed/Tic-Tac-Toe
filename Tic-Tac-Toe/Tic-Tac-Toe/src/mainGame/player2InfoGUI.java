
  /*****  	THIS IS A SIMILAR CLASS TO playerInfoGUI 	 ****/
/***** 	I CREATED THIS CLASS BECAUSE OF THE FRAME IS STAIC *****/
/**** SO WHEN I ONPEN PLAER 2 INFO FRAME THE FIRST ONE CLOSE  ****/
	/**** AND MY SOLUTION WAS TO CREAN A player2InfoGUI ****/

package mainGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class player2InfoGUI {

private static  JFrame player2InfoFrame = new JFrame();
	
	public player2InfoGUI(String username, int locationX, int locationY) {
		player2InfoFrame.setTitle("Player information");
		player2InfoFrame.setSize(300, 200);
		player2InfoFrame.setLocation(locationX, locationY);
		player2InfoFrame.setResizable(false);
		Image icon = Toolkit.getDefaultToolkit().getImage("..\\images\\icon.png");
		player2InfoFrame.setIconImage(icon);
		JPanel layout = new JPanel();
		layout.setLayout(null);

		background();
		labelTitle(username);
		labelUsername(username);
		labelmatchPlayed(username);
		labelScore(username);
		
		player2InfoFrame.setVisible(true);
	}
	
	public void background() {
		try {
			JLabel label = new JLabel(new ImageIcon(ImageIO.read(new File("..\\images\\playerInfo-background.png"))));
			player2InfoFrame.setContentPane(label);
		} catch (IOException e) {
			System.out.println("Image doesn't exist...");
		}
	}
	
	public void labelTitle(String username) {
		JLabel titleLabel = new JLabel(username + " stat :");
		titleLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		titleLabel.setBounds(35, 0, 250, 50);
		player2InfoFrame.getContentPane().add(titleLabel);
	}
	
	public void labelUsername(String username) {
		JLabel label1 = new JLabel( "Username :");
		label1.setFont(new Font("Arial", Font.PLAIN, 12));
		label1.setBounds(35, 60, 100, 20);
		player2InfoFrame.getContentPane().add(label1);
		JLabel label2 = new JLabel(username);
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Arial", Font.PLAIN, 12));
		label2.setBounds(120, 60, 100, 20);
		player2InfoFrame.getContentPane().add(label2);
	}
	
	public void labelmatchPlayed(String username) {
		JLabel label1 = new JLabel("Number of match played : ");
		label1.setFont(new Font("Arial", Font.PLAIN, 12));
		label1.setBounds(35, 100, 150, 20);
		player2InfoFrame.getContentPane().add(label1);
		database db = new database();
		db.charger();
		int n = db.getMatchesPlayed(username);
		db.ClosingDB();
		JLabel label2 = new JLabel(Integer.toString(n));
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Arial", Font.PLAIN, 12));
		label2.setBounds(190, 100, 200, 20);
		player2InfoFrame.getContentPane().add(label2);
	}
	
	public void labelScore(String username) {
		JLabel label1 = new JLabel(" Score : ");
		label1.setFont(new Font("Arial", Font.PLAIN, 12));
		label1.setBounds(35, 130, 100, 20);
		player2InfoFrame.getContentPane().add(label1);
		database db = new database();
		db.charger();
		int score = db.getScore(username);
		db.ClosingDB();
		JLabel label2 = new JLabel(Integer.toString(score));
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Arial", Font.PLAIN, 12));
		label2.setBounds(90, 130, 100, 20);
		player2InfoFrame.getContentPane().add(label2);
	}

	public static void close() {
		player2InfoFrame.dispose();
	}
	

}
