package gabe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fluffys ;
        String zeile = "";
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("hp1.txt"));
		//	String line = null;
		
			while((fluffys = br.readLine()) != null) {
				zeile += fluffys;
			}
		} catch (IOException e) {
			e.printStackTrace();
		
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	
		System.out.println("Count Fluffy: " + countWords(zeile, "Fluffy"));
	}
	
	private static int countWords(String fullString, String word) {
		
		return (fullString.length() - fullString.replace(word, "").length()) / word.length();
	}
}
