package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
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
		buttonTwo.addActionListener(this);
		buttonThree.addActionListener(this);
		buttonFour.addActionListener(this);
		buttonFive.addActionListener(this);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == buttonOne) {
			playSound("sawing-wood.wav");
		}else if(arg0.getSource() == buttonTwo) {
			playSound("tasmanian-devil.wav");
		}else if(arg0.getSource() == buttonThree) {
			playSound("hyena-laugh.wav");
		}else if(arg0.getSource() == buttonFour) {
			playSound("analog-watch-alarm.wav");
		}else if(arg0.getSource() == buttonFive) {
			playSound("alien-spaceship.wav");
		}
	}
	
	private void playSound(String soundFile) {
		String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}
    
	
}
