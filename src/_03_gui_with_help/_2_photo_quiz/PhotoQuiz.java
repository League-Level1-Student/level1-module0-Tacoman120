package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
		String url = "https://www.amnh.org/var/ezflow_site/storage/images/media/amnh/images/explore/ology-images/brain/optical-illusions/op-illusions-listing-hero/3877180-1-eng-US/op-illusions-listing-hero_twittershare_1024.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component component = createImage(url);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
		quizWindow.add(component);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question = JOptionPane.showInputDialog(null, "Is this image moving or staying still?");
		// 7. print "CORRECT" if the user gave the right answer
		if(question.equalsIgnoreCase("staying still")) {
			System.out.println("CORRECT");
		}else {
			System.out.println("INCORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(component);
		// 10. find another image and create it (might take more than one line
		// of code)
		String urlTwo = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/be/Checker_shadow_illusion.svg/200px-Checker_shadow_illusion.svg.png";
		Component componentTwo = createImage(urlTwo);
		// 11. add the second image to the quiz window
			quizWindow.add(componentTwo);
		// 12. pack the quiz window
			quizWindow.pack();
		// 13. ask another question
			String questionTwo = JOptionPane.showInputDialog(null, "Is square A and square B the same or different color?");
		// 14+ check answer, say if correct or incorrect, etc.
			if(questionTwo.equalsIgnoreCase("same")) {
				System.out.println("CORRECT");
			}else if(questionTwo.equalsIgnoreCase("same color")) {
				System.out.println("CORRECT");
			}else if(questionTwo.equalsIgnoreCase("the same color")) {
				System.out.println("CORRECT");
			}else {			
				System.out.println("INCORRECT");
			}
	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
