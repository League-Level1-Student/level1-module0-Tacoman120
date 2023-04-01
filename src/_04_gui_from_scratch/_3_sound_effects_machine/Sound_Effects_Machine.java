package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sound_Effects_Machine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton buttonOne = new JButton();
	JButton buttonTwo = new JButton();
	JButton buttonThree = new JButton();
	JButton buttonFour = new JButton();
	JButton buttonFive = new JButton();
	public void run() {
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(buttonOne);
		panel.add(buttonTwo);
		panel.add(buttonThree);
		panel.add(buttonFour);
		panel.add(buttonFive);
		frame.add(panel);
		frame.pack();
		buttonOne.addActionListener(this);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == buttonOne) {
			
		}else if(arg0.getSource() == buttonTwo) {
			
		}else if(arg0.getSource() == buttonThree) {
			
		}else if(arg0.getSource() == buttonFour) {
			
		}else if(arg0.getSource() == buttonFive) {
			
		}
	}
	
}
