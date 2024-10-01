package praktikum2024;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Zahl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String zeile;
		String output=" ";
		BufferedReader br=null;
		
		try {
			br=new BufferedReader(new FileReader("hghg"));
			
			while((zeile=br.readLine() )!= null) {
				output += zeile;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("hhhf" + continTxt(output, "ghgh"));
	}
	
	private static int continTxt(String output, String wort) {
		
		int zahl=0;
		int index=0;
		
		while((index=output.indexOf(wort,index)) != -1) {
			zahl++;
			index +=wort.length();
			
		}
		return zahl;
	}
}
