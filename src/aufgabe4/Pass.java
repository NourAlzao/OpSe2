package aufgabe4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.swing.JOptionPane;

public class Pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String plattform = JOptionPane.showInputDialog("Geben Sie die Webseite oder Plattform ein: ");
		int length = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Passwortlänge ein: "));
		
		String ausgabe=generatePassword(length);
		
		
		PrintWriter pw=null;
		
		try {
			pw=new PrintWriter(new FileWriter("text"));
			pw.write(plattform+ "="+ ausgabe);
			pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		

		}finally {
			pw.close();
		}
		
	}

	private static String generatePassword(int passwordlength) {
		
		String abc="qwertzuiopasdfghjklyxcvbnm";
		String caracter="0123456789"+ abc+abc.toUpperCase();
		String zeichenString ="";
		
		Random random=new Random();
		
		for (int i = 0; i < passwordlength; i++) {
			
		int position=random.nextInt(abc.length());
		zeichenString += caracter.charAt(position);
			
		}
		return zeichenString;
		
	}
}
