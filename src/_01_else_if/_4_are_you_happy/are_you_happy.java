package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class are_you_happy {
	public static void main(String[] args) {
		String n = JOptionPane.showInputDialog("are you happy?");
		if (n.contentEquals("yes")) {
			JOptionPane.showConfirmDialog(null, "Nice! keep doing it");
		}
		else if(n.contentEquals("no")) {
			String m = JOptionPane.showInputDialog("are you buzzy?");
			if (m.contentEquals("no")) {
				JOptionPane.showConfirmDialog(null, "play videogames like League of Legends");
			}
			else if(m.contentEquals("yes")) {
				JOptionPane.showConfirmDialog(null, "then keep your work");
			}
		}
	}
}
