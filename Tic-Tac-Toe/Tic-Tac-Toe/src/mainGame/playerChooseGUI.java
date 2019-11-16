
/****  THIS IS A GUI THAT APPEAR AFTER A SUCCESSFUL PLAYER LOGIN   ****/
  /****  THIS GUI CONTAINT 3 MODES { SOLO & FRIENDS & ONLINE }  ****/

package mainGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class playerChooseGUI extends window {

	public playerChooseGUI() {

		try {
			JLabel label = new JLabel(new ImageIcon(ImageIO.read(new File("..\\images\\choosing_mode_bg.png"))));
			frame.setContentPane(label);
		} catch (IOException e) {
			System.out.println("Image doesn't exist...");
		}

		vsComputerButton();
		vsPlayerButton();
		onlineButton();

		super.frame.setVisible(true);
	}

	public void vsComputerButton() {
		JButton computer = new JButton("Computer");
		computer.setBounds(100, 180, 200, 50);
		computer.setForeground(Color.WHITE);
		computer.setContentAreaFilled(false);
		computer.setFont(new Font("System", Font.PLAIN, 20));
		super.frame.getContentPane().add(computer);
		computer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new computerBrainGUI();
				frame.dispose();
			}
		});
	}

	public void vsPlayerButton() {
		JButton Friend = new JButton("Friend");
		Friend.setFont(new Font("System", Font.PLAIN, 20));
		Friend.setBounds(100, 290, 200, 50);
		Friend.setForeground(Color.WHITE);
		Friend.setContentAreaFilled(false);
		super.frame.getContentPane().add(Friend);
		Friend.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new loginGUI_forPlayer2();
				frame.dispose();
			}
		});
	}

	public void onlineButton() {
		JButton Online = new JButton("Online");
		Online.setFont(new Font("System", Font.PLAIN, 20));
		Online.setBounds(100, 400, 200, 50);
		Online.setForeground(Color.WHITE);
		Online.setContentAreaFilled(false);
		super.frame.getContentPane().add(Online);
		Online.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Implemented Soon..(Using Socket)", "Message",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}

}
