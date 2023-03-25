package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortune_cookie implements ActionListener{

	public void showButton() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
        System.out.println("Button clicked");
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
   }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if(rand==0) {
			JOptionPane.showMessageDialog(null, "You will become monkay");

		}else if(rand==1) {
			JOptionPane.showMessageDialog(null, "You will eat beanz");

		}else if(rand==2) {
			JOptionPane.showMessageDialog(null, "You will die in two weeks");

		}else if(rand==3) {
			JOptionPane.showMessageDialog(null, "You will live a happy life");

		}else if(rand==4) {
			JOptionPane.showMessageDialog(null, "You will read a scam fortune cookie");

		}
	}

	
}
