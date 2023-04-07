package _04_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton duck = new JButton();
	JButton frog = new JButton();
	JButton fluffy = new JButton();
	
	public void run() {
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(fluffy);
		panel.add(frog);
		panel.add(duck);
		duck.addActionListener(this);
		frog.addActionListener(this);
		fluffy.addActionListener(this);
		frame.add(panel);
		frame.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == duck ) {
			showDucks();
		} else if(arg0.getSource() == frog ) {
			showFrog();
		} else if(arg0.getSource() == fluffy ) {
			showFluffyUnicorns();
		} 
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] { 
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
}
