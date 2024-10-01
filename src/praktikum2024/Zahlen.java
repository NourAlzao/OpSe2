package praktikum2024;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Zahlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String zeile;
		String str=" ";
		BufferedReader output=null;
		
		try {
			
			output= new BufferedReader( new FileReader("hp1.txt"));
			
			while((zeile = output.readLine()) != null) {
				str += zeile;
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		
		}finally {
			try {
				
				if(output != null) {
					output.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
				
			}
		}
		
		System.out.println("Wort Fluffy" + wortinText( str,"Fluffy"));
		
	}
	
	
	private static int wortinText(String output, String wort) {
		
		int zahl=0;
		int index=0;
		
		while((index =output.indexOf(wort,index)) != -1) {
			zahl++;
			output +=wort.length();
		}
		return zahl;
		
	}
	
}