package aufgabe4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.swing.JOptionPane;

public class Passport {

	

		public static String generiertPasswort(int wort) {
			String zeichen = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			Random random = new Random();
			String passwort="";
			
			for (int i = 0; i < wort; i++) {
				int index = random.nextInt(zeichen.length());
				passwort +=zeichen.charAt(index);
			}
			return passwort.toString();
		}
		
		public static void main(String[] args) {
			String plattform = JOptionPane.showInputDialog("Geben Sie eine Plattform ein?");
			int password = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die länge des Passwort ein? "));
			JOptionPane.showMessageDialog(null, "Der Passwort wurde generiert und gespeisert");
		
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
				
				
		
			

}
