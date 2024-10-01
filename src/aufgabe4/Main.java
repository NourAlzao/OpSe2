package aufgabe4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String plattform = JOptionPane.showInputDialog("Geben Sie die Webseite oder Plattform ein: ");
		int length = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Passwortlänge ein: "));

		String password = generatePassword(length);
		
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileWriter("passwords.txt",true));
			pw.write(plattform + " = " + password);
			pw.flush();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			pw.close();
		}
	}
	public static String generatePassword(int passwordlength) {
		
		String abc = "abcdefghijklmnopqrstuvwxyz";
		
		String character = "0123456789" + abc + abc.toUpperCase();
		
		Random random = new Random();
		
		String password = "";
		
		for (int i = 0; i < passwordlength; i++) {
			
		int position = random.nextInt(character.length());
			
		password += character.charAt(position);
		}
		
		return password;
	}
}

