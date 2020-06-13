
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		String a = JOptionPane.showInputDialog("how many cats they have?");
		// 2. Convert their answer into an int
		int x = Integer.parseInt(a);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if(x>=3) {
		JOptionPane.showConfirmDialog(null, "they are a carzy cat lady");	
		}
		else if(x<3 && x>0) {
			playVideo("https://www.youtube.com/watch?v=XyNlqQId-nk");
		}
		else if(x==0) {
			playVideo("https://www.youtube.com/watch?v=oMFxQsaT274");
			
		}
		
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

