package aufgabe1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//test
		PrintWriter pw=null;
		BufferedReader br=null;
		
		try {
		
		pw=new PrintWriter(new FileWriter("name.txt"));
	    pw.println("nour");
	    pw.println("alzao");
	    pw.println("Informatik");
	    
	    br=new BufferedReader(new FileReader("name.txt"));
	    
	    String s=null;
	    
	    while((s = br.readLine()) != null) {
			System.out.println(s);
		}
		
	}catch (IOException e) {
		e.printStackTrace();
	
	}finally {
		try {
			br.close();
			pw.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	}
}
