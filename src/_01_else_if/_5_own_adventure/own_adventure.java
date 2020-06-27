package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class own_adventure {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("you see robber come in to house! going to hide or grab gun?");
		if (a.equals("hide")) {
			JOptionPane.showConfirmDialog(null, "you hide in your closet");
			a = JOptionPane.showInputDialog("robber is coming close hide again or attack befroe robber realize you?");
			if (a.equals("hide")) {
				JOptionPane.showConfirmDialog(null, "robber shut closet and you died");
			}
		}
		else if(a.equals("grab gun")) {
			JOptionPane.showConfirmDialog(null, "enjoy CSGO in real life good luck!");
			JOptionPane.showConfirmDialog(null, "but they are skilled robber then you died");
		}
	}
}
